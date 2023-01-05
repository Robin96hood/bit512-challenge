package com.example.bit512.service.Interface;

import com.example.bit512.entity.City;

import java.util.List;

public interface CityService {

    City create(City entity);
    List<City> findAll();
    List<City> allCitiesByDepartment (Long id);
}
