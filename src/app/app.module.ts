import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { MongoService } from './mongo.service';
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
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [MongoService],
  bootstrap: [AppComponent]
})

export class AppModule { }
