import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule ,Route, Routes} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { DashbordClientComponent } from '../dashbord-client/dashbord-client.component';

const routes: Routes = [
 
]


@NgModule({
  declarations: [],
  imports: [
    RouterModule.forChild(routes) , 
    FormsModule,
    CommonModule
    
  ]
})
export class RouteClientModule { }
