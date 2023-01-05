package com.example.bit512.repository;

import com.example.bit512.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    /*
     * get all cities by id department
     */
    @Query(value = """
             select c from City c
             left join fetch c.department dep
             where dep.id = :id
            """)
    List<City> allCitiesByDepartment(Long id);
}
