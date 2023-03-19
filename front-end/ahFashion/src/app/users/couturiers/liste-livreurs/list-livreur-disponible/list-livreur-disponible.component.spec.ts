import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListLivreurDisponibleComponent } from './list-livreur-disponible.component';

describe('ListLivreurDisponibleComponent', () => {
  let component: ListLivreurDisponibleComponent;
  let fixture: ComponentFixture<ListLivreurDisponibleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListLivreurDisponibleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListLivreurDisponibleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
