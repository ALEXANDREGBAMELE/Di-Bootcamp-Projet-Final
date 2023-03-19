import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeHistoriqueCouturierComponent } from './liste-historique-couturier.component';

describe('ListeHistoriqueCouturierComponent', () => {
  let component: ListeHistoriqueCouturierComponent;
  let fixture: ComponentFixture<ListeHistoriqueCouturierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeHistoriqueCouturierComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListeHistoriqueCouturierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
