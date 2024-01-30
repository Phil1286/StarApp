package com.example.Star.repository;


import com.example.Star.model.Fenergo_vwnxslegalentityriskfactorsq30_histo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface Fenergo_vwnxslegalentityriskfactorsq30_histoRepository extends CrudRepository<Fenergo_vwnxslegalentityriskfactorsq30_histo, Long> {


    @Query("SELECT currentid,  legalentityid, count(issanctions) as transac_repo FROM Fenergo_vwnxslegalentityriskfactorsq30_histo WHERE mainbusinessarea LIKE 'Fr%' GROUP BY currentid, legalentityid")
    List<Object> findAllActhistoNative();

}
