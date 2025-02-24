package com.esi.msscolarite.proxies;


import com.esi.msscolarite.entities.Formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation", url = "http://localhost:8086")
// Name of the service and its URL
public interface Formationproxy {

    @GetMapping(path = "/formations/{id}", produces = MediaType.APPLICATION_JSON_VALUE) // Endpoint in the other microservice
    Formation getFormationById(@PathVariable Long id); // Method to call the endpoint
}