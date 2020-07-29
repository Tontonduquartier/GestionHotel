
package UI;

import Logique.Chambre;
import Logique.Clients;
import Logique.Generalites;
import Logique.Gestion_Clients;

public class UI_Paiement extends javax.swing.JFrame {

    /**
     * Creates new form UI_Paiement
     */
    public UI_Paiement() {
        initComponents();
        adapter_Code();
    }
    
    void adapter_Code(){
    
         Generalites.Centrer_Fenetres(this);
         Gestion_Clients.Occupants_Hotel(ui_cl_h);
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ui_cl_h = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ui_gcl_nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ui_gcl_prenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ui_gcl_cni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ui_gcl_age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ui_gcl_etage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ui_gcl_numCh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ui_gcl_categ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ui_gcl_prix = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ui_gcl_dte_entre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ui_gcl_dte_sortie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ui_gcl_mont = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ui_gcl_somme = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Clients en Hotel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(19, 17, 78, 15);

        ui_cl_h.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ui_cl_hItemStateChanged(evt);
            }
        });
        jPanel1.add(ui_cl_h);
        ui_cl_h.setBounds(115, 12, 263, 24);

        jLabel2.setText("Nom");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 50, 34, 15);

        ui_gcl_nom.setEditable(false);
        jPanel1.add(ui_gcl_nom);
        ui_gcl_nom.setBounds(115, 48, 127, 19);

        jLabel3.setText("Prénom");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(281, 50, 46, 15);

        ui_gcl_prenom.setEditable(false);
        jPanel1.add(ui_gcl_prenom);
        ui_gcl_prenom.setBounds(339, 48, 168, 19);

        jLabel4.setText("CNI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(19, 81, 16, 15);

        ui_gcl_cni.setEditable(false);
        jPanel1.add(ui_gcl_cni);
        ui_gcl_cni.setBounds(115, 79, 127, 19);

        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(281, 81, 33, 15);

        ui_gcl_age.setEditable(false);
        jPanel1.add(ui_gcl_age);
        ui_gcl_age.setBounds(332, 79, 133, 19);

        jLabel6.setText("Numero Etage");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(19, 118, 78, 15);

        ui_gcl_etage.setEditable(false);
        jPanel1.add(ui_gcl_etage);
        ui_gcl_etage.setBounds(115, 116, 68, 19);

        jLabel7.setText("Numero Chambre");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(281, 118, 91, 15);

        ui_gcl_numCh.setEditable(false);
        jPanel1.add(ui_gcl_numCh);
        ui_gcl_numCh.setBounds(390, 116, 98, 19);

        jLabel8.setText("Categorie");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(19, 143, 65, 15);

        ui_gcl_categ.setEditable(false);
        jPanel1.add(ui_gcl_categ);
        ui_gcl_categ.setBounds(115, 141, 127, 19);

        jLabel9.setText("Prix");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(281, 143, 54, 15);

        ui_gcl_prix.setEditable(false);
        jPanel1.add(ui_gcl_prix);
        ui_gcl_prix.setBounds(353, 141, 154, 19);

        jLabel10.setText("Date d'entrée");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(19, 182, 78, 15);

        ui_gcl_dte_entre.setEditable(false);
        jPanel1.add(ui_gcl_dte_entre);
        ui_gcl_dte_entre.setBounds(115, 178, 127, 19);

        jLabel11.setText("Date Sortie");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(281, 180, 69, 15);

        ui_gcl_dte_sortie.setEditable(false);
        jPanel1.add(ui_gcl_dte_sortie);
        ui_gcl_dte_sortie.setBounds(368, 178, 139, 19);

        jLabel12.setText("Montant à Payer");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(19, 217, 78, 15);

        ui_gcl_mont.setEditable(false);
        jPanel1.add(ui_gcl_mont);
        ui_gcl_mont.setBounds(127, 215, 142, 19);

        jLabel13.setText("Somme Payée");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(281, 217, 68, 15);
        jPanel1.add(ui_gcl_somme);
        ui_gcl_somme.setBounds(377, 215, 130, 19);

        jButton1.setText("Faire Payer le Client");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(138, 263, 129, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(24, 46, 519, 312);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ui_cl_hItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ui_cl_hItemStateChanged
        // TODO add your handling code here:
        
        Gestion_Clients gcl=(Gestion_Clients)evt.getItem();
        
        if(gcl.getCh()!=null){
           
            Clients cl=gcl.getCl();
            Chambre ch=gcl.getCh();
            
            ui_gcl_age.setText(cl.getAge()+"");
            ui_gcl_prenom.setText(cl.getPrenom());
            ui_gcl_cni.setText(cl.getCni());
            ui_gcl_nom.setText(cl.getNom());
            
            ui_gcl_etage.setText(ch.getEtID().getNumeroEtage()+"");
            
            ui_gcl_numCh.setText(ch.getNumero_ch());
            
            ui_gcl_categ.setText(ch.getCatID().getNom());
            ui_gcl_prix.setText(""+ch.getCatID().getPrix());
            
            ui_gcl_dte_entre.setText(gcl.getDate_entree());
            ui_gcl_dte_sortie.setText(gcl.getDate_sortie());
            
            ui_gcl_mont.setText(""+(gcl.getNb_jours()*ch.getCatID().getPrix()));
            
            
            
        
        }
    }//GEN-LAST:event_ui_cl_hItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Gestion_Clients cl=(Gestion_Clients)ui_cl_h.getSelectedItem();
        
        if(cl.getCl()==null){
          Generalites.Donner_info_User("Selectionnez s'il vous plait le client en Hotel");
          return;
        }
        
      if(db.db_Con.modifierDB("insert into paiement (date_paiement,montant,gestID) values(now(),"+Float.parseFloat(ui_gcl_mont.getText().trim())+","+cl.getGestID()+")")>0){
          Generalites.Donner_info_User("Félicitation ("+cl.getCl()+"),welcome again!!!! ");
          return ;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Paiement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Logique.Gestion_Clients> ui_cl_h;
    private javax.swing.JTextField ui_gcl_age;
    private javax.swing.JTextField ui_gcl_categ;
    private javax.swing.JTextField ui_gcl_cni;
    private javax.swing.JTextField ui_gcl_dte_entre;
    private javax.swing.JTextField ui_gcl_dte_sortie;
    private javax.swing.JTextField ui_gcl_etage;
    private javax.swing.JTextField ui_gcl_mont;
    private javax.swing.JTextField ui_gcl_nom;
    private javax.swing.JTextField ui_gcl_numCh;
    private javax.swing.JTextField ui_gcl_prenom;
    private javax.swing.JTextField ui_gcl_prix;
    private javax.swing.JTextField ui_gcl_somme;
    // End of variables declaration//GEN-END:variables
}
