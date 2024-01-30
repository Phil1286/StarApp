package com.example.Star.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="Fenergo_vwnxslegalentityriskfactorsq30_histo")
public class Fenergo_vwnxslegalentityriskfactorsq30_histo {

    @Id
    @Column(name="currentid")
    private String currentid;

    @Column(name="previousid")
    private String previousid;

    @Column(name="legalentityid")
    private Integer legalentityid;

    @Column(name="legalentitytype")
    private String legalentitytype;

    @Column(name="mainbusinesscountryid")
    private Integer mainbusinesscountryid;

    @Column(name="mainbusinessarea")
    private String mainbusinessarea;

    @Column(name="mainbusinessareacountrycode")
    private String mainbusinessareacountrycode;

    @Column(name="transactioncountryid")
    private Integer transactioncountryid;

    @Column(name="transactioncountryname")
    private String transactioncountryname;
    @Column(name="transactioncountrycode")
    private String transactioncountrycode;

    @Column(name="expectedproductstotransactwith")
    private Integer expectedproductstotransactwith;

    @Column(name="expectedproductstotransactwithname")
    private String expectedproductstotransactwithname;

    @Column(name="natureofactivitybusiness")
    private String natureofactivitybusiness;

    @Column(name="pep")
    private String pep;

    @Column(name="private")
    private Boolean privat;
    @Column(name="sanctions")
    private String sanctions;
    @Column(name="adversemedia")
    private String adversemedia;

    @Column(name="riskcategoryid")
    private Integer riskcategoryid;

    @Column(name="ispep")
    private Integer ispep;

    @Column(name="issanctions")
    private Integer issanctions;

    @Column(name="isadversemedia")
    private Integer isadversemedia;
    @Column(name="sanctionspepadversemediaid")
    private Integer sanctionspepadversemediaid;

    @Column(name="sanctionspepadversemedianame")
    private String sanctionspepadversemedianame;

    @Column(name="sensitiveactivityname")
    private String sensitiveactivityname;

    @Column(name="sensitiveactivity")
    private Integer sensitiveactivity;

    @Column(name="year")
    private String year;

    @Column(name="quarter")
    private Integer quarter;

    @Column(name="month")
    private String month;


    @Column(name="day")
    private String day;


    public String getCurrentid() {
        return currentid;
    }

    public void setCurrentid(String currentid) {
        this.currentid = currentid;
    }

    public String getPreviousid() {
        return previousid;
    }

    public void setPreviousid(String previousid) {
        this.previousid = previousid;
    }

    public Integer getLegalentityid() {
        return legalentityid;
    }

    public void setLegalentityid(Integer legalentityid) {
        this.legalentityid = legalentityid;
    }

    public String getLegalentitytype() {
        return legalentitytype;
    }

    public void setLegalentitytype(String legalentitytype) {
        this.legalentitytype = legalentitytype;
    }

    public Integer getMainbusinesscountryid() {
        return mainbusinesscountryid;
    }

    public void setMainbusinesscountryid(Integer mainbusinesscountryid) {
        this.mainbusinesscountryid = mainbusinesscountryid;
    }

    public String getMainbusinessarea() {
        return mainbusinessarea;
    }

    public void setMainbusinessarea(String mainbusinessarea) {
        this.mainbusinessarea = mainbusinessarea;
    }

    public String getMainbusinessareacountrycode() {
        return mainbusinessareacountrycode;
    }

    public void setMainbusinessareacountrycode(String mainbusinessareacountrycode) {
        this.mainbusinessareacountrycode = mainbusinessareacountrycode;
    }

    public Integer getTransactioncountryid() {
        return transactioncountryid;
    }

    public void setTransactioncountryid(Integer transactioncountryid) {
        this.transactioncountryid = transactioncountryid;
    }

    public String getTransactioncountryname() {
        return transactioncountryname;
    }

    public void setTransactioncountryname(String transactioncountryname) {
        this.transactioncountryname = transactioncountryname;
    }

    public String getTransactioncountrycode() {
        return transactioncountrycode;
    }

    public void setTransactioncountrycode(String transactioncountrycode) {
        this.transactioncountrycode = transactioncountrycode;
    }

    public Integer getExpectedproductstotransactwith() {
        return expectedproductstotransactwith;
    }

    public void setExpectedproductstotransactwith(Integer expectedproductstotransactwith) {
        this.expectedproductstotransactwith = expectedproductstotransactwith;
    }

    public String getExpectedproductstotransactwithname() {
        return expectedproductstotransactwithname;
    }

    public void setExpectedproductstotransactwithname(String expectedproductstotransactwithname) {
        this.expectedproductstotransactwithname = expectedproductstotransactwithname;
    }

    public String getNatureofactivitybusiness() {
        return natureofactivitybusiness;
    }

    public void setNatureofactivitybusiness(String natureofactivitybusiness) {
        this.natureofactivitybusiness = natureofactivitybusiness;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

    public Boolean getPrivat() {
        return privat;
    }

    public void setPrivat(Boolean privat) {
        this.privat = privat;
    }

    public String getSanctions() {
        return sanctions;
    }

    public void setSanctions(String sanctions) {
        this.sanctions = sanctions;
    }

    public String getAdversemedia() {
        return adversemedia;
    }

    public void setAdversemedia(String adversemedia) {
        this.adversemedia = adversemedia;
    }

    public Integer getRiskcategoryid() {
        return riskcategoryid;
    }

    public void setRiskcategoryid(Integer riskcategoryid) {
        this.riskcategoryid = riskcategoryid;
    }

    public Integer getIspep() {
        return ispep;
    }

    public void setIspep(Integer ispep) {
        this.ispep = ispep;
    }

    public Integer getIssanctions() {
        return issanctions;
    }

    public void setIssanctions(Integer issanctions) {
        this.issanctions = issanctions;
    }

    public Integer getIsadversemedia() {
        return isadversemedia;
    }

    public void setIsadversemedia(Integer isadversemedia) {
        this.isadversemedia = isadversemedia;
    }

    public Integer getSanctionspepadversemediaid() {
        return sanctionspepadversemediaid;
    }

    public void setSanctionspepadversemediaid(Integer sanctionspepadversemediaid) {
        this.sanctionspepadversemediaid = sanctionspepadversemediaid;
    }

    public String getSanctionspepadversemedianame() {
        return sanctionspepadversemedianame;
    }

    public void setSanctionspepadversemedianame(String sanctionspepadversemedianame) {
        this.sanctionspepadversemedianame = sanctionspepadversemedianame;
    }

    public String getSensitiveactivityname() {
        return sensitiveactivityname;
    }

    public void setSensitiveactivityname(String sensitiveactivityname) {
        this.sensitiveactivityname = sensitiveactivityname;
    }

    public Integer getSensitiveactivity() {
        return sensitiveactivity;
    }

    public void setSensitiveactivity(Integer sensitiveactivity) {
        this.sensitiveactivity = sensitiveactivity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public Fenergo_vwnxslegalentityriskfactorsq30_histo() {
    }

    public Fenergo_vwnxslegalentityriskfactorsq30_histo(String currentid, Integer legalentityid) {
        this.currentid = currentid;
        this.legalentityid = legalentityid;
    }
}
