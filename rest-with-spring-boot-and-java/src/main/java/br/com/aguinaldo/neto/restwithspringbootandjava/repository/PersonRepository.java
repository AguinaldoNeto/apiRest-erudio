package br.com.aguinaldo.neto.restwithspringbootandjava.repository;

import br.com.aguinaldo.neto.restwithspringbootandjava.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { }
