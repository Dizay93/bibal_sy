/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.DAO.ReservationManager;
import bibal_yazid_saad.Model.Reservation;
import bibal_yazid_saad.View.IHMreservation;
import java.sql.Date;

/**
 *
 * @author Asaad
 */
public class ReservationControler {
    static ReservationManager ReservationManager;
    static IHMreservation IHMreservation;
    static Reservation r;
    
    public ReservationControler ()
    {
        ReservationManager = new ReservationManager();
        
    }
    
     public void reserver(int oeuvreid, int usagerid, Date date_reservation, String etat) {
       
         r= new Reservation(oeuvreid, usagerid, date_reservation, etat);
         ReservationManager.reserver(r);
    
    }

 
    public Reservation findById(int id) {
          Reservation r=null;
       
          ReservationManager.findById(id);
      
        return r;
        
         }

    
    public Reservation findByDate(Date date_resa) {
          Reservation r=null;
       ReservationManager.findByDate(date_resa);
      
        return r;
        
         }

   
    public void annuler(Reservation r) {
        
        
    }

   
    public Object[][] Lister() {
         Object[][] o = null;
            
      ReservationManager.Lister();
        return o;
    }
    
    
    
}
