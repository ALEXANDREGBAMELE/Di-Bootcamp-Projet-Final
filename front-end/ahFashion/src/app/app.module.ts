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
import { DashbordComponent } from './users/Dashbord/dashbord.component';
import { HommeComponent } from './users/home/home.component';
import { LivreurComponent } from './users/livreurs/dashbord/livreur.component';
import { DashbordRoutingModule } from './users/routes/dashbord.routing';
import { ViewComponent } from './pages/view/view/view.component';
import { RegisterComponent } from './authentication/register/register.component';
import { CatalogueComponent } from './users/couturiers/catalogues/catalogue/catalogue.component';
import { CatalogueAddFormComponent } from './users/couturiers/catalogues/catalogue-add-form/catalogue-add-form.component';
import { PosterComponent } from './users/couturiers/publication/poster/poster.component';
import { CommandeFormComponent } from './pages/commandes/commande-form/commande-form.component';


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
            DashbordComponent,
            HommeComponent,
            LivreurComponent,
            SlideComponent,
            ViewComponent,
            RegisterComponent,
            CatalogueComponent,
            CatalogueAddFormComponent,
            PosterComponent,
            CommandeFormComponent,
            
        
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    DashbordRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
