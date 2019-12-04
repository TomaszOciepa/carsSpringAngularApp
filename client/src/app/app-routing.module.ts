import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {  CarsComponent } from './cars/cars.component';
import {  CarComponent } from './car/car.component';

const routes: Routes = [
  {path:'cars', component: CarsComponent},
  {path:'car', component: CarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
