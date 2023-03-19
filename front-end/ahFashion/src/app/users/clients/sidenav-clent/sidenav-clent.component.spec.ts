import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SidenavClentComponent } from './sidenav-clent.component';

describe('SidenavClentComponent', () => {
  let component: SidenavClentComponent;
  let fixture: ComponentFixture<SidenavClentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SidenavClentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SidenavClentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
