package com.bstek.bdf.webservice.demo;
 
import javax.xml.XMLConstants;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(namespace="http://www.bstek.com/ws/demo",name="UserRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserRequest {
	//        @XmlElement(namespace=Constants.DEMO_NAMESPACE)
    @XmlElement(namespace="")
    private int userCount;
    public int getUserCount() {
        return userCount;
    }
 
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
}