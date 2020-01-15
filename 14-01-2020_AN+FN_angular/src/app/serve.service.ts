import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServeService {
   data=[];
   set(message){
     //console.log(message); 
     this.data.push(message);
   }
   get(){
     return this.data;
   }

}
