import { Component, OnInit } from '@angular/core';

import { Car } from '../cars/models/cars';
import { CarsService } from '../cars/cars.service';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.scss']
})
export class CarComponent implements OnInit {

  car:Car

  constructor(private carsService:CarsService) { }

  ngOnInit() {
    this.carsService.getCar().subscribe(myCar => this.car = myCar)
  }

}
