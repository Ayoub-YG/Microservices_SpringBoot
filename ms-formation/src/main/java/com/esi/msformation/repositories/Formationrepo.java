package com.esi.msformation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.esi.msformation.entities.Formation;

@RepositoryRestResource
public interface Formationrepo extends JpaRepository<Formation, Long> {
}
