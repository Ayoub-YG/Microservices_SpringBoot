package com.esi.msscolarite;

import com.esi.msscolarite.entities.Etablissement;
import com.esi.msscolarite.entities.Student;
import com.esi.msscolarite.repositories.Etablissementrepo;
import com.esi.msscolarite.repositories.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients // Enable Feign Clients
public class MsScolariteApplication implements CommandLineRunner { // Implement CommandLineRunner

    @Autowired
    private Studentrepo studentrepo;

    @Autowired
    private Etablissementrepo etabissementrepo;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override // Override the run method
    public void run(String... args) throws Exception {
       // Etablissement e = new Etablissement();
      //  e.setNom("ESI SBA");
       // etabissementrepo.save(e);

       // Student student = new Student(null, "djalil", Date.valueOf("2020-02-12"), Date.valueOf("2024-02-12"), "4eme", 1L, e);
       // studentrepo.save(student);

       // System.out.println("Data saved successfully!");
    }
}