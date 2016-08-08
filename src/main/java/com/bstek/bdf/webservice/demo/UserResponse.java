package com.bstek.bdf.webservice.demo;
 
import java.util.List;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserResponse {
    private List<User> users;
 
    public List<User> getUsers() {
        return users;
    }
 
    public void setUsers(List<User> users) {
        this.users = users;
    }
}