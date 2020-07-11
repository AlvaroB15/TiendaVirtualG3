package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.ITax;

public class TaxInternet implements ITax {

    @Override
    public Double getTax() {

        return 0.18;
    }
    
}