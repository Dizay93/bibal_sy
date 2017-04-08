/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Model.Reservation;
import java.sql.Date;

/**
 *
 * @author Asaad
 */
public interface ReservationInterface {
    
    public void reserver(Reservation r);
     public Object[][] Lister();
    public Reservation findById(int id);
    public Reservation findByDate(Date date_resa);
    public void annuler(Reservation r);
    
}
