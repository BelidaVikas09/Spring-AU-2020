import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormCompComponent } from './form-comp/form-comp.component';
import { DisplaycompComponent } from './displaycomp/displaycomp.component';

@NgModule({
  declarations: [
    AppComponent,
    FormCompComponent,
    DisplaycompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
