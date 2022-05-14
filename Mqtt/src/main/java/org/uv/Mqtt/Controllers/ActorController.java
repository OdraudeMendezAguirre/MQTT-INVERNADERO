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
import org.uv.Mqtt.Collections.Actor;
import org.uv.Mqtt.Repositories.ActorRepo;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/Actores")
public class ActorController {
    @Autowired
    ActorRepo repo;
    @GetMapping()
    public List<Actor> getActors(){
        return repo.findAll();
    }
    @PostMapping()
    public Actor guardar(@RequestBody Actor actor){
        return repo.save(actor);
    }
}
