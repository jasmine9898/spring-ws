package com.bstek.bdf.webservice.demo;


public class DemoWebserviceClient {
	/*public static void main(String[] args) throws Exception{
        WebServiceClient client=new WebServiceClient();
//设置目标webservice地址，这个可以在WSDL文档当中看到
    client.setDefaultUri("http://localhost:8280/spring-ws/service/demo.wsdl");
//设置服务验证方式，我们这里采用Username Token用户密码加密方式 ，默认我们的服务端要求用户名与密码相同即可通过认证
client.setUsernameToken("admin", "admin", true);
//添加JAXB2支持
        client.setMarshallerUnmarshallerClass(new Class[]{User.class,UserResponse.class,UserRequest.class});
        UserRequest request=new UserRequest();
        request.setUserCount(20);
//向目标WebService发送请求，并将响应结果通过JAXB2转换成Java对象
UserResponse response=(UserResponse)client.marshalSendAndReceive(request);
        int i=1;
        for(User user:response.getUsers()){
//打印响应结果
            System.out.println("webservice 产生的用户"+i+":"+user);
            i++;
        }
    }
	*/
	
}

