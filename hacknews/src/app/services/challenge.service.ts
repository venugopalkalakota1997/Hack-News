import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AnthenticationService } from './anthentication.service';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ChallengeService {
 

  constructor(private _httpClient: HttpClient, private _authService: AnthenticationService) { }

  challenge=environment.challenge;
  getallchallenges() {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/all" , { headers })
  }


  createChallenge(challenge: any) {
   // alert(JSON.stringify(challenge))
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
   // alert(JSON.stringify(headers));
    return this._httpClient.post<any>(this.challenge + "/create" , challenge, { headers })
  }


  getuser(user:any){
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/user/" + user , { headers })
   }

   upvote(id:any){
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.put<any>(this.challenge + "/upvote/" +id , { headers })
   }

   contribute(name:any,id:any){
     alert(name+id)
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.post<any>(this.challenge + "/contribute/" +id + "/"+name, { headers })
   }

   getalltags() {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/tags" , { headers })
  }
  getfilteredchallenges(id:any) {
   
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/tags/"+id , { headers })
  }
  
  myChallenge(id:any) {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/mychallenges/" +id, { headers })
  }

  sortbydate() {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
    //alert(JSON.stringify(headers));
    return this._httpClient.get<any>(this.challenge + "/recent", { headers })
  }
  
}
