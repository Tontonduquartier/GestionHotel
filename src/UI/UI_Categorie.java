/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logique.Categorie;
import Logique.Generalites;
import Logique.Model_Table;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nahimana
 */
public class UI_Categorie extends javax.swing.JFrame {

    /**
     * Creates new form UI_Categorie
     */
   // static Model_Table tableau;
    static String [] titles={"Identifiant","Nom de la Categorie","Prix"};
    public UI_Categorie() {
        initComponents();
        Generalites.Centrer_Fenetres(this);
        adapter_Model();
    }
    
    static Categorie cat=null;
    
    void adapter_Model(){
      
        
       charger_tableau(ui_categorie_data);
       
       bt_modifier.setEnabled(false);
       ui_categorie_data.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
           
           public void valueChanged(ListSelectionEvent e) {
               int index_ligne=-1;
              if((index_ligne=ui_categorie_data.getSelectedRow())==-1)
                  return;
              
              bt_enregistrer_categorie.setEnabled(false);
              bt_modifier.setEnabled(true);
              ui_nom_categorie.setText(ui_categorie_data.getValueAt(index_ligne,1).toString());
              ui_categorie_prix.setText(ui_categorie_data.getValueAt(index_ligne,2).toString());
              
              if(cat==null)
                 cat=new Categorie();
              
              cat.setCatID(Integer.parseInt(ui_categorie_data.getValueAt(index_ligne,0).toString()));       
              
                    
           }
      
       
       });
       
       
       
    }
    
    void charger_tableau(JTable tabl){
    
        ResultSet result=db.db_Con.extraireData("select * from categorie");
        
        int size=0,i=0;
        
        if(result!=null)
        {
            try {
                size=Generalites.getResultSetRowCount(result);
                String [][] data=new String[size][titles.length];
                
                while(result.next()){
                    
                    data[i][0]=""+result.getInt("catID");
                    data[i][1]=result.getString("nom");
                    data[i][2]=""+result.getFloat("prix");
                    i++;
                    
                }
             tabl.setModel(new Model_Table(data, titles));
            
            } catch (SQLException ex) {
                Logger.getLogger(UI_Categorie.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ui_nom_categorie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ui_categorie_prix = new javax.swing.JTextField();
        bt_enregistrer_categorie = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ui_categorie_data = new javax.swing.JTable();
        bt_modifier = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom de Categorie");

        ui_nom_categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ui_nom_categorieActionPerformed(evt);
            }
        });

        jLabel2.setText("Prix");

        bt_enregistrer_categorie.setText("enregistrer les Categorie");
        bt_enregistrer_categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enregistrer_categorieActionPerformed(evt);
            }
        });

        ui_categorie_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ui_categorie_data);

        bt_modifier.setText("Modifier les données");
        bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bt_enregistrer_categorie)
                        .addGap(26, 26, 26)
                        .addComponent(bt_modifier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ui_nom_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ui_categorie_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ui_nom_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ui_categorie_prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_enregistrer_categorie)
                    .addComponent(bt_modifier))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_enregistrer_categorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enregistrer_categorieActionPerformed
        // TODO add your handling code here:
        
        Categorie categ=new Categorie();
        if(!ui_nom_categorie.getText().trim().equalsIgnoreCase(""))
             categ.setNom(ui_nom_categorie.getText());
        else {
             Generalites.Donner_info_User("Saisissez s'il vous plait le nom de la categorie");
            return;
        }
        if(!ui_categorie_prix.getText().trim().equalsIgnoreCase(""))
              try{
                    categ.setPrix(Float.parseFloat(ui_categorie_prix.getText()));
              
              }catch(NumberFormatException e){
                   Generalites.Donner_info_User("Saisissew s'il vous plait seulement les chiffres");
                   return;
              } 
         else {
             Generalites.Donner_info_User("Saisissez s'il vous plait le prix de la categorie");
            return;
        }
        
        if(categ.enregistrer_Cat_DB()>0)
        { 
            charger_tableau(ui_categorie_data);
            Generalites.Donner_info_User("Felicitationm votre operation a ete effectuee avec succes");
          ui_nom_categorie.setText("");
          ui_categorie_prix.setText("");
        }
        else Generalites.Donner_info_User("Desolem votre operation a echoue");
        
        
        
    }//GEN-LAST:event_bt_enregistrer_categorieActionPerformed

    
    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed
        // TODO add your handling code here:
        
        if(cat==null){
            Generalites.Donner_info_User("Selectionnez s'il vous plait la categorie à Modifier");
            return;
        }
        
        cat.setNom(ui_nom_categorie.getText());
        cat.setPrix(Float.parseFloat(ui_categorie_prix.getText()));
        
        if(cat.Modifier_Cat_DB()>0)
        {
            charger_tableau(ui_categorie_data);
            bt_enregistrer_categorie.setEnabled(true);
            bt_modifier.setEnabled(false);
            Generalites.Donner_info_User("Felicitation, la categorie a ete modifiée");
        
        }
        else Generalites.Donner_info_User("Désolé, la categorie n' a pas été modifiée");
    }//GEN-LAST:event_bt_modifierActionPerformed

    private void ui_nom_categorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ui_nom_categorieActionPerformed

    }//GEN-LAST:event_ui_nom_categorieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Categorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Categorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Categorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Categorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Categorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enregistrer_categorie;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable ui_categorie_data;
    private javax.swing.JTextField ui_categorie_prix;
    private javax.swing.JTextField ui_nom_categorie;
    // End of variables declaration//GEN-END:variables
}
