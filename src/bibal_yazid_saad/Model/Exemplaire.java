/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Model;

/**
 *
 * @author Yazid
 */
public class Exemplaire {
    private int ID;
     Oeuvre oe;
    private int ov;
    private String Etat;
   

    public Exemplaire(int ov,String Etat ) {
        this.ID = ID;
        this.Etat = Etat;
        this.ov = ov;
    }

    public Exemplaire(String Etat) {
        this.Etat = Etat;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public int getOv() {
        return ov;
    }

    public void setOv(int ov) {
        this.ov = ov;
    }

    public Oeuvre getOe() {
        return oe;
    }

    public void setOe(Oeuvre oe) {
        this.oe = oe;
    }

    @Override
    public String toString() {
        return "Exemplaire{" + "ID=" + ID + ", Etat=" + Etat + ", oe=" + oe + '}';
    }
    
    
}
