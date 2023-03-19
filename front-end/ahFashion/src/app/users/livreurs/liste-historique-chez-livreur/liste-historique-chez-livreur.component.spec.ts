import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeHistoriqueChezLivreurComponent } from './liste-historique-chez-livreur.component';

describe('ListeHistoriqueChezLivreurComponent', () => {
  let component: ListeHistoriqueChezLivreurComponent;
  let fixture: ComponentFixture<ListeHistoriqueChezLivreurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeHistoriqueChezLivreurComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListeHistoriqueChezLivreurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
