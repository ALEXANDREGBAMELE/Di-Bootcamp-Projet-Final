import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListeComponent } from './admin/user-liste/user-liste.component';
import { LoginComponent } from './authentication/login/login.component';
import { RegisterComponent } from './authentication/register/register.component';
import { CommandeFormComponent } from './pages/commandes/commande-form/commande-form.component';


import { ViewComponent } from './pages/view/view/view.component';
import { CatalogueComponent } from './users/couturiers/catalogues/catalogue/catalogue.component';
import { ViewCatalogueComponent } from './users/couturiers/catalogues/view-catalogue/view-catalogue.component';
import { ListCommandeCouturierComponent } from './users/couturiers/commandes/list-commande-couturier/list-commande-couturier.component';
import { DashbordComponent } from './users/Dashbord/dashbord.component';
import { DashboardLivreurComponent } from './users/livreurs/dashboard-livreur/dashboard-livreur.component';
import { DashbordClientComponent } from './users/clients/dashbord-client/dashbord-client.component';
const routes: Routes = [

 {
  path :'dashbord', component : DashbordComponent,
 
 },
{
  path : 'view',
  component : ViewComponent,
},
{
  path : 'commandeform',
  component : CommandeFormComponent,
},
{
  path : 'catalogueview',
  component : ViewCatalogueComponent,
},
{
  path : 'commandecouturier',
  component : ListCommandeCouturierComponent
},
{
  path : 'login',
  component : LoginComponent,
},

{
  path : 'register',
  component : RegisterComponent,
},

{
  path : 'userliste',
  component : UserListeComponent,
},
{
  path : 'dashbordlivreur',
  component : DashboardLivreurComponent,

  children : [

  ]
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
