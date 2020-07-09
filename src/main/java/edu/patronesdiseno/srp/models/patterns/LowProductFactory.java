package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.ConditionProduct;
import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.LowRangeLineProduct;
import edu.patronesdiseno.srp.models.Maintenance;
import edu.patronesdiseno.srp.models.StandardMaintenance;
import edu.patronesdiseno.srp.models.UsedProduct;

public class LowProductFactory implements IProductFactory {

    @Override
    public LineProduct getLineProduct() {

        return new LowRangeLineProduct();
    }

    @Override
    public Maintenance getMaintenance() {

        return new StandardMaintenance();
    }

    @Override
    public ConditionProduct getConditionProduct() {

        return new UsedProduct();
    }
    
}