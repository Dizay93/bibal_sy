/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Model;

import java.sql.Date;

/**
 *
 * @author Asaad
 */
public class Reservation {
    int id ;
    int oeuvreid;
    int usagerid;
    Date date_reservation;
    Date date_annulation;
    String etat;

    public Reservation(int oeuvreid, int usagerid, Date date_reservation, Date date_annulation, String etat) {
        this.oeuvreid = oeuvreid;
        this.usagerid = usagerid;
        this.date_reservation = date_reservation;
        this.date_annulation = date_annulation;
        this.etat = etat;
    }

    public Reservation(int oeuvreid, int usagerid, Date date_reservation, String etat) {
        this.oeuvreid = oeuvreid;
        this.usagerid = usagerid;
        this.date_reservation = date_reservation;
        this.etat = etat;
    }
    

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public int getOeuvreid() {
        return oeuvreid;
    }

    public int getUsagerid() {
        return usagerid;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public Date getDate_annulation() {
        return date_annulation;
    }

    public String getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOeuvreid(int oeuvreid) {
        this.oeuvreid = oeuvreid;
    }

    public void setUsagerid(int usagerid) {
        this.usagerid = usagerid;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public void setDate_annulation(Date date_annulation) {
        this.date_annulation = date_annulation;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
}
