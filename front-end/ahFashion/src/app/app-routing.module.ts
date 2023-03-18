import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommandeFormComponent } from './pages/commandes/commande-form/commande-form.component';
import { CommandesComponent } from './pages/commandes/commandes.component';
import { ProfilUserComponent } from './pages/profil-user/profil-user.component';
import { ViewComponent } from './pages/view/view/view.component';
import { CatalogueComponent } from './users/couturiers/catalogues/catalogue/catalogue.component';
import { DashbordComponent } from './users/Dashbord/dashbord.component';
import { HommeComponent } from './users/home/home.component';
import { LivreurComponent } from './users/livreurs/dashbord/livreur.component';

const routes: Routes = [

 {
  path :'dashbord', component : DashbordComponent,
 
 },
{
  path : 'view',
  component : ViewComponent,
},
{
  path : 'catalogue',
  component : CatalogueComponent,
},
 
{
  path : 'commandeform',
  component : CommandeFormComponent,
}
// les routes enfante du user/id
// {
//   path: '**',
//   redirectTo: 'dashbord',
//   pathMatch: 'full',
// },


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes), RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
