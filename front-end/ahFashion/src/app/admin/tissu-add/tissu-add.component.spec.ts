import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TissuAddComponent } from './tissu-add.component';

describe('TissuAddComponent', () => {
  let component: TissuAddComponent;
  let fixture: ComponentFixture<TissuAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TissuAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TissuAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
