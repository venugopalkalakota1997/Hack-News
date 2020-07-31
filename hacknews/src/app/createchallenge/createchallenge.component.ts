import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup, FormArray, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { ChallengeService } from '../services/challenge.service';
import { HttpErrorResponse } from '@angular/common/http';
import { AnthenticationService } from '../services/anthentication.service';

@Component({
  selector: 'app-createchallenge',
  templateUrl: './createchallenge.component.html',
  styleUrls: ['./createchallenge.component.css']
})
export class CreatechallengeComponent implements OnInit {
  createChallengeForm: FormGroup;
  newChallengeAdded: boolean = false;
  createErrorMessage: any;
  tagslist: any;
  user: any

  constructor(private formBuild: FormBuilder, private challengeservice: ChallengeService, private authservice: AnthenticationService) { }

  ngOnInit() {
    this.createChallengeForm = this.formBuild.group({
      challengename: ['', [
        Validators.required
      ]],
      descrption: ['', [
        Validators.required
      ]],
      tags:[]
    })


    this.challengeservice.getalltags().subscribe((response) => {
      this.tagslist = response
      
    })


    this.challengeservice.getuser(this.authservice.name).subscribe((response) => {
      this.user = response;
    })
  }

  get challengename() {
    return this.createChallengeForm.get('challengename');
  }

  get descrption() {
    return this.createChallengeForm.get('descrption');
  }
  get tags() {
    return this.createChallengeForm.get('tags');
  }
  createChallenge(createChallengeForm) {
    let challenge: any = {
      "id": 0,
      "title": createChallengeForm.challengename,
      "description": createChallengeForm.descrption,
      "tags":{'id':createChallengeForm.tags.id,'name':createChallengeForm.tags.name},
      "user": this.user
    }
    this.challengeservice.createChallenge(challenge).subscribe((response) => {
      //alert(response)
      this.newChallengeAdded = true;
      this.createErrorMessage = null;
    }, (error: HttpErrorResponse) => {
      this.createErrorMessage = error.message;
      if (error instanceof Error) {
      } else {
      }
    })
  }


}
