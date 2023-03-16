import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StylisteComponent } from './styliste.component';

describe('StylisteComponent', () => {
  let component: StylisteComponent;
  let fixture: ComponentFixture<StylisteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StylisteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StylisteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
