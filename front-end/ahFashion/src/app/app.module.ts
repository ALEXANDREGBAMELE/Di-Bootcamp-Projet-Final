import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/navbar/nav/nav.component';
import { BanniereComponent } from './components/bannieres/banniere/banniere.component';
import { SlideComponent } from './components/slides/slide/slide.component';
import { AtelierComponent } from './components/ateliers/atelier/atelier.component';
import { TissuComponent } from './components/tissus/tissu/tissu.component';
import { ContactComponent } from './components/contacts/contact/contact.component';
import { FooterComponent } from './components/footers/footer/footer.component';

import { StylisteComponent } from './pages/styliste/styliste.component';
import { ListStylisteComponent } from './components/stylistes/list-styliste/list-styliste.component';
import { CommandesComponent } from './pages/commandes/commandes.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DesignsComponent } from './pages/design/designs.component';
import { DesignComponent } from './components/design/design.component';
import { ProfilUserComponent } from './pages/profil-user/profil-user.component';
import { SidenavComponent } from './users/sidenav/sidenav.component';
import { HeaderComponent } from './users/header/header.component';
import { LivreurComponent } from './users/livreurs/dashbord/livreur.component';
import { ViewComponent } from './pages/view/view/view.component';
import { RegisterComponent } from './authentication/register/register.component';
import { CatalogueComponent } from './users/couturiers/catalogues/catalogue/catalogue.component';
import { CatalogueAddFormComponent } from './users/couturiers/catalogues/catalogue-add-form/catalogue-add-form.component';
import { PosterComponent } from './users/couturiers/publication/poster/poster.component';
import { CommandeFormComponent } from './pages/commandes/commande-form/commande-form.component';
import { ViewCatalogueComponent } from './users/couturiers/catalogues/view-catalogue/view-catalogue.component';
import { ListCommandeCouturierComponent } from './users/couturiers/commandes/list-commande-couturier/list-commande-couturier.component';
import { ListLivreurDisponibleComponent } from './users/couturiers/liste-livreurs/list-livreur-disponible/list-livreur-disponible.component';
import { ListeReclamationComponent } from './users/couturiers/reclamation/liste-reclamation/liste-reclamation.component';
import { ListeHistoriqueCouturierComponent } from './users/couturiers/historiques/liste-historique-couturier/liste-historique-couturier.component';
import { LoginComponent } from './authentication/login/login.component';
import { UserListeComponent } from './admin/user-liste/user-liste.component';
import { DashbordClientComponent } from './users/clients/dashbord-client/dashbord-client.component';
import { SidenavClentComponent } from './users/clients/sidenav-clent/sidenav-clent.component';
import { ListeCommandeCourantComponent } from './users/clients/liste-commande-courant/liste-commande-courant.component';
import { ListeHistoriqueChezLivreurComponent } from './users/livreurs/liste-historique-chez-livreur/liste-historique-chez-livreur.component';
import { NavbarLivreurComponent } from './users/livreurs/navbar-livreur/navbar-livreur.component';
import { SidenavLivreurComponent } from './users/livreurs/sidenav-livreur/sidenav-livreur.component';
import { DashboardLivreurComponent } from './users/livreurs/dashboard-livreur/dashboard-livreur.component';
import { TissuAddComponent } from './admin/tissu-add/tissu-add.component';
import { TissuListeComponent } from './admin/tissu-liste/tissu-liste.component';
import { RouteLivreurModule } from './users/livreurs/route-livreur/route-livreur.module';
import { RouteClientModule } from './users/clients/route-client/route-client.module';
import { DashboardCouturierComponent } from "./users/couturiers/dashboard-couturier/dashboard-couturier.component";
import { CouturierRoutingModule } from './users/couturiers/route/route-couturier.module';
import { AdminRoutingModule } from './admin/routes/route-admin.module';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { SidenavAdminComponent } from './admin/sidenav-admin/sidenav-admin.component';
import { ListeCouturierComponent } from './admin/liste-couturier/liste-couturier.component';
import { FactureComponent } from './shared/facture/facture.component';
import { ListeFactureComponent } from './admin/liste-facture/liste-facture.component';
import { PaiementFactureComponent } from './users/clients/paiement-facture/paiement-facture.component';
import { PanierComponent } from './users/clients/panier/panier.component';
import { TissuViewComponent } from './pages/tissu-view/tissu-view.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { AddCommandeComponent } from './users/clients/add-commande/add-commande.component';


@NgModule({
  declarations: [
            AppComponent,
            NavComponent,
            BanniereComponent,
            SlideComponent,
            AtelierComponent,
            TissuComponent,
            ContactComponent,
            FooterComponent,
            StylisteComponent,
            ListStylisteComponent,
            CommandesComponent,
            DesignsComponent,
            DesignComponent,
            ProfilUserComponent,
            SidenavComponent,
            HeaderComponent,
            LivreurComponent,
            SlideComponent,
            ViewComponent,
            RegisterComponent,
            CatalogueComponent,
            CatalogueAddFormComponent,
            PosterComponent,
            CommandeFormComponent,
            ViewCatalogueComponent,
            ListCommandeCouturierComponent,
            ListLivreurDisponibleComponent,
            ListeReclamationComponent,
            ListeHistoriqueCouturierComponent,
            LoginComponent,
            UserListeComponent,
            DashbordClientComponent,
            SidenavClentComponent,
            ListeCommandeCourantComponent,
            ListeHistoriqueChezLivreurComponent,
            NavbarLivreurComponent,
            SidenavLivreurComponent,
            DashboardLivreurComponent,
            TissuAddComponent,
            TissuListeComponent,
            ContactComponent,
            ListeHistoriqueCouturierComponent,
            DashboardCouturierComponent,
            DashboardAdminComponent,
            SidenavAdminComponent,
            ListeCouturierComponent,
            FactureComponent,
            ListeFactureComponent,
            PaiementFactureComponent,
            PanierComponent,
            TissuViewComponent,
            NotFoundComponent,
            AddCommandeComponent,

            
        
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    RouteLivreurModule,
    RouteClientModule,
    CouturierRoutingModule,
    AdminRoutingModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
