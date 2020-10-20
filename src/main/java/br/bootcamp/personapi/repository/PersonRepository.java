package br.bootcamp.personapi.repository;

import br.bootcamp.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
