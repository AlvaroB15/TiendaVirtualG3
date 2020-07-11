package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.impl.FactoryAddress;

public class Customer {
    private String id;
    private String name;
    private String address;
    //private FactoryAddress factoryAddress = new FactoryAddress();
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addressType) {
        this.address = new FactoryAddress().getAddress(addressType).toString();
    }
}