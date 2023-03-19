import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SidenavLivreurComponent } from './sidenav-livreur.component';

describe('SidenavLivreurComponent', () => {
  let component: SidenavLivreurComponent;
  let fixture: ComponentFixture<SidenavLivreurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SidenavLivreurComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SidenavLivreurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
