package com.esi.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> listStudent;
}
