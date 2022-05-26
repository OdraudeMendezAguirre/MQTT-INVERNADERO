import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UiInicioComponent } from './ui-inicio/ui-inicio.component';
import { ItInvernaderoComponent } from './it-invernadero/it-invernadero.component';
import { FrontInvernaderoComponent } from './front-invernadero/front-invernadero.component';
import { ItDatoComponent } from './it-dato/it-dato.component';

@NgModule({
  declarations: [
    AppComponent,
    UiInicioComponent,
    ItInvernaderoComponent,
    FrontInvernaderoComponent,
    ItDatoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
