package com.example.Star.repository;

import com.example.Star.model.artemis_paf_pivot_aggregated_histo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface Artemis_paf_pivot_aggregated_histoRepository extends CrudRepository<artemis_paf_pivot_aggregated_histo, Long> {

    @Query("SELECT count(*), code_raf FROM artemis_paf_pivot_aggregated_histo WHERE enc_a_co IS NOT NULL AND date BETWEEN '2021-05-01' AND '2023-05-01' GROUP BY code_raf")
    List<Object> findAllActivehistoNative();
}
