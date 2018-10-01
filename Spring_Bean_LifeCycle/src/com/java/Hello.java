/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author User
 */
public class Hello implements InitializingBean,DisposableBean{
    private String message;
//    Hello(){
//        
//    }
//    public Hello(String message) {
//        this.message = message;
//    }

    public String getMessage() {
        return message;
    }
    public void init(){
        System.out.println("Before init");
    }

    public void setMessage(String message) {
        this.message = message;
    }  

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialzation");
        }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying");
        }
}
