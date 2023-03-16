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
import { HomeComponent } from './pages/home/home.component';
import { StylisteComponent } from './pages/styliste/styliste.component';
import { ListStylisteComponent } from './components/stylistes/list-styliste/list-styliste.component';
import { CommandesComponent } from './pages/commandes/commandes.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './pages/authentication/login/login.component';
import { RegisterComponent } from './pages/authentication/register/register.component';
import { UsersComponent } from './components/users/users.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DesignsComponent } from './pages/design/designs.component';
import { DesignComponent } from './components/design/design.component';
import { ProfilUserComponent } from './pages/profil-user/profil-user.component';

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
            HomeComponent,
            StylisteComponent,
            ListStylisteComponent,
            CommandesComponent,
            LoginComponent,
            RegisterComponent,
            UsersComponent,
            DesignsComponent,
            DesignComponent,
            ProfilUserComponent

        
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
