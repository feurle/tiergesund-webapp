package com.feurle.tiergesund.vets.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Models a {@link Vet Vet's} specialty (for example, dentistry).
 *
 */
@Entity
@Table(name = "specialties")
@ToString
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

}
