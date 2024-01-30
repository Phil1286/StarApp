package com.example.Star.repository;

import com.example.Star.model.Artemis_paf_receptacle_histo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface Artemis_paf_receptacle_histoRepository extends CrudRepository<Artemis_paf_receptacle_histo,Long> {

    @Query("SELECT count(*), coetbt FROM Artemis_paf_receptacle_histo WHERE coacmn like '%EU' AND date BETWEEN '2021-05-01' AND '2023-05-01' GROUP BY coetbt")
    List<Object> findAllActivehistoNative();


}
