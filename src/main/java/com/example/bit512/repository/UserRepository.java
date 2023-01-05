package com.example.bit512.repository;

import com.example.bit512.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    /*
     * get all users by id city
     */
    @Query(value = """
             select u from User u
             left join fetch u.city ciu
             where ciu.id = :id
            """)
    List<User> allUsersByCity(Long id);
}
