package com.example.Star.repository;

import com.example.Star.model.Rs_research_results;
import com.example.Star.model.Rs_research_results_related_content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedNativeQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface Rs_research_results_related_contentRepository  extends CrudRepository<Rs_research_results,Long> {

    @Query(
            "select run_id,  run_time, count(content_id) as count_prediction_hybrid_reco from Rs_research_results as o where  content_id > 1385988 group by run_id,  run_time"
    )
    List<Object> findAllActiveUsersNative(String run_id, String run_time);


}
