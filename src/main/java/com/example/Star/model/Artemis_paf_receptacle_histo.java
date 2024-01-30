package com.example.Star.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Artemis_paf_receptacle_histo")
public class Artemis_paf_receptacle_histo {

    @Column(name="typeenr")
    private String typeenr;

    @Id
    @Column(name="coetbt")
    private String coetbt;

    @Column(name="pedode")
    private String pedode;

    @Column(name="corafn")
    private String corafn;

    @Column(name="coroli")
    private String coroli;

    @Column(name="coepc3")
    private String coepc3;

    @Column(name="coacmn")
    private String coacmn;

    @Column(name="coeltg")
    private String coeltg;

    @Column(name="coatcg")
    private String coatcg;

    @Column(name="codevd")
    private String codevd;

    @Column(name="coappl")
    private String coappl;

    @Column(name="convre")
    private String convre;

    @Column(name="connum")
    private String connum;

    @Column(name="ddcoer")
    private String ddcoer;

    @Column(name="dfcoer")
    private String dfcoer;

    @Column(name="txconc")
    private String txconc;

    @Column(name="txrefn")
    private String txrefn;

    @Column(name="cticob")
    private String cticob;

    @Column(name="coicob")
    private String coicob;

    @Column(name="mticob")
    private String mticob;

    @Column(name= "txcol5")
    private String txcol5;

    @Column(name="condea")
    private String condea;

    @Column(name="cnfpma")
    private String cnfpma;

    @Column(name="corffa")
    private String corffa;

    @Column(name="comont")
    private String comont;

    @Column(name="ctpctr")
    private String ctpctr;

    @Column(name="ctpaco")
    private String ctpaco;

    @Column(name="cotytx")
    private String cotytx;

    @Column(name="ctamof")
    private String ctamof;

    @Column(name="coipte")
    private String coipte;

    @Column(name="chcain")
    private String chcain;

    @Column(name="copeem")
    private String copeem;

    @Column(name="cotccl")
    private String cotccl;

    @Column(name="mticod")
    private String mticod;

    @Column(name="coenob")
    private String coenob;

    @Column(name="txmgcb")
    private String txmgcb;

    @Column(name="comecr")
    private String comecr;



    @Column(name="daindc")
    private String daindc;

    @Column(name="ddebv1")
    private String ddebv1;

    @Column(name="cochfi")
    private String cochfi;



    @Column(name="ctrdct")
    private String ctrdct;

    @Column(name="lizode")
    private String lizode;



    @Column(name="date")
    private String date;



    public String getTypeenr() {
        return typeenr;
    }

    public void setTypeenr(String typeenr) {
        this.typeenr = typeenr;
    }

    public String getCoetbt() {
        return coetbt;
    }

    public void setCoetbt(String coetbt) {
        this.coetbt = coetbt;
    }

    public String getPedode() {
        return pedode;
    }

    public void setPedode(String pedode) {
        this.pedode = pedode;
    }

    public String getCorafn() {
        return corafn;
    }

    public void setCorafn(String corafn) {
        this.corafn = corafn;
    }

    public String getCoroli() {
        return coroli;
    }

    public void setCoroli(String coroli) {
        this.coroli = coroli;
    }

    public String getCoepc3() {
        return coepc3;
    }

    public void setCoepc3(String coepc3) {
        this.coepc3 = coepc3;
    }

    public String getCoacmn() {
        return coacmn;
    }

    public void setCoacmn(String coacmn) {
        this.coacmn = coacmn;
    }

    public String getCoeltg() {
        return coeltg;
    }

    public void setCoeltg(String coeltg) {
        this.coeltg = coeltg;
    }

    public String getCoatcg() {
        return coatcg;
    }

    public void setCoatcg(String coatcg) {
        this.coatcg = coatcg;
    }

    public String getCodevd() {
        return codevd;
    }

    public void setCodevd(String codevd) {
        this.codevd = codevd;
    }

    public String getCoappl() {
        return coappl;
    }

    public void setCoappl(String coappl) {
        this.coappl = coappl;
    }

    public String getConvre() {
        return convre;
    }

    public void setConvre(String convre) {
        this.convre = convre;
    }

    public String getConnum() {
        return connum;
    }

    public void setConnum(String connum) {
        this.connum = connum;
    }

    public String getDdcoer() {
        return ddcoer;
    }

    public void setDdcoer(String ddcoer) {
        this.ddcoer = ddcoer;
    }

    public String getDfcoer() {
        return dfcoer;
    }

    public void setDfcoer(String dfcoer) {
        this.dfcoer = dfcoer;
    }

    public String getTxconc() {
        return txconc;
    }

    public void setTxconc(String txconc) {
        this.txconc = txconc;
    }

    public String getTxrefn() {
        return txrefn;
    }

    public void setTxrefn(String txrefn) {
        this.txrefn = txrefn;
    }

    public String getCticob() {
        return cticob;
    }

    public void setCticob(String cticob) {
        this.cticob = cticob;
    }

    public String getCoicob() {
        return coicob;
    }

    public void setCoicob(String coicob) {
        this.coicob = coicob;
    }

    public String getMticob() {
        return mticob;
    }

    public void setMticob(String mticob) {
        this.mticob = mticob;
    }

    public String getTxcol5() {
        return txcol5;
    }

    public void setTxcol5(String txcol5) {
        this.txcol5 = txcol5;
    }

    public String getCondea() {
        return condea;
    }

    public void setCondea(String condea) {
        this.condea = condea;
    }

    public String getCnfpma() {
        return cnfpma;
    }

    public void setCnfpma(String cnfpma) {
        this.cnfpma = cnfpma;
    }

    public String getCorffa() {
        return corffa;
    }

    public void setCorffa(String corffa) {
        this.corffa = corffa;
    }

    public String getComont() {
        return comont;
    }

    public void setComont(String comont) {
        this.comont = comont;
    }

    public String getCtpctr() {
        return ctpctr;
    }

    public void setCtpctr(String ctpctr) {
        this.ctpctr = ctpctr;
    }

    public String getCtpaco() {
        return ctpaco;
    }

    public void setCtpaco(String ctpaco) {
        this.ctpaco = ctpaco;
    }

    public String getCotytx() {
        return cotytx;
    }

    public void setCotytx(String cotytx) {
        this.cotytx = cotytx;
    }

    public String getCtamof() {
        return ctamof;
    }

    public void setCtamof(String ctamof) {
        this.ctamof = ctamof;
    }

    public String getCoipte() {
        return coipte;
    }

    public void setCoipte(String coipte) {
        this.coipte = coipte;
    }

    public String getChcain() {
        return chcain;
    }

    public void setChcain(String chcain) {
        this.chcain = chcain;
    }

    public String getCopeem() {
        return copeem;
    }

    public void setCopeem(String copeem) {
        this.copeem = copeem;
    }

    public String getCotccl() {
        return cotccl;
    }

    public void setCotccl(String cotccl) {
        this.cotccl = cotccl;
    }

    public String getMticod() {
        return mticod;
    }

    public void setMticod(String mticod) {
        this.mticod = mticod;
    }

    public String getCoenob() {
        return coenob;
    }

    public void setCoenob(String coenob) {
        this.coenob = coenob;
    }

    public String getTxmgcb() {
        return txmgcb;
    }

    public void setTxmgcb(String txmgcb) {
        this.txmgcb = txmgcb;
    }

    public String getComecr() {
        return comecr;
    }

    public void setComecr(String comecr) {
        this.comecr = comecr;
    }



    public String getDaindc() {
        return daindc;
    }

    public void setDaindc(String daindc) {
        this.daindc = daindc;
    }

    public String getDdebv1() {
        return ddebv1;
    }

    public void setDdebv1(String ddebv1) {
        this.ddebv1 = ddebv1;
    }

    public String getCochfi() {
        return cochfi;
    }

    public void setCochfi(String cochfi) {
        this.cochfi = cochfi;
    }



    public String getCtrdct() {
        return ctrdct;
    }

    public void setCtrdct(String ctrdct) {
        this.ctrdct = ctrdct;
    }

    public String getLizode() {
        return lizode;
    }

    public void setLizode(String lizode) {
        this.lizode = lizode;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }




    public Artemis_paf_receptacle_histo() {
    }


}
