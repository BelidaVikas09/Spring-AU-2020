import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AppComponent} from './app.component';
import { FormCompComponent } from './form-comp/form-comp.component';
import { DisplaycompComponent } from './displaycomp/displaycomp.component';
const routes: Routes = [
  {path:'home',component:FormCompComponent},
  {path:'form',component:FormCompComponent},
  {path:'display',component:DisplaycompComponent},
  {path:'',redirectTo:"home",pathMatch:"full"},
  {path:'**', component:AppComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
