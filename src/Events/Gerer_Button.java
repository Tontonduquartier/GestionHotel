/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import Logique.Clients;
import Logique.Generalites;
import UI.UI_Clients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author nahimana
 */
public class Gerer_Button implements ActionListener{

    private JFrame win;
    
    public Gerer_Button(JFrame win){
      this.win=win;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      //To change body of generated methods, choose Tools | Templates.
      
       if(win!=null){
          UI_Clients cl=(UI_Clients)win;
          
          if(cl.getUi_cl_nom().getText().trim().equalsIgnoreCase(""))
          {
              Generalites.Donner_info_User("Tapez s'il Vous plait le nom du client ");
             return;
          }
          
          if(cl.getUi_cl_age().getText().trim().equalsIgnoreCase("")){
          
               Generalites.Donner_info_User("Tapez s'il Vous plait l'age du client ");
             return;
          }
          else {
              try{
                  
                  Integer.parseInt(cl.getUi_cl_age().getText().trim());
              
              }
              catch(NumberFormatException ex){
              
                Generalites.Donner_info_User("Tapez s'il Vous plait les chiffres pour l'age du client ");
                 return;
              }
          
          }
          
          if(cl.getUi_cl_cni().getText().trim().equalsIgnoreCase("")){
           Generalites.Donner_info_User("Tapez s'il Vous plait le CNI du client ");
             return;
          }
          
          if(cl.getUi_cl_pren().getText().trim().equalsIgnoreCase("")){
          
           Generalites.Donner_info_User("Tapez s'il Vous plait le prenom du client ");
             return;
          }
          
         Clients clx=new Clients(cl.getUi_cl_nom().getText(),cl.getUi_cl_pren().getText().trim(),cl.getUi_cl_cni().getText().trim(),Integer.parseInt(cl.getUi_cl_age().getText().trim())); 
          
         if(clx.enregistrer_client_DB()>0){
             
             UI_Clients.charger_Table(cl.getUi_cl_table());
             
             Generalites.Donner_info_User("Felicitation, Votre operation a ete effectuee avec succes");
         }
         else Generalites.Donner_info_User("Desole , echec pendant l'enregistrement du client");
       }
       
    
    }
    
    
    
}
