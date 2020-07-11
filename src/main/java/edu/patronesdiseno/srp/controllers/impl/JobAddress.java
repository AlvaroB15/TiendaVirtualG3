package edu.patronesdiseno.srp.controllers.impl;

import edu.patronesdiseno.srp.models.interfaces.IAddress;

public class JobAddress implements IAddress {
    private String address;

    public JobAddress(String address) {
        this.address=address;

    }

    @Override
    public void send() {
        System.out.println("notification sent");
        System.out.println(address);
    }

    @Override
    public void received() {
        System.out.println("notification received");
        System.out.println(address);
    }
}