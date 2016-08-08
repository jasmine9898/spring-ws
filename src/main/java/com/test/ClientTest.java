package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.zchen.User;

public class ClientTest {
	public static void main0(String[] args) {  
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();  
        marshaller.setClassesToBeBound(User.class);  
        WebServiceTemplate template = new WebServiceTemplate(marshaller);  
        User user = new User(1, "qqq");  
        User returnUser = (User) template.marshalSendAndReceive("http://localhost:8280/spring-ws/service/user.wsdl", user);  
        System.out.println(returnUser);  
    } 
	
}
