/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.DAO.ExemplaireManager;
import bibal_yazid_saad.Model.Exemplaire;
import bibal_yazid_saad.Model.Oeuvre;
import bibal_yazid_saad.View.IHMexemplaire;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazid
 */
public class ExemplaireControler {
    static ExemplaireManager ExemplaireManager; 
  static IHMexemplaire iHMexemplaire;
  static Exemplaire e;
    
  public ExemplaireControler(){
    ExemplaireManager=new ExemplaireManager();
    
}
  public void ajouterExemplaire(int ov,String Etat){
      
      e= new Exemplaire(ov,Etat);
      ExemplaireManager.ajouterExemplaire(e);
      
      
  }
    public Object[][] Lister(){
       Object[][] o = null;
        ExemplaireManager.Lister();
        return o;
        
    }
    
    public Exemplaire FindByID(int ID){
        Exemplaire e=null;
        ExemplaireManager.FindByID(ID); 
        return e;
    }
     public Exemplaire FindByOeuvre(String titre) {
          Exemplaire e=null;
       ExemplaireManager.FindByOeuvre(titre);
      return e;}
    public void SupprimerExemplaire(int ide){
           
      ExemplaireManager.SupprimerExemplaire(ide);
        
    }
  public void ModifierExemplaire( String Etat,int ide){
      Exemplaire e;
      e = new Exemplaire(Etat);
      ExemplaireManager.ModifierExemplaire(e,ide);
      
  }
}
