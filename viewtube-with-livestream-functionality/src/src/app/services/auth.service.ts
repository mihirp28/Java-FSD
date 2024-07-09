import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private httpClient: HttpClient) { }

  isLoggedIn: boolean = false;
  redirectUrl: string = "";

  url :string = 'http://localhost:3000/Login';

  //userDetails:Array<any> =[]

  login(data:any) {

    this.isLoggedIn = true;
    //this.userDetails = data;

    // console.log("userDetails");
    // console.log(this.userDetails);
  }

  
  // post(data:any)
  // {
  //   const observable = this.httpClient.post<any>(this.url,data);
  //   return observable;
  // }

  // getData()
  // {
  //   console.log("inside getData Method");
  //   return this.httpClient.get<any>(this.url);
  // }

}
