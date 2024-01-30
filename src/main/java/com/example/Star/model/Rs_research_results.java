package com.example.Star.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rs_research_results_related_content")
public class Rs_research_results {

    @Id
    @Column(name="run_id")
    private String run_id;

    @Column(name="run_time")
    private String run_time;

    public String getRun_id() {
        return run_id;
    }

    public void setRun_id(String run_id) {
        this.run_id = run_id;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public Rs_research_results() {
    }

    public Rs_research_results(String run_id, String run_time) {
        this.run_id = run_id;
        this.run_time = run_time;
    }
}
