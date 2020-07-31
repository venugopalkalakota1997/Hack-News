import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { AnthenticationService } from '../services/anthentication.service';

import { HttpErrorResponse } from '@angular/common/http';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  signUpForm: FormGroup;
  userAdded: boolean = false;
  signupErrorMessage: any;
  newUserAdded: boolean = true;

  constructor(private formBuilder: FormBuilder, private _authService: AnthenticationService, private _userService: EmployeeService) { }

  ngOnInit() {
    
    this.signUpForm = this.formBuilder.group({
      empid: ['', [
        Validators.required,
        Validators.pattern("^[0-9]*$")
      ]],
      useremail: ['', [
        Validators.required,
        Validators.pattern("[^ @]*@[^ @]*")
      ]],
      firstname: ['', [
        Validators.required
      ]],
      lastname: ['', [
        Validators.required,
      ]],
      password: ['', [
        Validators.required,
        Validators.maxLength(50)
      ]],
      confirmPassword: ['', [
        Validators.required,
        this.matchConfirmPassword.bind(this)
      ]]
    })
  }
  get empid() {
    return this.signUpForm.get('empid');
  }
  get useremail() {
    return this.signUpForm.get('useremail');
  }
  get firstname() {
    return this.signUpForm.get('firstname');
  }
  get lastname() {
    return this.signUpForm.get('lastname');
  }
  get password() {
    return this.signUpForm.get('password');
  }
  get confirmPassword() {
    return this.signUpForm.get('confirmPassword');
  }
  get schoolname(){
    return this.signUpForm.get('schoolname');
  }
  matchConfirmPassword(formControl: FormControl): { [s: string]: boolean } {
    if (this.signUpForm) {
      if (formControl.value && formControl.value.length > 0 && formControl.value !== this.signUpForm.get('password').value) {
        return { 'nomatch': true };
      }
    }
    return null;
  }

 

  addUser(signUpForm) {

    
      let user: any =
      {
        
        "id":signUpForm.empid,
        "userName": signUpForm.useremail,
        "firstName": signUpForm.firstname,
        "lastName": signUpForm.lastname,
        "password": signUpForm.password,
      }

      this._userService.EmployeeSignUp(user).subscribe((response) => {
        this.newUserAdded = false;
        this.userAdded=true;
        this.signupErrorMessage = null;
      }, (error: HttpErrorResponse) => {
        this.newUserAdded = true;
        this.signupErrorMessage = error.message;
        if (error instanceof Error) {
        } else {
        }
      })

    
  }
}
