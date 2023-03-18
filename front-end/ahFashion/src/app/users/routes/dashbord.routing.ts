import { NgModule } from '@angular/core';
import { Routes, RouterModule, ChildrenOutletContexts } from '@angular/router';
import { RegisterComponent } from 'src/app/authentication/register/register.component';
import { ProfilUserComponent } from 'src/app/pages/profil-user/profil-user.component';
import { CatalogueAddFormComponent } from '../couturiers/catalogues/catalogue-add-form/catalogue-add-form.component';
import { CatalogueComponent } from '../couturiers/catalogues/catalogue/catalogue.component';
import { PosterComponent } from '../couturiers/publication/poster/poster.component';

import { DashbordComponent } from '../Dashbord/dashbord.component';
import { LivreurComponent } from '../livreurs/dashbord/livreur.component';

const routes: Routes = [
  // {path: '',
  // component: DashbordComponent,},

    {
      path: 'dashboard',
      component: DashbordComponent,
      children: [
        
            
                {
                    path : 'profil',
                    component : ProfilUserComponent
                
                },
                {
                    path: 'livreur',
                    component: LivreurComponent,
                  },
                  {
                    path : 'inscription',
                    component : RegisterComponent
                  },
                  {
                    path : 'catalogue',
                    component : CatalogueComponent,
                  },
                  {
                    path : 'poster',
                    component : PosterComponent,
                  },
                  {
                    path : 'add-catalogue',
                    component : CatalogueAddFormComponent,
                  }
                  ,

         
        
        
        {
           path: '',
           redirectTo: 'dashbord',
           pathMatch: 'full',
        },
      ],
    },
  ];
  

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DashbordRoutingModule {}
