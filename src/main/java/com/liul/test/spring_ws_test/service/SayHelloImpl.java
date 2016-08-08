package com.liul.test.spring_ws_test.service;
import org.springframework.stereotype.Service;
@Service
public class SayHelloImpl implements SayHello {
	public String sayHello(String name){
		return name+":Hello!";
	}
}