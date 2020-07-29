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
public class Clients {
    
    private int clID;
    private String nom,prenom,cni;
    private int age;

    public void setClID(int clID) {
        this.clID = clID;
    }
    
    public String toString(){
        
        if(clID==0)
            return "";
      return cni+" "+nom+" "+prenom;
    }
    public int enregistrer_client_DB(){
    
        return db.db_Con.modifierDB("insert into client(nom,prenom,cni,age) values('"+this.nom+"','"+this.prenom+"','"+this.cni+"',"+this.age+")");
    } 
    
    public Clients(){}
    public Clients(String no,String pr,String cn,int age){
      this.cni=cn;
      this.nom=no;
      this.prenom=pr;
      this.age=age;
    }

    public int getClID() {
        return clID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCni() {
        return cni;
    }

    public int getAge() {
        return age;
    }
   
    public static void charger_ComboBox(JComboBox clx){
       
            Clients cl=null;
            ResultSet result=db.db_Con.extraireData("select * from clients");
            clx.addItem(new Clients());
            
             try {
            
            if(result!=null)
                while(result.next()){
                    cl=new Clients(result.getString("nom"),result.getString("prenom"),result.getString("cni"),result.getInt("age"));
                    cl.clID=result.getInt("clID");
                    
                    clx.addItem(cl);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}
