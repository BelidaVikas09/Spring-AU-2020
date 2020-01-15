import { Component,OnInit } from '@angular/core';
import {ServeService} from './serve.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'app';
  data=[];
  constructor(public serve: ServeService){};
  ngOnInit(){
    this.data=this.serve.get();
    console.log(this.data);
  }

    
}
