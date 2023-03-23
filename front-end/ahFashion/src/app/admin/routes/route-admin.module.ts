import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule, ChildrenOutletContexts } from '@angular/router';
import { FactureComponent } from 'src/app/shared/facture/facture.component';
import { CatalogueAddFormComponent } from 'src/app/users/couturiers/catalogues/catalogue-add-form/catalogue-add-form.component';
import { CatalogueComponent } from 'src/app/users/couturiers/catalogues/catalogue/catalogue.component';
import { ListCommandeCouturierComponent } from 'src/app/users/couturiers/commandes/list-commande-couturier/list-commande-couturier.component';
import { ListeHistoriqueCouturierComponent } from 'src/app/users/couturiers/historiques/liste-historique-couturier/liste-historique-couturier.component';
import { ListLivreurDisponibleComponent } from 'src/app/users/couturiers/liste-livreurs/list-livreur-disponible/list-livreur-disponible.component';
import { ListeReclamationComponent } from 'src/app/users/couturiers/reclamation/liste-reclamation/liste-reclamation.component';
import { LivreurComponent } from 'src/app/users/livreurs/dashbord/livreur.component';
import { DashboardAdminComponent } from '../dashboard-admin/dashboard-admin.component';
import { ListeCouturierComponent } from '../liste-couturier/liste-couturier.component';
import { TissuAddComponent } from '../tissu-add/tissu-add.component';
import { TissuListeComponent } from '../tissu-liste/tissu-liste.component';

const routes: Routes = [

  {
    path: '',
    component: DashboardAdminComponent,
    children: [
      
          
             
              {
                  path: 'livreur',
                  component: LivreurComponent,
                },
               
                {
                  path : 'catalogue',
                  component : CatalogueComponent,
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
                },
                {
                  path : 'historiquecouturier',
                  component : ListeHistoriqueCouturierComponent,
                },
                {
                    path : 'tissu',
                    component : TissuListeComponent,
                  },
                  {
                    path : 'addtissu',
                    component : TissuAddComponent,
                  },
                  {
                    path : 'listecouturier',
                    component : ListeCouturierComponent
                  },
                  {
                    path : 'facture',
                    component : FactureComponent,
                  }
              ]
            }
    
  ];
  

@NgModule({
  imports: [RouterModule.forChild(routes) , FormsModule],
  exports: [RouterModule],
})
export class AdminRoutingModule {}


