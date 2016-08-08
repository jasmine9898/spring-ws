package com.bstek.bdf.webservice.demo;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
 
@Endpoint
public class UserServiceEndpoint{
 
    @PayloadRoot(namespace=" http://www.bstek.com/ws/demo",localPart="UserRequest")
    @ResponsePayload
    public UserResponse findUsers(@RequestPayload UserRequest request) throws Exception{
        List<User> userList=new ArrayList<User>();
        for(int i=0;i<request.getUserCount();i++){
            User u=new User();
            u.setBirthday(new Date());
            u.setGender(true);
            u.setUsername("从WS中取到的User "+i);
            u.setEmail("bstek.user"+i+".bstek.com");
            userList.add(u);
        }
        for(int i=0;i<100;i++){
            Thread.sleep(50);
        }
        UserResponse res=new UserResponse();
        res.setUsers(userList);
        return res;
    }
}