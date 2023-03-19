import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeCommandeCourantComponent } from './liste-commande-courant.component';

describe('ListeCommandeCourantComponent', () => {
  let component: ListeCommandeCourantComponent;
  let fixture: ComponentFixture<ListeCommandeCourantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeCommandeCourantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListeCommandeCourantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
