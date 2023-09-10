package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.AnimalValidate;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init() {
        kangaroos = new HashMap<>();
    }

    @GetMapping("/")
    public List<Kangaroo> getAllKangaroos() {
        return kangaroos.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangaroo getKangaroo(@PathVariable int id) {
        AnimalValidate.isIdValid(id);
        AnimalValidate.isIdNotExist(kangaroos, id);
        if (!kangaroos.containsKey(id)) {
            //TODO id is not exist;
        }
        return kangaroos.get(id);
    }

    @PostMapping("/")
    public Kangaroo save(@RequestBody Kangaroo kangaroo) {
        AnimalValidate.isIdValid(kangaroo.getId());
        AnimalValidate.isIdAlreadyExist(kangaroos, kangaroo.getId());
        AnimalValidate.isAnimalVAlid(kangaroo);
        AnimalValidate.isKangarooValid(kangaroo);
        //TODO check kangaroo properties;
        kangaroos.put(kangaroo.getId(), kangaroo);
        return kangaroo;
    }

    @PutMapping("/{id}")
    public Kangaroo save(@PathVariable int id, @RequestBody Kangaroo kangaroo) {
        AnimalValidate.isIdValid(id);
        AnimalValidate.isIdNotExist(kangaroos, id);
        AnimalValidate.isAnimalVAlid(kangaroo);
        AnimalValidate.isKangarooValid(kangaroo);
        kangaroo.setId(id);
        kangaroos.put(id, kangaroo);
        return kangaroo;
    }

    @DeleteMapping("/{id}")
    public Kangaroo delete(@PathVariable int id) {
        AnimalValidate.isIdValid(id);
        AnimalValidate.isIdNotExist(kangaroos, id);

        Kangaroo deletedKangaroo = kangaroos.get(id);
        kangaroos.remove(id);
        return deletedKangaroo;
    }
}
