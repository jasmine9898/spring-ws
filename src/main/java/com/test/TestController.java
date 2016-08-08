package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.liul.test.spring_ws_test.service.SayHello;
import com.liul.test.spring_ws_test.service.SayHelloImpl;
import com.zchen.User;

@Controller
public class TestController {

	@RequestMapping("hello.do")
	public void hello(){

	}
//http://localhost:8280/spring-ws/user.wsdl
	public String hhh(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(User.class);
		WebServiceTemplate template = new WebServiceTemplate(marshaller);
		User user = new User(123, "000");
		User returnUser = (User)template.marshalSendAndReceive("http://localhost:8080/spring-ws/service/user", user);
		return user.getUser();
	}
	@RequestMapping("client.do")
	@ResponseBody
	public String springwsclient(){
		/*Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(User.class);
        WebServiceTemplate template = new WebServiceTemplate(marshaller);
        User user = new User(1, "qqq");
        User returnUser = (User) template.marshalSendAndReceive("http://localhost:8080/spring-ws/service/user", user);  */
		return "springws-client : "+hhh();
	}
	@RequestMapping("springws2.do")
	
	public void springwsclient2(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();  
        marshaller.setClassesToBeBound(SayHelloImpl.class);  
        WebServiceTemplate template = new WebServiceTemplate(marshaller);
       //System.out.println(template.marshalSendAndReceive("http://localhost:8280/spring-ws/service/say"));
	    
	}
}
