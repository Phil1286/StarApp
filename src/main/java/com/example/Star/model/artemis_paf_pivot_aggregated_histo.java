package com.example.Star.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artemis_paf_pivot_aggregated_histo")
public class artemis_paf_pivot_aggregated_histo {

    @Column(name="yearmonth")
    private String yearmonth;

    @Column(name="year")
    private String year;

    @Column(name="month")
    private String month;

    @Column(name="code_raf")
    private String code_raf;

    @Column(name="activity_elem_id")
    private String activity_elem_id;

    @Column(name="code_ebf")
    private String code_ebf;

    @Column(name="fees")
    private Double fees;

    @Id
    @Column(name="pnb_mtd")
    private Double pnb_mtd;

    @Column(name="enc_a_co")
    private Double enc_a_co;

    @Column(name="enc_a_dao")
    private Double enc_a_dao;

    @Column(name="enc_a_obo")
    private Double enc_a_obo;

    @Column(name="enc_eop_co")
    private Double enc_eop_co;


    @Column(name="enc_eop_dao")
    private Double enc_eop_dao;

    @Column(name="enc_eop_obo")
    private Double enc_eop_obo;

    @Column(name="rwa_ytd")
    private Double rwa_ytd;


    @Column(name="cva_ytd")
    private Double cva_ytd;


    @Column(name="costofrisk_mtd")
    private Double costofrisk_mtd;


    @Column(name="rwa_m_ytd")
    private Double rwa_m_ytd;

    @Column(name="cva_m_ytd")
    private Double cva_m_ytd;


    @Column(name="date")
    private String date;


    public String getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCode_raf() {
        return code_raf;
    }

    public void setCode_raf(String code_raf) {
        this.code_raf = code_raf;
    }

    public String getActivity_elem_id() {
        return activity_elem_id;
    }

    public void setActivity_elem_id(String activity_elem_id) {
        this.activity_elem_id = activity_elem_id;
    }

    public String getCode_ebf() {
        return code_ebf;
    }

    public void setCode_ebf(String code_ebf) {
        this.code_ebf = code_ebf;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Double getPnb_mtd() {
        return pnb_mtd;
    }

    public void setPnb_mtd(Double pnb_mtd) {
        this.pnb_mtd = pnb_mtd;
    }

    public Double getEnc_a_co() {
        return enc_a_co;
    }

    public void setEnc_a_co(Double enc_a_co) {
        this.enc_a_co = enc_a_co;
    }

    public Double getEnc_a_dao() {
        return enc_a_dao;
    }

    public void setEnc_a_dao(Double enc_a_dao) {
        this.enc_a_dao = enc_a_dao;
    }

    public Double getEnc_a_obo() {
        return enc_a_obo;
    }

    public void setEnc_a_obo(Double enc_a_obo) {
        this.enc_a_obo = enc_a_obo;
    }

    public Double getEnc_eop_co() {
        return enc_eop_co;
    }

    public void setEnc_eop_co(Double enc_eop_co) {
        this.enc_eop_co = enc_eop_co;
    }

    public Double getEnc_eop_dao() {
        return enc_eop_dao;
    }

    public void setEnc_eop_dao(Double enc_eop_dao) {
        this.enc_eop_dao = enc_eop_dao;
    }

    public Double getEnc_eop_obo() {
        return enc_eop_obo;
    }

    public void setEnc_eop_obo(Double enc_eop_obo) {
        this.enc_eop_obo = enc_eop_obo;
    }

    public Double getRwa_ytd() {
        return rwa_ytd;
    }

    public void setRwa_ytd(Double rwa_ytd) {
        this.rwa_ytd = rwa_ytd;
    }

    public Double getCva_ytd() {
        return cva_ytd;
    }

    public void setCva_ytd(Double cva_ytd) {
        this.cva_ytd = cva_ytd;
    }

    public Double getCostofrisk_mtd() {
        return costofrisk_mtd;
    }

    public void setCostofrisk_mtd(Double costofrisk_mtd) {
        this.costofrisk_mtd = costofrisk_mtd;
    }

    public Double getRwa_m_ytd() {
        return rwa_m_ytd;
    }

    public void setRwa_m_ytd(Double rwa_m_ytd) {
        this.rwa_m_ytd = rwa_m_ytd;
    }

    public Double getCva_m_ytd() {
        return cva_m_ytd;
    }

    public void setCva_m_ytd(Double cva_m_ytd) {
        this.cva_m_ytd = cva_m_ytd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public artemis_paf_pivot_aggregated_histo() {
    }
}
