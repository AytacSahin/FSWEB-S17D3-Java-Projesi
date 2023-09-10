package com.workintech.zoo.exceptions;

import com.workintech.zoo.entity.Animal;
import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.entity.Koala;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidate {
    public static void isIdValid(int id) {
        if (id <=0) {
            throw new AnimalException("Id gecerli degil.", HttpStatus.BAD_REQUEST);
        }
    }
    public static void isIdNotExist(Map animals, int id) {
        if (!animals.containsKey(id)) {
            throw new AnimalException("Verilen id'li bir animal bulunamadi.", HttpStatus.NOT_FOUND);
        }
    }
    public static void isIdAlreadyExist(Map animals, int id) {
        if (!animals.containsKey(id)) {
            throw new AnimalException("Verilen id'li bir animal zaten var.", HttpStatus.BAD_REQUEST);
        }
    }

    public static void isAnimalVAlid(Animal animal) {
        if ((animal.getName() == null ||
                animal.getName().isEmpty() || animal.getWeight() <=0 ||
                animal.getWeight() >100)) {
            throw new AnimalException("Animal bilgileri yanlis.", HttpStatus.BAD_REQUEST);
        }
    }
    public static void isKangarooValid(Kangaroo kangaroo){
        if((kangaroo.getHeight() < 0.5 || kangaroo.getHeight() > 2.00)){
            throw new AnimalException("Kangaroo credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }

    public static void isKoalaValid(Koala koala){
        if(koala.getSleepHour() < 18){
            throw new AnimalException("Koala credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }
}
