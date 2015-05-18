package com.mycompany.asyncreq.dao;
// Generated Apr 28, 2015 1:27:36 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Date;

/**
 * Ttradedata generated by hbm2java
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ttradedata  implements java.io.Serializable {


     private Integer tradeQuantity;
     private Long NetWeight;
     private Long TradeValue;
     private int rtCode;
     private int ptCode;
     private int rgCode;
     private int qtCode;
     private int estCode;
     private int perCode;
     public String cmdCode;
     private Date period;

    public Ttradedata() {
    }
   
  public Ttradedata( int rtCode, int ptCode, int rgCode, int qtCode, int estCode, Date period, Integer tradeQuantity, Long NetWeight, Long TradeValue,String cmdCode) {

       this.rtCode = rtCode;
       this.ptCode = ptCode;
       this.rgCode = rgCode;
       this.qtCode = qtCode;
       this.estCode = estCode;
       this.period = period;
       this.cmdCode = cmdCode;
       this.tradeQuantity = tradeQuantity;
       this.NetWeight = NetWeight;
       this.TradeValue = TradeValue;
    }
    

         @SuppressWarnings("empty-statement")
    public ArrayList<String> setString()
    {
         ArrayList<String> ar=new ArrayList<String>();
        try{
            
            ar.add(Integer.toString(this.ptCode));
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String currentTime = sdf.format(this.period);
            ar.add(currentTime);
            if(this.NetWeight==null)
                ar.add(Long.toString(0));
            else
                ar.add(  Long.toString(this.NetWeight));
            ar.add(Integer.toString(this.rtCode));
            ar.add(Integer.toString(this.rgCode));
            ar.add(Integer.toString(this.qtCode));
            ar.add(Integer.toString(this.estCode));
            if(this.TradeValue==null)
                ar.add(Long.toString(0));
            else
                ar.add(  Long.toString(this.TradeValue));
            if(this.tradeQuantity==null)
                ar.add(Long.toString(0));
            else
                ar.add(Integer.toString(this.tradeQuantity));
            ar.add(this.cmdCode);
        }
        catch(Exception e)
        {}
        finally{
        return ar;}
    }
    @Column(name="TradeQuantity")
    public Integer getTradeQuantity() {
        return this.tradeQuantity;
    }
    
    public void setTradeQuantity(Integer tradeQuantity) {
        this.tradeQuantity = tradeQuantity;
    }

    
    @Column(name="NetWeight")
    public Long getNetWeight() {
        return this.NetWeight;
    }
    
    public void setNetWeight(Long netWeight) {
        this.NetWeight = netWeight;
    }

    
    @Column(name="TradeValue")
    public Long getTradeValue() {
        return this.TradeValue;
    }
    
    public void setTradeValue(Long tradeValue) {
        this.TradeValue = tradeValue;
    }




}

