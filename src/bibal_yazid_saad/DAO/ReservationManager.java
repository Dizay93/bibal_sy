/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.Model.Reservation;
import bibal_yazid_saad.Model.Usager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asaad
 */
public class ReservationManager implements ReservationInterface {

    @Override
    public void reserver(Reservation r) {
        try {
            
            DbInteraction.Connect();
            String sql="insert into reservation(OeuvreID,UsagerID,DateReservation,Etat) values ('"+r.getOeuvreid()+"','"+r.getUsagerid()+"','"+r.getDate_reservation()+"','"+r.getEtat()+"')";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    @Override
    public Reservation findById(int id) {
          Reservation r=null;
        try {
              
            DbInteraction.Connect();
            String sql="select * from Reservation where ID like '%" + id + "%' ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
           
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
      
        return r;
        
         }

    @Override
    public Reservation findByDate(Date date_resa) {
          Reservation r=null;
        try {
              
            DbInteraction.Connect();
            String sql="select * from Reservation where DateReservation like '%" + date_resa + "%' ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
           
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
      
        return r;
        
         }

    @Override
    public void annuler(Reservation r) {
        
        
    }

    @Override
    public Object[][] Lister() {
         Object[][] o = null;
            
            
        try {
            DbInteraction.Connect();
            
            String sql="select * from reservation ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }
    
    
}
