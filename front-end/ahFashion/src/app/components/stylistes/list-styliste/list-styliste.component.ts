

import { Component, OnInit } from '@angular/core';
import { FunctionService } from 'src/app/services/api/function.service';
import { User } from "src/app/models/user";

@Component({
  selector: 'app-list-styliste',
  templateUrl: './list-styliste.component.html',
  styleUrls: ['./list-styliste.component.css']
})
export class ListStylisteComponent{
  
  ListeStyliste: User[]=[]

  constructor(private deseiservice : FunctionService){}

  ngOnInit(): void { 

    this.deseiservice.getStyliste().subscribe((datas : any) =>{
      
      this.ListeStyliste = datas as User[];
     
    }
    
  )
  }


}
