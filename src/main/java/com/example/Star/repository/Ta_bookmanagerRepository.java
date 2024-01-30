package com.example.Star.repository;

import com.example.Star.model.Ta_bookmanager;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface Ta_bookmanagerRepository extends CrudRepository<Ta_bookmanager, Integer> {
    Object findAll(Pageable paging);

   /* @Query(
            value = "SELECT * FROM ta_bookmanager",
            nativeQuery = true)
    Collection<Ta_bookmanager> findAllActiveUsersNative();




    Object findAll(Pageable pageable);*/
}
