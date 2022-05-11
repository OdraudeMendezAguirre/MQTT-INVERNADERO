/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.Mqtt.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/humedad")
public class HumedadController {
    @GetMapping()
    public String getMensaje(){
        return "Hola, si funciono";
    }
}
