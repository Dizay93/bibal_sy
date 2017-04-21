/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.DAO.EmpruntManager;
import bibal_yazid_saad.Model.Emprunt;
import bibal_yazid_saad.View.IHMemprunt;
import java.sql.Date;

/**
 *
 * @author Yazid
 */
public class EmpruntControler {
    static EmpruntManager EmpruntManager ;
    static IHMemprunt IHMemprunt;
    static Emprunt p;

    public EmpruntControler() {
        EmpruntManager=new EmpruntManager();
    }
    
     public void emprunter(int exemplaireID, int usagerID, Date date_Emprunt, Date date_Retour_Prevue) {
       
         p= new Emprunt(exemplaireID, usagerID, date_Emprunt, date_Retour_Prevue);
         EmpruntManager.emprunter(p);
    
    }
    
        public void rendre(Date Date_Retour_Effectif, int idp) {
         p= new Emprunt(Date_Retour_Effectif);
         EmpruntManager.rendre(p, idp);
        }
        
         public Object[][] Lister() {
         Object[][] o = null;
            
         EmpruntManager.Lister();
        return o;
    }
         
         public Emprunt findByUsager(int UsagerID){
          Emprunt p=null;
         EmpruntManager.findByUsager(UsagerID);
      
        return p;

}
    
         public Emprunt findByExemplaire(int ExemplaireID){
          Emprunt p=null;
          
         EmpruntManager.findByExemplaire(ExemplaireID);
      
        return p;

    }
         
          public Emprunt findById(int id) {
          Emprunt p=null;
       
          EmpruntManager.findById(id);
      
        return p;
        
         }

    
    public Emprunt findByDate(Date date_Emprunt) {
          Emprunt p=null;
       EmpruntManager.findByDate(date_Emprunt);
      
        return p;
        
         }
 public Emprunt findByIntervalDate(Date date_emp1, Date date_emp2){
     Emprunt p=null;
       EmpruntManager.findByIntervalDate(date_emp1, date_emp2);
      
        return p;
 }
   
 
}
