package edu.patronesdiseno.srp.controllers.impl;

import edu.patronesdiseno.srp.models.interfaces.IAddress;

public class HomeAddress implements IAddress {
    private String address;
   // private String id;
    //private String name;


public HomeAddress(String address) {
    this.address=address;
}

    @Override
    public void send(){
       // return address;
        System.out.println("notification sent");
        System.out.println(address);
    }

    @Override
    public void received(){
        System.out.println("notification received");
        System.out.println(address);
    }
}