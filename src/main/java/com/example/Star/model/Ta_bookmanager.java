package com.example.Star.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="ta_bookmanager")
public class Ta_bookmanager {

    @Column(name="subsectionid")
    private Double subsectionid;

    @Id
    @Column(name="subsectionshortname")
    private String subsectionshortname;

    @Column(name="subsectionlongname")
    private String subsectionlongname;

    @Column(name="subunitid")
    private Double subunitid;
    @Column(name="subunitshortname")
    private String subunitshortname;

    @Column(name="subunitlongname")
    private String subunitlongname;


    @Column(name="unitid")
    private Double unitid;

    @Column(name="unitshortname")
    private String unitshortname;

    @Column(name="unitlongname")
    private String unitlongname;

    @Column(name="sectorid")
    private Double sectorid;


    @Column(name="sectorshortname")
    private String sectorshortname;

    @Column(name="subserviceid")
    private Double subserviceid;

    @Column(name="subserviceshortname")
    private String  subserviceshortname;

    @Column(name="subservicelongname")
    private String subservicelongname;

    @Column(name="perimeterid")
    private Double perimeterid;

    @Column(name="perimetershortname")
    private String perimetershortname;

    @Column(name="perimeterlongname")
    private String perimeterlongname;

    @Column(name="serviceid")
    private Double serviceid;

    @Column(name="serviceshortname")
    private String serviceshortname;

    @Column(name="servicelongname")
    private String servicelongname;

    @Column(name="location")
    private String location;

    @Column(name="subsectmanager")
    private String subsectmanager;

    @Column(name="subsectmanageriup")
    private String subsectmanageriup;

    @Column(name="deactivated")
    private String deactivated;

    @Column(name="activedate")
    private Date activedate;

    @Column(name="deactivationdate")
    private Date deactivationdate;

    @Column(name="activitycode")
    private String activitycode;

    @Column(name="sectcode")
    private String sectcode;

    @Column(name="sectlabel")
    private String sectlabel;

    @Column(name="domainid")
    private Double domainid;

    @Column(name="domainshortname")
    private String domainshortname;

    @Column(name="domainlongname")
    private String domainlongname;

    @Column(name="subdomainid")
    private Double subdomainid;

    @Column(name="subdomainshortname")
    private String subdomainshortname;

    @Column(name="subdomainlongname")
    private String subdomainlongname;

    @Column(name="mataccountingentity")
    private String mataccountingentity;

    @Column(name="o2d2_reorg")
    private String o2d2_reorg;

    public Double getSubsectionid() {
        return subsectionid;
    }

    public void setSubsectionid(Double subsectionid) {
        this.subsectionid = subsectionid;
    }

    public String getSubsectionshortname() {
        return subsectionshortname;
    }

    public void setSubsectionshortname(String subsectionshortname) {
        this.subsectionshortname = subsectionshortname;
    }

    public String getSubsectionlongname() {
        return subsectionlongname;
    }

    public void setSubsectionlongname(String subsectionlongname) {
        this.subsectionlongname = subsectionlongname;
    }

    public Double getSubunitid() {
        return subunitid;
    }

    public void setSubunitid(Double subunitid) {
        this.subunitid = subunitid;
    }

    public String getSubunitshortname() {
        return subunitshortname;
    }

    public void setSubunitshortname(String subunitshortname) {
        this.subunitshortname = subunitshortname;
    }

    public String getSubunitlongname() {
        return subunitlongname;
    }

    public void setSubunitlongname(String subunitlongname) {
        this.subunitlongname = subunitlongname;
    }

    public Double getUnitid() {
        return unitid;
    }

    public void setUnitid(Double unitid) {
        this.unitid = unitid;
    }

    public String getUnitshortname() {
        return unitshortname;
    }

    public void setUnitshortname(String unitshortname) {
        this.unitshortname = unitshortname;
    }

    public String getUnitlongname() {
        return unitlongname;
    }

    public void setUnitlongname(String unitlongname) {
        this.unitlongname = unitlongname;
    }

    public Double getSectorid() {
        return sectorid;
    }

    public void setSectorid(Double sectorid) {
        this.sectorid = sectorid;
    }

    public String getSectorshortname() {
        return sectorshortname;
    }

    public void setSectorshortname(String sectorshortname) {
        this.sectorshortname = sectorshortname;
    }

    public Double getSubserviceid() {
        return subserviceid;
    }

    public void setSubserviceid(Double subserviceid) {
        this.subserviceid = subserviceid;
    }

    public String getSubserviceshortname() {
        return subserviceshortname;
    }

    public void setSubserviceshortname(String subserviceshortname) {
        this.subserviceshortname = subserviceshortname;
    }

    public String getSubservicelongname() {
        return subservicelongname;
    }

    public void setSubservicelongname(String subservicelongname) {
        this.subservicelongname = subservicelongname;
    }

    public Double getPerimeterid() {
        return perimeterid;
    }

    public void setPerimeterid(Double perimeterid) {
        this.perimeterid = perimeterid;
    }

    public String getPerimetershortname() {
        return perimetershortname;
    }

    public void setPerimetershortname(String perimetershortname) {
        this.perimetershortname = perimetershortname;
    }

    public String getPerimeterlongname() {
        return perimeterlongname;
    }

    public void setPerimeterlongname(String perimeterlongname) {
        this.perimeterlongname = perimeterlongname;
    }

    public Double getServiceid() {
        return serviceid;
    }

    public void setServiceid(Double serviceid) {
        this.serviceid = serviceid;
    }

    public String getServiceshortname() {
        return serviceshortname;
    }

    public void setServiceshortname(String serviceshortname) {
        this.serviceshortname = serviceshortname;
    }

    public String getServicelongname() {
        return servicelongname;
    }

    public void setServicelongname(String servicelongname) {
        this.servicelongname = servicelongname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubsectmanager() {
        return subsectmanager;
    }

    public void setSubsectmanager(String subsectmanager) {
        this.subsectmanager = subsectmanager;
    }

    public String getSubsectmanageriup() {
        return subsectmanageriup;
    }

    public void setSubsectmanageriup(String subsectmanageriup) {
        this.subsectmanageriup = subsectmanageriup;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(String deactivated) {
        this.deactivated = deactivated;
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public Date getDeactivationdate() {
        return deactivationdate;
    }

    public void setDeactivationdate(Date deactivationdate) {
        this.deactivationdate = deactivationdate;
    }

    public String getActivitycode() {
        return activitycode;
    }

    public void setActivitycode(String activitycode) {
        this.activitycode = activitycode;
    }

    public String getSectcode() {
        return sectcode;
    }

    public void setSectcode(String sectcode) {
        this.sectcode = sectcode;
    }

    public String getSectlabel() {
        return sectlabel;
    }

    public void setSectlabel(String sectlabel) {
        this.sectlabel = sectlabel;
    }

    public Double getDomainid() {
        return domainid;
    }

    public void setDomainid(Double domainid) {
        this.domainid = domainid;
    }

    public String getDomainshortname() {
        return domainshortname;
    }

    public void setDomainshortname(String domainshortname) {
        this.domainshortname = domainshortname;
    }

    public String getDomainlongname() {
        return domainlongname;
    }

    public void setDomainlongname(String domainlongname) {
        this.domainlongname = domainlongname;
    }

    public Double getSubdomainid() {
        return subdomainid;
    }

    public void setSubdomainid(Double subdomainid) {
        this.subdomainid = subdomainid;
    }

    public String getSubdomainshortname() {
        return subdomainshortname;
    }

    public void setSubdomainshortname(String subdomainshortname) {
        this.subdomainshortname = subdomainshortname;
    }

    public String getSubdomainlongname() {
        return subdomainlongname;
    }

    public void setSubdomainlongname(String subdomainlongname) {
        this.subdomainlongname = subdomainlongname;
    }

    public String getMataccountingentity() {
        return mataccountingentity;
    }

    public void setMataccountingentity(String mataccountingentity) {
        this.mataccountingentity = mataccountingentity;
    }

    public String getO2d2_reorg() {
        return o2d2_reorg;
    }

    public void setO2d2_reorg(String o2d2_reorg) {
        this.o2d2_reorg = o2d2_reorg;
    }

    @Override
    public String toString() {
        return "Ta_bookmanager{" +
                "subsectionid=" + subsectionid +
                ", subsectionshortname='" + subsectionshortname + '\'' +
                ", subsectionlongname='" + subsectionlongname + '\'' +
                ", subunitid=" + subunitid +
                ", subunitshortname='" + subunitshortname + '\'' +
                ", subunitlongname='" + subunitlongname + '\'' +
                ", unitid=" + unitid +
                ", unitshortname='" + unitshortname + '\'' +
                ", unitlongname='" + unitlongname + '\'' +
                ", sectorid=" + sectorid +
                ", sectorshortname='" + sectorshortname + '\'' +
                ", subserviceid=" + subserviceid +
                ", subserviceshortname='" + subserviceshortname + '\'' +
                ", subservicelongname='" + subservicelongname + '\'' +
                ", perimeterid=" + perimeterid +
                ", perimetershortname='" + perimetershortname + '\'' +
                ", perimeterlongname='" + perimeterlongname + '\'' +
                ", serviceid=" + serviceid +
                ", serviceshortname='" + serviceshortname + '\'' +
                ", servicelongname='" + servicelongname + '\'' +
                ", location='" + location + '\'' +
                ", subsectmanager='" + subsectmanager + '\'' +
                ", subsectmanageriup='" + subsectmanageriup + '\'' +
                ", deactivated='" + deactivated + '\'' +
                ", activedate=" + activedate +
                ", deactivationdate=" + deactivationdate +
                ", activitycode='" + activitycode + '\'' +
                ", sectcode='" + sectcode + '\'' +
                ", sectlabel='" + sectlabel + '\'' +
                ", domainid=" + domainid +
                ", domainshortname='" + domainshortname + '\'' +
                ", domainlongname='" + domainlongname + '\'' +
                ", subdomainid=" + subdomainid +
                ", subdomainshortname='" + subdomainshortname + '\'' +
                ", subdomainlongname='" + subdomainlongname + '\'' +
                ", mataccountingentity=" + mataccountingentity +
                ", o2d2_reorg='" + o2d2_reorg + '\'' +
                '}';
    }


    public Ta_bookmanager() {
    }
}
