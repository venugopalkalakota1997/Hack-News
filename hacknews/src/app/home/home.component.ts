import { Component, OnInit } from '@angular/core';
import { AnthenticationService } from '../services/anthentication.service';
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { ChallengeService } from '../services/challenge.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  loggedIn:boolean=true;
  challengelist: any;
  isSchool: boolean;
  mychallenge:boolean=false;
  contributelist:any
  tagslist: any;
  loggedforvoting: boolean=true;
  loggedforcontribute: boolean=true;
  upvoted:boolean=false;
  ErrorMessage: string;
  contributed: boolean=false;
  constructor(private challenge: ChallengeService, private auth: AnthenticationService, private router: Router) { }

  ngOnInit() {
    this.challenge.getalltags().subscribe((response) => {
      this.tagslist = response
      //alert(JSON.stringify(this.tagslist))
    })


    this.challenge.getallchallenges
      ().subscribe((response) => {
        this.challengelist = response;
       // alert(JSON.stringify(this.challengelist))
      }, (error: HttpErrorResponse) => {
        if (error instanceof Error) {
        } else {
        }
      }
      );
  }
  creatChallenge() {
    if (this.auth.isLoggedIn) {
   
      this.router.navigate(['create'])
    }
    else{
      this.loggedIn=false
      this.router.navigate(['home'])
    }
   
  }
  upvote(id: any) {
    if (this.auth.isLoggedIn) {
      this.challenge.upvote(id).subscribe((response) => { 
        this.ngOnInit();
       }, (error: HttpErrorResponse) => {});
    }
    else{
      this.loggedforvoting=false
      this.router.navigate(['home'])
    }
   
  }

  contribute(id:any){
    if (this.auth.isLoggedIn) {
      this.challenge.contribute(this.auth.name,id).subscribe((response) => {
        this.contributed=true;
        this.ErrorMessage=null;
      }, (error: HttpErrorResponse) =>{
        this.ErrorMessage = error.message;
      });
    }
    else{
      this.loggedforcontribute=false
      this.router.navigate(['home'])
    }
   
  }

  myChallenge(){
    this.mychallenge=true;
    this.challenge.myChallenge(this.auth.name).subscribe((response) => {
      
      this.contributelist = response;
     // alert(JSON.stringify(this.contributelist))
    }, (error: HttpErrorResponse) =>{});
  }

  filterSelected(selectedValue:string){
    this.challenge.getfilteredchallenges(selectedValue).subscribe((response) => {
      this.challengelist = response;
    //  alert(JSON.stringify(this.challengelist))
    }, (error: HttpErrorResponse) => {
      if (error instanceof Error) {
      } else {
      }
    }
    );
  
  }
  sortbydate(){
    this.challenge.sortbydate
    ().subscribe((response) => {
      this.challengelist = response;
     // alert(JSON.stringify(this.challengelist))
    }, (error: HttpErrorResponse) => {
      if (error instanceof Error) {
      } else {
      }
    }
    );
  }
  challenges(){
    this.ngOnInit()
  }
}
