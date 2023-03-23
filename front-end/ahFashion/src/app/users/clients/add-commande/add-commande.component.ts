import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Design } from 'src/app/models/design';
import { FunctionService } from 'src/app/services/api/function.service';


@Component({
  selector: 'app-add-commande',
  templateUrl: './add-commande.component.html',
  styleUrls: ['./add-commande.component.css']
})
export class AddCommandeComponent implements OnInit {
  article : any;
  iddesign : any;
  designdata : Design[] = [];
  constructor(private actived : ActivatedRoute, private fonction : FunctionService){}
  ngOnInit(): void {
   
    this.actived.params.subscribe(
      (data : any)=>{
        
        this.article = data
        console.log(this.article)
        
      }

    );
    this.iddesign =   this.actived.snapshot.params["id"] 
    console.log(this.iddesign);
    

      this.fonction.getDesignById(this.iddesign).subscribe({
        next:data => {
          this.designdata = data as Design[];
        console.log(data)
        },
        error :error =>{
          console.log(error);
          
        }
      })
  }

  

}
