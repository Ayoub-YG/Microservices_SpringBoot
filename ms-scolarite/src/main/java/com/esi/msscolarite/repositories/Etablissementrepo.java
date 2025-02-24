package com.esi.msscolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.esi.msscolarite.entities.*;

@RepositoryRestResource
public interface Etablissementrepo extends JpaRepository<Etablissement, Long> {

}
