/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.Model.Exemplaire;
import bibal_yazid_saad.View.IHMexemplaire;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yazid
 */
public class ExemplaireManager implements ExemplaireInterface{

    @Override
    public void ajouterExemplaire(Exemplaire e){
         try {
            
            DbInteraction.Connect();
            String sql="insert into exemplaire(OeuvreID,Etat) values ('"+e.getOv()+"','"+e.getEtat()+"')";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object[][] Lister() {
        Object[][] o=null;
           try {
            DbInteraction.Connect();
            String sql="select * from exemplaire ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
           
            
          
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
            
        }
               
               return o;
    }

    @Override
    public Exemplaire FindByID(int ID) {
          Exemplaire e=null;
        try {
              
            DbInteraction.Connect();
            String sql="select * from exemplaire where ID like '%" + ID + "%' ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
            
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
      
        return e;
    }

    @Override
    public void SupprimerExemplaire(int ide) {
        try {
            
            DbInteraction.Connect();
            String sql="delete from exemplaire where ID='"+ide+"'";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierExemplaire(Exemplaire e,int ide) {
        try {
            
            DbInteraction.Connect();
            String sql="update exemplaire set Etat='"+e.getEtat()+"' where ID="+ide+"";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
