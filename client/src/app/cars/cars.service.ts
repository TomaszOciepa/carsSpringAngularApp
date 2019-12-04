import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Car } from './models/cars';


@Injectable({
  providedIn: 'root'
})
export class CarsService {

  api_url = 'http://localhost:8080/cars'
getCars(){
    return this.http.get<Car>(this.api_url)
}

  constructor(private http:HttpClient) { }
}
