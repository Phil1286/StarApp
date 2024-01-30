package com.example.Star.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="rs_research_results_related_content")
public class Rs_research_results_related_content {


    @Column(name="content_id")
    private long content_id;


    @Id
    @Column(name="run_id")
    private String runid;

    @Column(name="run_time")
    private String run_time;


    @Column(name="prediction")
    private Double prediction;

    @Column(name="related_content_id")
    private long related_content_id;


    public long getContent_id() {
        return content_id;
    }

    public void setContent_id(long content_id) {
        this.content_id = content_id;
    }


    public String getRun_id() {
        return runid;
    }

    public void setRun_id(String run_id) {
        this.runid = runid;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public Double getPrediction() {
        return prediction;
    }

    public void setPrediction(Double prediction) {
        this.prediction = prediction;
    }

    public long getRelated_content_id() {
        return related_content_id;
    }

    public void setRelated_content_id(long related_content_id) {
        this.related_content_id = related_content_id;
    }

    public Rs_research_results_related_content(String runid, String run_time) {

        this.runid = runid;
        this.run_time = run_time;

    }

    public Rs_research_results_related_content() {
    }

}

