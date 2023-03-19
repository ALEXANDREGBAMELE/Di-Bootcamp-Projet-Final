import { Component } from '@angular/core';
import { Design } from 'src/app/models/design';
import { FunctionService } from 'src/app/services/api/function.service';

@Component({
  selector: 'app-view-catalogue',
  templateUrl: './view-catalogue.component.html',
  styleUrls: ['./view-catalogue.component.css']
})
export class ViewCatalogueComponent {
  ListeDesign: Design[]=[]

  constructor(private designservice : FunctionService){}

  ngOnInit(): void { 

    this.designservice.getDesign().subscribe((result) =>{
      console.log(result)
      this.ListeDesign = result as Design[];
     
    }
    
  )
  }

}
