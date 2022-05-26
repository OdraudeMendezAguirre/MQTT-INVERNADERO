import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UiInicioComponent } from './ui-inicio.component';

describe('UiInicioComponent', () => {
  let component: UiInicioComponent;
  let fixture: ComponentFixture<UiInicioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UiInicioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UiInicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
