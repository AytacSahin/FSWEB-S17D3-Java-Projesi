package com.workintech.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Animal sınıfından türeyecek hatalarımın response tipini burada belirliyorum

// @Data -> bizim için Getter, Setter, HashCode, toEqual hepsini hazırlar.
// @AllArgsConstructor -> bizim için gövdeli constructor açar.
// @NoArgsConstructor -> bizim için gövdesiz constructor açar.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
