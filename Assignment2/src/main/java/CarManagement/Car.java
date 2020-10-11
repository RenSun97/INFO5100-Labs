/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManagement;

import java.util.Date;

/**
 *
 * @author SUNREN
 */
public class Car {
    private Boolean avail;
    private String manu;
    private String manuYear;
    private int seat;
    private String serialNum;
    private String modelNum;
    private Date update;
    private String city;
    private Boolean certificate;

    public Car() {
        this.update = new Date();
    }

    public Boolean getAvail() {
        return avail;
    }

    public void setAvail(Boolean avail) {
        this.avail = avail;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getManuYear() {
        return manuYear;
    }

    public void setManuYear(String manuYear) {
        this.manuYear = manuYear;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getCertificate() {
        return certificate;
    }

    public void setCertificate(Boolean certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return manu;
    }
    
}
