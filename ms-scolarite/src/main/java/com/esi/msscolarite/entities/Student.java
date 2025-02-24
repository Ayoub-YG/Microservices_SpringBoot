package com.esi.msscolarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Temporal(TemporalType.DATE)
    private Date inscriptiondate;
    private String promo;
    private Long idFormation;

    @ManyToOne
    @JoinColumn(name = "etablissement")
    private Etablissement etablissement;

}
