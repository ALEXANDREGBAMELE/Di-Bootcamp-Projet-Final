import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule ,Route} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { DashbordClientComponent } from '../dashbord-client/dashbord-client.component';

const Routes = [
  {
    Path : 'dashboardclient',
    component : DashbordClientComponent,
  }
]


@NgModule({
  declarations: [],
  imports: [
    RouterModule.forChild(Routes) , 
    FormsModule,
    CommonModule
    
  ]
})
export class RouteClientModule { }
