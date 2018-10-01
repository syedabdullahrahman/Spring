/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class Employee {
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }


    public Employee() {
        System.out.println("defcons");
    }

    void show() {
        System.out.println(address);
    }
}
