import { Component, OnInit,} from '@angular/core';
import { OrderService } from 'src/app/order.service';
import { NgForm } from '@angular/forms';




@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css'],
  providers:[OrderService]
})
export class OrdersComponent implements OnInit {
  Orders: OrderService;
  constructor(Orders: OrderService){
    this.Orders = Orders;
    
    
   }

  ngOnInit(){}
  
  addOrden(form?: NgForm){
    this.Orders.postOrder(form.value).subscribe(respuesta=>{ console.log(respuesta);});
    //console.log(form.value);
  }
  
}
