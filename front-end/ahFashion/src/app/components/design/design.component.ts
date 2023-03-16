import { Component, OnInit } from "@angular/core";
import { Design } from "src/app/models/design";
import { FunctionService } from 'src/app/services/api/function.service';


@Component ({
    selector : 'app-design',
    templateUrl : './design.component.html',
    styleUrls : ['./design.component.css']
})
export class DesignComponent implements OnInit{

    listeDesign : Design[] = [];
    constructor( private designService : FunctionService){

    }
    ngOnInit(){
        this.designService.getDesign().subscribe((data : any) => {
            this.listeDesign = data as Design []
        })
        
    }

}