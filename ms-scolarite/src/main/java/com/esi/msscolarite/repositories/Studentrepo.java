package com.esi.msscolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.esi.msscolarite.entities.Student;

@RepositoryRestResource
public interface Studentrepo extends JpaRepository<Student, Long> {
}
