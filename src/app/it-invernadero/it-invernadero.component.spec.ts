import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItInvernaderoComponent } from './it-invernadero.component';

describe('ItInvernaderoComponent', () => {
  let component: ItInvernaderoComponent;
  let fixture: ComponentFixture<ItInvernaderoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ItInvernaderoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ItInvernaderoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
