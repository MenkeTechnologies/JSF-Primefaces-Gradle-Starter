package com.jakobmenke.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class WelcomeBean {
    private String message = "Learning JSF is fun";

    public WelcomeBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}

