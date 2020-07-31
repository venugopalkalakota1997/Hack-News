import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AnthenticationService } from './anthentication.service';
import { Subject } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Employee } from '../Iterfaces/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private _httpClient: HttpClient, private _authService: AnthenticationService) { }
  private subject = new Subject<any>();
  adduserUrl = environment.add;
  EmployeeSignUp(userSignUpData: Employee) {
    
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    return this._httpClient.post<Employee>(this.adduserUrl , userSignUpData,{ headers });
  }
}
