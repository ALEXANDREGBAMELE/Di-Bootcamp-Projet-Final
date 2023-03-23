import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule, ChildrenOutletContexts } from '@angular/router';
import { LivreurComponent } from '../../livreurs/dashbord/livreur.component';
import { CatalogueAddFormComponent } from '../catalogues/catalogue-add-form/catalogue-add-form.component';
import { CatalogueComponent } from '../catalogues/catalogue/catalogue.component';
import { ListCommandeCouturierComponent } from '../commandes/list-commande-couturier/list-commande-couturier.component';
import { DashboardCouturierComponent } from '../dashboard-couturier/dashboard-couturier.component';
import { ListeHistoriqueCouturierComponent } from '../historiques/liste-historique-couturier/liste-historique-couturier.component';
import { ListLivreurDisponibleComponent } from '../liste-livreurs/list-livreur-disponible/list-livreur-disponible.component';
import { ListeReclamationComponent } from '../reclamation/liste-reclamation/liste-reclamation.component';
const routes: Routes = [

  {
    path: '',
    component: DashboardCouturierComponent,
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
                  path : 'catalogueformadd',
                  component : CatalogueAddFormComponent,
                },
                {
                  path : 'historiquecouturier',
                  component : ListeHistoriqueCouturierComponent,
                },
              
              ]
            }
    
  ];
  

@NgModule({
  imports: [RouterModule.forChild(routes) , FormsModule],
  exports: [RouterModule],
})
export class CouturierRoutingModule {}


