/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.Mqtt.Repositories;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.uv.Mqtt.Collections.Temperatura;

/**
 *
 * @author sheir
 */
@Repository
public interface TemperaturaRepo extends MongoRepository<Temperatura, Serializable> {
    
}
