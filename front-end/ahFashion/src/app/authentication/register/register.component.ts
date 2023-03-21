import { Component} from '@angular/core';

import { User } from 'src/app/models/user';
import { FunctionService } from 'src/app/services/api/function.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent{
 

  user: User = { 
    
    firstname: '',
    lastname: '',
    username: '',
    email: '',
    burhDay: '',
    tall: '',
    weight: '',
    address: '',
    photo: '',
    password : '',
    confirmPassword : '',
    role : ''
   }

  constructor(private userService : FunctionService) { }
  

  addUser() {
    if(!this.user){
    alert("les champs sont vides");
    }
      this.userService.createUser(this.user).subscribe({
        next : data=>{
          console.log(data);
          alert('user enregistre avec succes');
         
        },
        error : (err) =>{
          console.log(err);
        }
      
      });
    }
  
// ======================================= User  ============================================

}



