import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AnthenticationService } from '../services/anthentication.service';

declare var FB: any;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
 
  loginForm: FormGroup
  changeType: boolean;
  isType: boolean = true;
  
  
  constructor(private formBuild: FormBuilder, private authService: AnthenticationService, private router: Router) { }

  ngOnInit() {
    this.loginForm = this.formBuild.group({
      empid: ['', [
        Validators.required,
        Validators.pattern("^[0-9]*$")
      ]],
      password: ['', [
        Validators.required
      ]]
    })
  }

  get empid() {
    
    return this.loginForm.get('empid');
  }
  get password() {
    return this.loginForm.get('password');
  }
  toSignup() {
    this.router.navigate(['signup'])
  }
   
 
}
