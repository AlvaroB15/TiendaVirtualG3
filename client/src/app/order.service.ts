import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Order } from './models/order';


@Injectable({
  providedIn: 'root'
})
export class OrderService {
  ordenes: Order[];
  Order: Order;
  readonly url ='http://localhost:7000/api/order';
  constructor(private http: HttpClient) {  
    this.Order = new Order();
    
  }

  postOrder(order: Order){
    return this.http.post(this.url,this.Order);
  }

  /*id: string;
  address: string;
  url = 'api/order';
  
  addOrder(id,address):void{
  this.id = id;
  this.address = address;
  

  console.log("los metio"+this.id+" " + this.address);
  }
   
  
  postProfile(){
    return this.http.post(this.url,
     {
      id: this.id,
      address: this.address
      }
    );
  }
*/
}
