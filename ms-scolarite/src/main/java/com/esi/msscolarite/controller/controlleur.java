package com.esi.msscolarite.controller;

import com.esi.msscolarite.entities.Formation;
import com.esi.msscolarite.proxies.Formationproxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class controlleur {

    @Autowired
    private Formationproxy formationProxy; // Inject the Feign client

    @GetMapping(path = "/formations/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Formation getFormation(@PathVariable Long id) {
        // Call the Feign client to fetch data from the other microservice
        return formationProxy.getFormationById(id);
    }
}