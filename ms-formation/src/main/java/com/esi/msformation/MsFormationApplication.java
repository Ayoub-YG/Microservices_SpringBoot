package com.esi.msformation;

import com.esi.msformation.entities.Formation;
import com.esi.msformation.repositories.Formationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    private Formationrepo formationrepo;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation formation = new Formation(null, "AI", 120);
        formationrepo.save(formation);
    }
}
