import { Component } from '@angular/core';
import { Design } from "../../../../models/design";
import { FunctionService } from "../../../../services/api/function.service";
import {  } from "module";

import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@Component({
  selector: 'app-catalogue-add-form',
  templateUrl: './catalogue-add-form.component.html',
  styleUrls: ['./catalogue-add-form.component.css']
})
export class CatalogueAddFormComponent {

  design: Design = {
    label: "",
    imgUrl: "",
    description: "",
    price: 0,
    category: "",
    design_id: 0
  }

  constructor(private designService : FunctionService) { }

  addDesign() {
      this.designService.createDesign(this.design).subscribe({
        next : data=>{
          console.log(data);
          alert('modele enregistre avec succes');
         
        },
        error : (err) =>{
          console.log(err);
        }
      
      });
    }

}
