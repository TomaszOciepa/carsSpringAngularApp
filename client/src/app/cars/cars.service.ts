import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Car } from './models/cars';
import { share } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CarsService {

  api_url = 'http://localhost:8080/'

  user_request = this.http.get<Car>(this.api_url+'car?id='+2)
  .pipe(
    share()
  )

getCars(){
    return this.http.get<Car>(this.api_url+'cars')
}

getCar(){
return this.user_request
}

  constructor(private http:HttpClient) { 
    
  }
}
