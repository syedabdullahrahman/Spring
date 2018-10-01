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

    private int id;
    private String name;
    private Address address;
    private List<Address> ad_list;
    private List<String> sur;

    public Employee() {
        System.out.println("defcons");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, Address address, List<Address> ad_list, List<String> sur) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ad_list = ad_list;
        this.sur = sur;
    }

    public Employee(int id, String name, Address address, List<Address> ad_list) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ad_list = ad_list;
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address);
        for (Iterator<Address> iterator = ad_list.iterator(); iterator.hasNext();) {
            Address next = iterator.next();
            System.out.println(next);

        }
        for (Iterator<String> iterator = sur.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
