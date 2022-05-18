/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.Mqtt.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.Mqtt.Collections.Temperatura;
import org.uv.Mqtt.Repositories.TemperaturaRepo;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {
    @Autowired
    TemperaturaRepo repo;
    
    @GetMapping()
    public List<Temperatura> getTemperaturas(){
        return repo.findAll();
    }
    @PostMapping()
    public Temperatura guardar(@RequestBody Temperatura temperatura){
        return repo.save(temperatura);
    }
   
}
