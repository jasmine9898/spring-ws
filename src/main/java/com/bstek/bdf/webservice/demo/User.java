package com.bstek.bdf.webservice.demo;
 
import java.util.Date;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="User",namespace="http://www.bstek.com/ws/demo")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    private String username;
    private Date birthday;
    private boolean gender;
    private String email;
    private Dept dept;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Dept getDept() {
        return dept;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "User [username=" + username + ", birthday=" + birthday
                + ", gender=" + gender + ", email=" + email + ", dept=" + dept
                + "]";
    }
}