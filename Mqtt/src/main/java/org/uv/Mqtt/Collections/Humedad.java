/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.Mqtt.Collections;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author sheir
 */
@Document(collection = "humedad")
public class Humedad implements Serializable{
    @Id
    String id;
    
}
