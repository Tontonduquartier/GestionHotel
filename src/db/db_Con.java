/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author nahimana
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db_Con {

       
    private static Connection con=null;
    
    public static int modifierDB(String sql){
        
            int result=-1;
            try {
                
            if(con==null)
                if(!createConnection())
                    return result;
                            
            Statement st=con.createStatement();
            result=st.executeUpdate(sql);
            
            } 
            catch (SQLException ex) {
            Logger.getLogger(db_Con.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return result;
    }
    
    /*
    select
    */
    public static ResultSet extraireData(String requete){
        
        ResultSet result=null;
            
        try {
            
            if(con==null)
                if(!createConnection())
                    return result;
            Statement st=con.createStatement();
            
            result=st.executeQuery(requete);
            
        } catch (SQLException ex) {
            Logger.getLogger(db_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
    return result;
    }
    
    static boolean createConnection(){
        boolean status=false;
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_hotel","root","");
            
            status=true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_Con.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(db_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
    public static void main(String [] arg){
        try {
            /*
            if(modifierDB("insert into categorie(nom,prix) values('Moyen',50000)")>0)
            System.out.println("Operation reussie");
            else System.out.println("Operation echouee");*/
            
            ResultSet result=extraireData("select * from categorie");
            
            if(result!=null)
                while(result.next()){
                    System.out.println(result.getString("nom")+"-"+result.getFloat("prix"));
                }
        } catch (SQLException ex) {
            Logger.getLogger(db_Con.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
