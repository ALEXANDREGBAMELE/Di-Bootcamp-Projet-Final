import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { DashboardLivreurComponent } from '../dashboard-livreur/dashboard-livreur.component';

const routes: Routes = [
  {
    path : '',
    component : DashboardLivreurComponent,
  }
]

@NgModule({
  declarations: [ ],
  imports: [
    RouterModule.forChild(routes),
    CommonModule
  ]
})
export class RouteLivreurModule { }
