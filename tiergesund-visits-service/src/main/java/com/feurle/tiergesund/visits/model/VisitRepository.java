package com.feurle.tiergesund.visits.model;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository class for <code>Visit</code> domain objects All method names are compliant with Spring Data naming conventions so this interface can easily be extended for Spring
 * Data See here: http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 */
public interface VisitRepository extends JpaRepository<Visit, Integer> {

    List<Visit> findByPetId(int petId);

    List<Visit> findByPetIdIn(Collection<Integer> petIds);
}
