package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data -> bizim için Getter, Setter, HashCode, toEqual hepsini hazırlar.
// @AllArgsConstructor -> bizim için gövdeli constructor açar.
// @NoArgsConstructor -> bizim için gövdesiz constructor açar.
// @Builder -> Person person = Person.builder().firstName("John").lastName("Doe").age(30).build();
// - yani kok daha okunaklı olur, ne yapmak istediğin anlaşılır.
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {
    private int id;
    private String name;
    private double weight;
    private Gender gender;
}
