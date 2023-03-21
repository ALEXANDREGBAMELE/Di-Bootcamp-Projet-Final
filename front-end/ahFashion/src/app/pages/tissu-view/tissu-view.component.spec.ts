import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TissuViewComponent } from './tissu-view.component';

describe('TissuViewComponent', () => {
  let component: TissuViewComponent;
  let fixture: ComponentFixture<TissuViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TissuViewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TissuViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
