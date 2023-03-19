import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TissuListeComponent } from './tissu-liste.component';

describe('TissuListeComponent', () => {
  let component: TissuListeComponent;
  let fixture: ComponentFixture<TissuListeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TissuListeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TissuListeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
