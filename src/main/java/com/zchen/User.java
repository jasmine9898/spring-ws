package com.zchen;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Zhouce Chen
 * @version May 19, 2014
 */
@XmlRootElement(name = "user",namespace ="http://spring-ws/service/zchen")
public class User {
    private int id;
    private String name;
    public User() {
    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
/*    public int getId() {
        try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        return id;
    }
    public void setId(int id) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.id = id;
    }
    public String getName() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
    public void setName(String name) {
        try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        this.name = name;
    }*/
    public String getUser() {
       try {
           Thread.sleep(200);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        return "Id: " + id + ", Name: " + name;
    }
}
