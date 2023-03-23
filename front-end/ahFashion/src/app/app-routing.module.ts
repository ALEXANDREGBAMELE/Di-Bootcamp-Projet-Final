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
import { PaiementFactureComponent } from './users/clients/paiement-facture/paiement-facture.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { PanierComponent } from './users/clients/panier/panier.component';
import { AddCommandeComponent } from './users/clients/add-commande/add-commande.component';
import { FactureComponent } from './shared/facture/facture.component';
import { AtelierComponent } from './components/ateliers/atelier/atelier.component';
import { StylisteComponent } from './pages/styliste/styliste.component';
const routes: Routes = [
{
  path :'view',
  component : ViewComponent,
},

{
  path :'',
  redirectTo : 'view',
  pathMatch : 'full',
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
  path : 'dashboardadmin', loadChildren : () =>
  import ('./admin/routes/route-admin.module').then((m) => m.AdminRoutingModule)
},

{
  path : 'dashboardcouturier', loadChildren : () =>
  import ('./users/couturiers/route/route-couturier.module').then((cou) => cou.CouturierRoutingModule)
},

{
  path : 'dashboardlivreur', loadChildren : () =>
  import ('./users/livreurs/route-livreur/route-livreur.module').then((liv) => liv.RouteLivreurModule)
},

{
  path : 'dashboardclient', loadChildren : () =>
  import ('./users/clients/route-client/route-client.module').then((cli) => cli.RouteClientModule)
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

{
  path : 'panier',
  component : PanierComponent,
}
,
{
  path : 'addcommande/:id',
  component : AddCommandeComponent,
},
{
  path : 'facture',
  component : FactureComponent,
},

{
  path : 'styliste',
  component : StylisteComponent,
},
{
  path : 'atelier',
  component : AtelierComponent,
},

{
  path: '**',
  component : NotFoundComponent,

},
 
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
