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
import { DashboardLivreurComponent } from './users/livreurs/dashboard-livreur/dashboard-livreur.component';
import { DashbordClientComponent } from './users/clients/dashbord-client/dashbord-client.component';
import { DesignComponent } from './components/design/design.component';
import { ContactComponent } from './components/contacts/contact/contact.component';
import { ListeHistoriqueCouturierComponent } from './users/couturiers/historiques/liste-historique-couturier/liste-historique-couturier.component';
import { DashboardCouturierComponent } from './users/couturiers/dashboard-couturier/dashboard-couturier.component';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { PaiementFactureComponent } from './users/clients/paiement-facture/paiement-facture.component';
const routes: Routes = [
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
},
{
  path : 'dashboardclient',
  component : DashbordClientComponent,
},
{
  path : 'dashboarcouturier',
  component : DashboardCouturierComponent,
},

{
  path : 'dashboardadmin',
  component : DashboardAdminComponent,
},

{
  path : 'design',
  component : DesignComponent,
},
{
  path : 'contact',
  component : ContactComponent,
},
{
  path : 'historiquecouturier',
  component : ListeHistoriqueCouturierComponent,
},
{
  path : 'paiement',
  component : PaiementFactureComponent,
},



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
