import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItDatoComponent } from './it-dato.component';

describe('ItDatoComponent', () => {
  let component: ItDatoComponent;
  let fixture: ComponentFixture<ItDatoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ItDatoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ItDatoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
