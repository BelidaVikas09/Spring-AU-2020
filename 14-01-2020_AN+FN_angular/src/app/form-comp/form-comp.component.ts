import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup} from '@angular/forms';
import { ServeService } from '../serve.service';
@Component({
  selector: 'app-form-comp',
  templateUrl: './form-comp.component.html',
  styleUrls: ['./form-comp.component.scss']
})
export class FormCompComponent{

constructor(public serveService:ServeService){}

ProfileForm=new FormGroup(
{
  firstName: new FormControl(''),
  lastName: new FormControl(''),
  Age: new FormControl(''),
  Phone:new FormControl(''),
});
onSubmit(){
  console.log(this.ProfileForm.value);
  this.serveService.set(this.ProfileForm.value)
}
        
}
