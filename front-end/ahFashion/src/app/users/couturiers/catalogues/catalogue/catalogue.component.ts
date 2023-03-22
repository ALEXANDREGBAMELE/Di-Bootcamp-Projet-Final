import { Component } from '@angular/core';
import { Design } from 'src/app/models/design';
import { FunctionService } from 'src/app/services/api/function.service';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.css']
})
export class CatalogueComponent {

  ListeDesign: Design[]=[]

  constructor(private designservice : FunctionService){}

  ngOnInit(): void { 

    this.designservice.getDesign().subscribe((result) =>{
      console.log(result)
      this.ListeDesign = result as Design[];
     
    }
    
  )
  }
  onDeleteDesign(design_id : any) {
   
    this.designservice.deleteDesign(design_id).subscribe(
      
      (response) => {
       
        console.log('Resource deleted successfully');
        // Do something with the response, if necessary
         //window.location.reload();
      },
      (error) => {
        console.log('Error deleting resource', error);
        // Handle the error, if necessary
        // window.location.reload();
      }
      
    );
  }
  
}
