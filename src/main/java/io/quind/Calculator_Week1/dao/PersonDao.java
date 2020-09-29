package io.quind.Calculator_Week1.dao;

import io.quind.Calculator_Week1.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


// llama al controlador, metodos JPA, CONTROLA LA BASE DE DATOS
public interface PersonDao extends JpaRepository<Person, Long> {
}
