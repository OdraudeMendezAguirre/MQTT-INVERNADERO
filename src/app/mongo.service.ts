import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Actor } from "./actor";

@Injectable({
    providedIn: 'root'
})
export class MongoService{
    private actor="http://localhost:9000/Actores";
    private humedad="http://localhost:9000/humedad";
    private luminosidad="http://localhost:9000/luminosidad";
    private temperatura="http://localhost:9000/temperatura";
    constructor(private http: HttpClient) { }

    public guardarActor(actor:Actor):Observable<any>{
        return this.http.post(this.actor,actor);
    }

    public findActor():Observable<any>{
        return this.http.get(this.actor);
    }

    public findHumedad():Observable<any>{
        return this.http.get(this.humedad);
    }

    public findluminosidad():Observable<any>{
        return this.http.get(this.luminosidad);
    }

    public findtemperatura():Observable<any>{
        return this.http.get(this.temperatura);
    }

}