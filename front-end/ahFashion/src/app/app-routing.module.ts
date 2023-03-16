import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersComponent } from './components/users/users.component';
import { RegisterComponent } from './pages/authentication/register/register.component';
import { CommandesComponent } from './pages/commandes/commandes.component';
import { DesignsComponent } from './pages/design/designs.component';
import { HomeComponent } from './pages/home/home.component';
import { StylisteComponent } from './pages/styliste/styliste.component';

const routes: Routes = [
  {
    path : "home" ,
    component : HomeComponent
  },
  {
    path: "styliste" ,
    component : StylisteComponent
  },

  {
    path:"commande",
    component : CommandesComponent
  },
  {
    path:"register",
    component : RegisterComponent
  },
  {
    path:" ", redirectTo : "home", 
    pathMatch:"full"
  },
{
  path:"designs",
  component : DesignsComponent
}

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
