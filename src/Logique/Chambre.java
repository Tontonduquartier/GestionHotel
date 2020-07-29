/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logique;

/**
 *
 * @author nahimana
 */
public class Chambre {
    
    private int   chID;
    
    
    private Categorie catID;
    private Etages etID;
    private String numero_ch;
    
    public String toString(){
    
        if(etID==null)
            return "";
        return numero_ch;
    }
    public int creerChambre(){
      return db.db_Con.modifierDB("insert into chambres(catID,etID,numero_ch) values("+this.catID.getCatID()+","+etID.getEtID()+",'"+numero_ch+"')");
    
    }

    public int getChID() {
        return chID;
    }

    public void setChID(int chID) {
        this.chID = chID;
    }

    public Categorie getCatID() {
        return catID;
    }

    public void setCatID(Categorie catID) {
        this.catID = catID;
    }

    public Etages getEtID() {
        return etID;
    }

    public void setEtID(Etages etID) {
        this.etID = etID;
    }

    public String getNumero_ch() {
        return numero_ch;
    }

    public void setNumero_ch(String numero_ch) {
        this.numero_ch = numero_ch;
    }
    
    
}
