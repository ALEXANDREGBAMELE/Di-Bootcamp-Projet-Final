import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListStylisteComponent } from './list-styliste.component';

describe('ListStylisteComponent', () => {
  let component: ListStylisteComponent;
  let fixture: ComponentFixture<ListStylisteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListStylisteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListStylisteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
