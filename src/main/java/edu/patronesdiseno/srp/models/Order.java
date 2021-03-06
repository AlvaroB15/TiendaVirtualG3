package edu.patronesdiseno.srp.models;

import java.util.List;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import edu.patronesdiseno.srp.models.interfaces.ITax;

public class Order {

    private String id;
    private Double amount;
    private String address;
    private String courier;
    private Double discount;
    private String customer;
    private Double tax;
    
    private List<IOrderItem> orderItems;

    public List<IOrderItem> getOrderItems() {
        //List<IOrderItem> ordersItems = new ArrayList<>();
        /*
         * Get logic, ORM, SQL
         */
        return orderItems;
    }

    public void setOrderItems(List<IOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double calculateTotalOrder(IDiscount iDiscount, ITax iTax) {
        final List<IOrderItem> ordersItems = this.getOrderItems();

        Double totalPrice = 0.0;


        for (final IOrderItem item : ordersItems) {
            totalPrice += item.getPrice();
        }

        if (iDiscount != null)   {
            this.discount = iDiscount.getDiscount();
            this.amount = totalPrice - this.discount;
            this.tax = totalPrice*iTax.getTax();
        }else{
            this.discount = 0.0;
            this.tax = 0.0;
            this.amount = totalPrice;
        }

        return totalPrice;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    

}