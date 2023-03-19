import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule, ChildrenOutletContexts } from '@angular/router';
import { RegisterComponent } from 'src/app/authentication/register/register.component';
import { ProfilUserComponent } from 'src/app/pages/profil-user/profil-user.component';
import { CatalogueAddFormComponent } from '../couturiers/catalogues/catalogue-add-form/catalogue-add-form.component';
import { CatalogueComponent } from '../couturiers/catalogues/catalogue/catalogue.component';
import { ListCommandeCouturierComponent } from '../couturiers/commandes/list-commande-couturier/list-commande-couturier.component';
import { ListLivreurDisponibleComponent } from '../couturiers/liste-livreurs/list-livreur-disponible/list-livreur-disponible.component';
import { PosterComponent } from '../couturiers/publication/poster/poster.component';
import { ListeReclamationComponent } from '../couturiers/reclamation/liste-reclamation/liste-reclamation.component';

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
                    path : 'commandecouturier',
                    component : ListCommandeCouturierComponent,
                  },
                  {
                      path : 'listelivreur',
                      component : ListLivreurDisponibleComponent,
                  },
                  {
                    path : 'listereclamation',
                    component : ListeReclamationComponent,
                  },
                  {
                    path : 'catalogueformadd',
                    component : CatalogueAddFormComponent,
                  }
        
        // {
        //    path: '',
        //    redirectTo: '',
        //    pathMatch: 'full',
        // },
      ],
    },
  ];
  

@NgModule({
  imports: [RouterModule.forChild(routes) , FormsModule],
  exports: [RouterModule],
})
export class DashbordRoutingModule {}
