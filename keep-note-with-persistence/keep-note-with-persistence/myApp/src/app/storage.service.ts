import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Notes } from './notes';

@Injectable({
  providedIn: 'root'
})
export class StorageService {
  private url:string="http://localhost:3000/notes";

  getData():Observable<Notes[]>{  
    return this.http.get<Notes[]>(this.url);
      
  }

  pushData(data:Notes):Observable<any>{
    const headers = { 'content-type': 'application/json'}
    const body=JSON.stringify(data);
    return this.http.post(this.url,body,{'headers':headers})
  }
  constructor(private http:HttpClient) { }
}
