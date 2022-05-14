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
import org.uv.Mqtt.Collections.Humedad;
import org.uv.Mqtt.Repositories.HumedadRepo;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/humedad")
public class HumedadController {
    @Autowired 
    HumedadRepo repo;
            
    @GetMapping()
    public List<Humedad> getHumedad(){
        return repo.findAll();
    }
    @PostMapping()
    public Humedad guardar(@RequestBody Humedad humedad){
        return repo.save(humedad);
    }
}
