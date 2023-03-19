import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCommandeCouturierComponent } from './list-commande-couturier.component';

describe('ListCommandeCouturierComponent', () => {
  let component: ListCommandeCouturierComponent;
  let fixture: ComponentFixture<ListCommandeCouturierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListCommandeCouturierComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListCommandeCouturierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
