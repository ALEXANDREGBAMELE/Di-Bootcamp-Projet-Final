import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CatalogueAddFormComponent } from './catalogue-add-form.component';

describe('CatalogueAddFormComponent', () => {
  let component: CatalogueAddFormComponent;
  let fixture: ComponentFixture<CatalogueAddFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CatalogueAddFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CatalogueAddFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
