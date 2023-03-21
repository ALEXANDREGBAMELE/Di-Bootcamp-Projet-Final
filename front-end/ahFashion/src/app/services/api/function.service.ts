import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { User } from "../../models/user";
import { HttpService } from "./api.service";
import { Design } from "src/app/models/design";

@Injectable({
  providedIn : 'root'
})
export class FunctionService {

  constructor(private httpService : HttpService ) {

  }

// User service

  createUser(user : User): Observable<Object>{
   return this.httpService.post({endpoint : '/api/user',data : user});
  }
  updateUser(user : User) {
    return this.httpService.put({endpoint : '/api/user',data : user});
  }

  getUser() {
    
   return this.httpService.get("/api/user");
  }

  deleteUser(user_id : any) {
    return this.httpService.delete(`/api/user/${user_id}`);
  }


  // liste styliste service

  createStyliste(user : User): Observable<Object>{
    return this.httpService.post({endpoint : '/api/user',data : user});
   }
   updateStyliste(user : User) {
     return this.httpService.put({endpoint : '/api/user',data : user});
   }
 
   getStyliste() {
     
    return this.httpService.get("/api/user");
   }
 
   deleteStyliste(user_id : string) {
     return this.httpService.delete(`api/user/${user_id}`);
   }

   // liste design service

  createDesign(design : Design): Observable<Object>{
    return this.httpService.post({endpoint : "/api/design/add",data : design});
   }
   updateDesign(design : Design) {
     return this.httpService.put({endpoint :"/api/design/",data : design});
   }
 
   getDesign() {
     
    return this.httpService.get("/api/design");
   }
 
   deleteDesign(design_id : string) {
     return this.httpService.delete(`api/design/${design_id}`);
   }
 


}
