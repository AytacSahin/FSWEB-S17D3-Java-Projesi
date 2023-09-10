package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data -> bizim için Getter, Setter, HashCode, toEqual hepsini hazırlar.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kangaroo extends Animal{
    private double height;
    private boolean isAggressive;
}
