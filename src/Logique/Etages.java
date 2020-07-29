/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logique;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author nahimana
 */
public class Etages {
    
    private int etID;
    private int numeroEtage;
    
    private static int nb_cre;

    public void setEtID(int etID) {
        this.etID = etID;
    }

    public int getEtID() {
        return etID;
    }
    
    public void charger_chambre_etage(JComboBox<Chambre> cbx){
        try {
            Chambre ch=null;
            Categorie cat=null;
            ResultSet result=db.db_Con.extraireData("select c.*,ca.* from Chambres c,categorie ca where ca.catID=c.catID and etid="+this.etID);
            cbx.removeAllItems();
            cbx.addItem(new Chambre());
            
            
            if(result!=null)
                while(result.next()){
                    
                    ch=new Chambre();
                    ch.setEtID(this);
                    ch.setNumero_ch(result.getString("numero_ch"));
                    ch.setCatID(new Categorie(result.getString("nom"),result.getFloat("prix")));
                    ch.setChID(result.getInt("chID"));
                    cbx.addItem(ch);
                    
                }
        } catch (SQLException ex) {
            Logger.getLogger(Etages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static{
        
        try {
            ResultSet result=db.db_Con.extraireData("select count(*) nb_cres from etages");
            
            if(result!=null)
                if(result.next())
                    nb_cre=result.getInt("nb_cres");
            
        } catch (SQLException ex) {
            Logger.getLogger(Etages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void charger_les_etages(JComboBox<Etages> cb){
    
        try {
            Etages et=null;
            ResultSet result=db.db_Con.extraireData("select * from etages");
            cb.addItem(new Etages());
            if(result!=null)
                while(result.next())
                {
                    et=new Etages();
                    et.etID=result.getInt("etID");
                    et.numeroEtage=result.getInt("numero_etage");
                    cb.addItem(et);
                    
                }
        } catch (SQLException ex) {
            Logger.getLogger(Etages.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int nb_Chambre_Deja_Etage(){
       int nb_=-1;
        try {
           
            
            ResultSet result=db.db_Con.extraireData("select count(*) nb_ch from chambres where etID="+this.etID);
            
            if(result!=null)
                if(result.next())
                    nb_=result.getInt(1);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Etages.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         return nb_;
    }
    
    public int enregistrer_etages_DB(){
    
       return db.db_Con.modifierDB("insert into etages(numero_etage) values("+this.numeroEtage+")");
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    public static int getNb_cre() {
        return nb_cre;
    }

    public static void setNb_cre(int nb_cre) {
        Etages.nb_cre = nb_cre;
    }
    
    public String toString(){
        
        if(this.numeroEtage==0)
            return "";
      return this.numeroEtage+"";
    }
    
}
