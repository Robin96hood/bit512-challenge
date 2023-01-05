package com.example.bit512.controller;

import com.example.bit512.entity.City;
import com.example.bit512.service.Interface.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bit512/city/")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    /*
     * create city entity
     */

    @PostMapping(path = "/new")
    public City create(@RequestBody final City entity) {
        return cityService.create(entity);
    }

    /*
     * query all cities
     */

    @GetMapping("/all")
    public List<City> listCities() {
        return cityService.findAll();
    }

    /*
     * query all cities by department
     */

    @GetMapping(path = "/list/{id}")
    public List<City> findByUser(@PathVariable final Long id) {
        return cityService.allCitiesByDepartment(id);
    }

}
