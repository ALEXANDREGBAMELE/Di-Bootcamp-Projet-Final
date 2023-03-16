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
       user_name: '',
    email: '',
    burhDay: '',
      tall: '',
     weight: '',
    address: '',
     photo: '',
     password : '',
     confirmPassword : ''
   }

  constructor(private userService : FunctionService) { }

  addUser() {
    
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


