export class OrderItems {

    idProduct:  string;
    quantity:   number;
    price:      number;

    constructor(idProduct=null,quantity=null,price=null){
        this.idProduct=idProduct;
        this.price=price;
        this.quantity=quantity;
    }
}
