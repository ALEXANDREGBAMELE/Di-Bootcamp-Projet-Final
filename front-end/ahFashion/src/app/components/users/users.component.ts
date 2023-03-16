import { Component, OnInit } from "@angular/core";
import { User } from "src/app/models/user";
import { FunctionService } from "src/app/services/api/function.service";
@Component({
    selector: 'app-users',
    templateUrl: './users.component.html',
    styleUrls: ['./users.component.css']
    
})

export class UsersComponent implements OnInit {


    user: User[] = []

  constructor(private userService : FunctionService){}
    
  ngOnInit() { 

    this.userService.getUser().subscribe((datas : any) =>{
    this.user = datas as User[];
   
    }
    
  )

}}

