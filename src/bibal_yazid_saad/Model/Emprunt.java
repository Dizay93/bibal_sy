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
public class Emprunt {
    private int ID;
    private int ExemplaireID;
    private int UsagerID;
    private Date Date_Emprunt;
    private Date Date_Retour_Prevue;
    private Date Date_Retour_Effectif;

    public Emprunt(int ExemplaireID, int UsagerID, Date Date_Emprunt, Date Date_Retour_Prevue) {
        this.ExemplaireID = ExemplaireID;
        this.UsagerID = UsagerID;
        this.Date_Emprunt = Date_Emprunt;
        this.Date_Retour_Prevue = Date_Retour_Prevue;
    }

    public Emprunt(Date Date_Retour_Effectif) {
        this.Date_Retour_Effectif = Date_Retour_Effectif;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getExemplaireID() {
        return ExemplaireID;
    }

    public void setExemplaireID(int ExemplaireID) {
        this.ExemplaireID = ExemplaireID;
    }

    public int getUsagerID() {
        return UsagerID;
    }

    public void setUsagerID(int UsagerID) {
        this.UsagerID = UsagerID;
    }

    public Date getDate_Emprunt() {
        return Date_Emprunt;
    }

    public void setDate_Emprunt(Date Date_Emprunt) {
        this.Date_Emprunt = Date_Emprunt;
    }

    public Date getDate_Retour_Prevue() {
        return Date_Retour_Prevue;
    }

    public void setDate_Retour_Prevue(Date Date_Retour_Prevue) {
        this.Date_Retour_Prevue = Date_Retour_Prevue;
    }

    public Date getDate_Retour_Effectif() {
        return Date_Retour_Effectif;
    }

    public void setDate_Retour_Effectif(Date Date_Retour_Effectif) {
        this.Date_Retour_Effectif = Date_Retour_Effectif;
    }

   
    
}
