import { Component, OnInit } from '@angular/core';
import { ServeService } from '../serve.service';
@Component({
  selector: 'app-displaycomp',
  templateUrl: './displaycomp.component.html',
  styleUrls: ['./displaycomp.component.scss']
})
export class DisplaycompComponent implements OnInit {
  data=[] 
  constructor(public serveService:ServeService){}
  ngOnInit() {
         this.data=this.serveService.get();                   
  }

}
