/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logique;

import db.db_Con;

/**
 *
 * @author nahimana
 */
public class Categorie {
    
   private int   catID;
   private String nom;
   private float prix;

    public int getCatID() {
        return catID;
    }
   
   public Categorie(){}
   
   public String toString(){
   
        if(prix==0)
            return nom;
        return nom+"-"+prix;
   }
   
   public Categorie(String nom,float prix){
      
      this.nom=nom;
      this.prix=prix;
      
   }
   
   public int enregistrer_Cat_DB(){
     
       return db_Con.modifierDB("insert into categorie(nom,prix) values('"+this.nom+"',"+this.prix+")");
       
   }
   
    public int Modifier_Cat_DB(){
     
       return db_Con.modifierDB("update categorie set nom='"+this.nom+"',prix="+this.prix+" where catID="+this.catID);
       
   }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

   

    
}
