package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();


    @GetMapping
    public List<Animal> getData(){
        return animals.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id){
            return animals.get(id);
    }

    @PostMapping
    public void addAnimal(@RequestBody Animal animal){
        animals.put(animal.getId(), animal);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Animal animal){
        animals.put(id, animal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        animals.remove(id);
    }
}
