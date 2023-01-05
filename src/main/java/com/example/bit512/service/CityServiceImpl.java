package com.example.bit512.service;

import com.example.bit512.entity.City;
import com.example.bit512.repository.CityRepository;
import com.example.bit512.service.Interface.CityService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /*
     * create city entity
     */

    @Override
    public City create(City entity) {

        return cityRepository.save(entity);
    }

    /*
     * query all cities
     */

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    /*
     * query all cities by department
     */
    @Override
    public List<City> allCitiesByDepartment(Long id) {
        return cityRepository.allCitiesByDepartment(id);
    }
}
