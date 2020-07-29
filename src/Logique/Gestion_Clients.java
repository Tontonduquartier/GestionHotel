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
public class Gestion_Clients {
    
    private Clients cl;
    private Chambre ch;
    private String date_entree,date_sortie;
    private int nb_jours,gestID;

    public int getNb_jours() {
        return nb_jours;
    }
    
    public Gestion_Clients(){
    }
    public Gestion_Clients(Clients cl,Chambre ch,String dte_en,String dte_sortie){
       this.ch=ch;
       this.cl=cl;
       this.date_entree=dte_en;
       this.date_sortie=dte_sortie;    
    }

    public void setCl(Clients cl) {
        this.cl = cl;
    }

    public Clients getCl() {
        return cl;
    }

    public Chambre getCh() {
        return ch;
    }

    public String getDate_entree() {
        return date_entree;
    }

    public String getDate_sortie() {
        return date_sortie;
    }

    public int getGestID() {
        return gestID;
    }

    public void setCh(Chambre ch) {
        this.ch = ch;
    }

    public void setDate_entree(String date_entree) {
        this.date_entree = date_entree;
    }

    public void setDate_sortie(String date_sortie) {
        this.date_sortie = date_sortie;
    }

    public void setNb_jours(int nb_jours) {
        this.nb_jours = nb_jours;
    }

    public void setGestID(int gestID) {
        this.gestID = gestID;
    }
    
    
    public static void Occupants_Hotel(JComboBox<Gestion_Clients> cl){
    
        try {
            
            String requette="select DATEDIFF(date_sortie,date_entree) nb_jours, gestID,numero_ch,date_entree,date_sortie,cl.nom,prenom,cni,age,numero_etage,cat.nom no_cat,prix from gestion_client gcl,clients cl,chambres ch,etages et,categorie cat where ch.catID=cat.catID and ch.etID=et.etID and gcl.chID=ch.chID AND gcl.clID=cl.clID";
            
            ResultSet result=db.db_Con.extraireData(requette);
            
            Gestion_Clients gcl=null;
            cl.addItem(new Gestion_Clients());
            
            if(result!=null)
                while(result.next()){
                    
                    gcl=new Gestion_Clients();
                    
                    gcl.cl=new Clients(result.getString("nom"),result.getString("prenom"),result.getString("cni"),result.getInt("age"));
                    gcl.cl.setClID(2);
                    gcl.gestID=result.getInt("gestID");
                    gcl.ch=new Chambre();
                    gcl.ch.setNumero_ch(result.getString("numero_ch"));
                    gcl.ch.setEtID(new Etages());
                    gcl.ch.getEtID().setNumeroEtage(result.getInt("numero_etage"));
                    gcl.ch.setCatID(new Categorie(result.getString("no_cat"),result.getFloat("prix")));
                    gcl.date_entree=result.getString("date_entree");
                    gcl.date_sortie=result.getString("date_sortie");
                    gcl.nb_jours=result.getInt("nb_jours");
                    
                    cl.addItem(gcl);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Gestion_Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public String toString(){
        if(cl==null)
            return "";
      return cl.toString();
    }
    
  public int enregistrer_client_en_Hotel(){
    
      int result=-1;
      
      result=db.db_Con.modifierDB("insert into gestion_client (clid,chID,date_entree,date_sortie) values("+this.cl.getClID()+","+this.ch.getChID()+",'"+this.date_entree+"','"+this.date_sortie+"')");
  
     
      
      
      return result;
  }  
    
}
