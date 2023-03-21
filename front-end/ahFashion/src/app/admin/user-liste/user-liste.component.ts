import { Component } from '@angular/core';
import { User } from 'src/app/models/user';
import { FunctionService } from 'src/app/services/api/function.service';
import { Router } from "@angular/router";
import { Location } from '@angular/common';

@Component({
  selector: 'app-user-liste',
  templateUrl: './user-liste.component.html',
  styleUrls: ['./user-liste.component.css']
})
export class UserListeComponent {

  listeUser: User[]=[]

  constructor(private userService : FunctionService){}

  ngOnInit(): void { 

    this.userService.getUser().subscribe((result) =>{
      console.log(result)
      this.listeUser = result as User[];
     
    }
  )
  }

  

  onDeleteUser(user_id : any) {
   
    this.userService.deleteUser(user_id).subscribe(
      
      (response) => {
       
        console.log('Resource deleted successfully');
        // Do something with the response, if necessary
        // window.location.reload();
      },
      (error) => {
        console.log('Error deleting resource', error);
        // Handle the error, if necessary
        window.location.reload();
      }
      
    );
  }


}
