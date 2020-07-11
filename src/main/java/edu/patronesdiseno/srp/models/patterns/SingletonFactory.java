package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.interfaces.IDiscount2;

public class SingletonFactory implements IDiscount2 {

    private CouponDiscount couponDiscount;

    @Override
    public synchronized  CouponDiscount create() {
        if(this.couponDiscount == null){
            couponDiscount = new CouponDiscount();
        }
        return couponDiscount;
    }
    
}