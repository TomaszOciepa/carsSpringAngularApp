import { Component, OnInit } from '@angular/core';
import { CarsService } from './cars.service';
import { Car } from './models/cars';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.scss']
})
export class CarsComponent implements OnInit {

  myCars:Car

  constructor(private carsService: CarsService) { }

  ngOnInit() {
    this.carsService.getCars().subscribe(carList => this.myCars = carList) 
  }

}
