package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.controllers.impl.HomeAddress;
import edu.patronesdiseno.srp.controllers.impl.JobAddress;
import edu.patronesdiseno.srp.models.interfaces.IAddress;


public class FactoryAddress {

    public IAddress getAddress(String motor){

        if(motor.equals("home")){
        return new HomeAddress(motor);
        }
        if(motor.equals("job")){
            return new JobAddress(motor);
        }
        return null;
    }
    
}