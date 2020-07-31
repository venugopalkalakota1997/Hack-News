import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AnthenticationService {

  loggedInUser = { loggedOut: true };
  isLoggedIn: boolean;
  validCredentials: boolean = false;
  accessToken: string;
  redirectUrl = '/';
  loggedIn: boolean = false;
  name: string;
  authUrl = environment.authUrl;
  private token: string;
  error: any;
  suffix: string;
  username: any;
  isLoggedInValid: boolean = false;
  LoggedIn: any;

  constructor(private router: Router, private httpClient: HttpClient) { }

  authenticateUser(user) {
    this.isLoggedIn = true;
    this.suffix = "u"


    this.authenticateSpring(user.empid, user.password).subscribe((data) => {
      this.username = user.empid;
      this.loggedInUser = user;
      this.validCredentials = true;
      this.loggedIn = true;
      //this.setToken(data.token);
      localStorage.setItem("token",data.token)
      this.name = user.empid;



      if (data.role == "ROLE_u") {

        this.router.navigate(['home']);
      }
      else {
        this.router.navigate(['login']);
      }
    },
      (error) => {

        this.validCredentials = false;
        this.isLoggedInValid = true;
        this.error = error.error.message;
        if (error.error.errors != null) {
          this.error = error.error.errors[0];

        }
      }
    )
  }

  public setToken(token: string) {
    this.token = token;
  }
  public getToken() {
    return this.token;
  }

  authenticateSpring(user: any, password: string): Observable<any> {
    var newUser = user + this.suffix
  
    let credentials = btoa(newUser + ':' + password);
    let headers = new HttpHeaders();

    headers = headers.set('Authorization', 'Basic ' + credentials)
    return this.httpClient.get(this.authUrl, { headers })
  }
  
}
