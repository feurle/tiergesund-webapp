package com.feurle.tiergesund.vets.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository class for <code>Vet</code> domain objects All method names are compliant with Spring Data naming
 * conventions so this interface can easily be extended for Spring Data See here: http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation

 */
public interface VetRepository extends JpaRepository<Vet, Integer> {
}
