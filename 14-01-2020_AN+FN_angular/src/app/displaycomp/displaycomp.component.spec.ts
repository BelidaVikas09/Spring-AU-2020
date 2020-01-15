import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaycompComponent } from './displaycomp.component';

describe('DisplaycompComponent', () => {
  let component: DisplaycompComponent;
  let fixture: ComponentFixture<DisplaycompComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplaycompComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplaycompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
