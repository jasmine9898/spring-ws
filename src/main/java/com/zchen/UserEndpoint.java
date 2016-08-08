package com.zchen;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Zhouce Chen
 * @version May 19, 2014
 */
@Endpoint
public class UserEndpoint {

    @PayloadRoot(localPart = "user", namespace ="http://spring-ws/service/zchen")
    @ResponsePayload
    public User handle(@RequestPayload User user) throws Exception {
        try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return user;
    }
}
