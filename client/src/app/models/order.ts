import { OrderItems } from './order-items';

export class Order {

    id: string;
    address: string;
    courier: string;
    orderItems: OrderItems[]=
    [   {
        "idProduct":  "123",
        "quantity":   10,
        "price":      20
        },
        {
            "idProduct":  "456",
            "quantity":   771,
            "price":     30
        }
    ];
    

    constructor(id=null,address=null,courier=null){
        this.id = id;
        this.address = address;
        this.courier=courier;
    }

    imprime(){
    console.log(this.id);
    }
}
