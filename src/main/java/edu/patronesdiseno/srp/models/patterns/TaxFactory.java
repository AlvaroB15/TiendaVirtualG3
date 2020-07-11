package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.TaxInternet;
import edu.patronesdiseno.srp.models.interfaces.ITax;

public class TaxFactory {
    

public static ITax getTax(String tipo){

    if(tipo.equals("internet")){
        return new TaxInternet();
    }else{
        return null;
    }
 
}

}