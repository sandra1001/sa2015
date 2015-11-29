/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa_gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sa_gui.Controller.latoperator;
import static sa_gui.Controller.lonoperator;

/**
 *
 * @author Sandra
 */
public class SearchStop extends javax.swing.JFrame {

    /* My variables: */
    String nameStop;
    double latStop;
    double lonStop;
    
    /**
     * Creates new form SearchStop
     */
    public SearchStop() {
        initComponents();
        this.setTitle("Routenator - Search Stops");
        latoperator = "=";
        lonoperator = "=";
        LatExactBox.setSelected(true);
        LonExactBox.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlSearchName = new javax.swing.JLabel();
        jlLatitude = new javax.swing.JLabel();
        jlLongitude = new javax.swing.JLabel();
        jfEnterName = new javax.swing.JTextField();
        jfEnterLat = new javax.swing.JTextField();
        jfEnterLon = new javax.swing.JTextField();
        jbSearchButton = new javax.swing.JToggleButton();
        jbCancelButton = new javax.swing.JToggleButton();
        LatExactBox = new javax.swing.JRadioButton();
        LatAboveBox = new javax.swing.JRadioButton();
        LatBelowBox = new javax.swing.JRadioButton();
        LonAboveBox = new javax.swing.JRadioButton();
        LonBelowBox = new javax.swing.JRadioButton();
        LonExactBox = new javax.swing.JRadioButton();
        jbExitButton = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitle.setText("Search Stop");

        jlSearchName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlSearchName.setText("Name:");

        jlLatitude.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlLatitude.setText("Latitude:");

        jlLongitude.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlLongitude.setText("Longitude:");

        jbSearchButton.setText("Search");
        jbSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchButtonActionPerformed(evt);
            }
        });

        jbCancelButton.setText("Cancel");
        jbCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelButtonActionPerformed(evt);
            }
        });

        LatExactBox.setBackground(new java.awt.Color(204, 255, 204));
        LatExactBox.setText("Exact");
        LatExactBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatExactBoxActionPerformed(evt);
            }
        });

        LatAboveBox.setBackground(new java.awt.Color(204, 255, 204));
        LatAboveBox.setText("Above");
        LatAboveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatAboveBoxActionPerformed(evt);
            }
        });

        LatBelowBox.setBackground(new java.awt.Color(204, 255, 204));
        LatBelowBox.setText("Below");
        LatBelowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatBelowBoxActionPerformed(evt);
            }
        });

        LonAboveBox.setBackground(new java.awt.Color(204, 255, 204));
        LonAboveBox.setText("Above");
        LonAboveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LonAboveBoxActionPerformed(evt);
            }
        });

        LonBelowBox.setBackground(new java.awt.Color(204, 255, 204));
        LonBelowBox.setText("Below");
        LonBelowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LonBelowBoxActionPerformed(evt);
            }
        });

        LonExactBox.setBackground(new java.awt.Color(204, 255, 204));
        LonExactBox.setText("Exact");
        LonExactBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LonExactBoxActionPerformed(evt);
            }
        });

        jbExitButton.setText("Exit");
        jbExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LonExactBox)
                        .addGap(18, 18, 18)
                        .addComponent(LonBelowBox)
                        .addGap(18, 18, 18)
                        .addComponent(LonAboveBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlLatitude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlLongitude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LatExactBox)
                                .addGap(18, 18, 18)
                                .addComponent(LatBelowBox)
                                .addGap(18, 18, 18)
                                .addComponent(LatAboveBox))
                            .addComponent(jfEnterName)
                            .addComponent(jfEnterLat)
                            .addComponent(jfEnterLon)
                            .addComponent(jbSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExitButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfEnterLat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LatExactBox)
                    .addComponent(LatAboveBox)
                    .addComponent(LatBelowBox))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfEnterLon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LonAboveBox)
                    .addComponent(LonBelowBox)
                    .addComponent(LonExactBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchButtonActionPerformed
        // TODO add your handling code here:        
        /* get input data: */
        String tmp;
        
        if((nameStop = jfEnterName.getText()).equals(""))
        { nameStop = "leer"; }
        if((tmp = jfEnterLat.getText()).equals(""))
        { latStop = 0; }
        else
        { 
            tmp = tmp.replace(",", ".");
            try {
                latStop = Double.parseDouble(tmp);
            }
            catch (NumberFormatException e)
            {
                StopNoConvert scon = new StopNoConvert();
                scon.setVisible(true);
                return;
            }
        }
        if((tmp = jfEnterLon.getText()).equals(""))
        { lonStop = 0; }
        else
        { 
            tmp = tmp.replace(",", ".");
            try {
                lonStop = Double.parseDouble(tmp);
            }
            catch (NumberFormatException e)
            {
                StopNoConvert scon = new StopNoConvert();
                scon.setVisible(true);
                return;
            }
        }
        
        if(nameStop.equals("leer") && latStop == 0 && lonStop == 0)
        {
            StopInfo sinfo = new StopInfo();
            sinfo.setVisible(true);
            return;
        }
        
        Controller.searchStop(nameStop, latStop, lonStop);
        
        ListStops lssdialog;
        try {
            lssdialog = new ListStops();
            lssdialog.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SearchStop.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jbSearchButtonActionPerformed

    private void jbCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelButtonActionPerformed
        // TODO add your handling code here:
        HomeWindow hw = new HomeWindow();
        hw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelButtonActionPerformed

    private void LatExactBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatExactBoxActionPerformed
        // TODO add your handling code here:
        latoperator = "=";
        LatAboveBox.setSelected(false);
        LatBelowBox.setSelected(false);
    }//GEN-LAST:event_LatExactBoxActionPerformed

    private void LatBelowBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatBelowBoxActionPerformed
        // TODO add your handling code here:
        latoperator = "<=";
        LatExactBox.setSelected(false);
        LatAboveBox.setSelected(false);
    }//GEN-LAST:event_LatBelowBoxActionPerformed

    private void LatAboveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatAboveBoxActionPerformed
        // TODO add your handling code here:
        latoperator = ">=";
        LatExactBox.setSelected(false);
        LatBelowBox.setSelected(false);
    }//GEN-LAST:event_LatAboveBoxActionPerformed

    private void LonExactBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LonExactBoxActionPerformed
        // TODO add your handling code here:
        lonoperator = "=";
        LonAboveBox.setSelected(false);
        LonBelowBox.setSelected(false);
    }//GEN-LAST:event_LonExactBoxActionPerformed

    private void LonBelowBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LonBelowBoxActionPerformed
        // TODO add your handling code here:
        lonoperator = "<=";
        LonExactBox.setSelected(false);
        LonAboveBox.setSelected(false);
    }//GEN-LAST:event_LonBelowBoxActionPerformed

    private void LonAboveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LonAboveBoxActionPerformed
        // TODO add your handling code here:
        lonoperator = ">=";
        LonExactBox.setSelected(false);
        LonBelowBox.setSelected(false);
    }//GEN-LAST:event_LonAboveBoxActionPerformed

    private void jbExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStop().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LatAboveBox;
    private javax.swing.JRadioButton LatBelowBox;
    private javax.swing.JRadioButton LatExactBox;
    private javax.swing.JRadioButton LonAboveBox;
    private javax.swing.JRadioButton LonBelowBox;
    private javax.swing.JRadioButton LonExactBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jbCancelButton;
    private javax.swing.JToggleButton jbExitButton;
    private javax.swing.JToggleButton jbSearchButton;
    private javax.swing.JTextField jfEnterLat;
    private javax.swing.JTextField jfEnterLon;
    private javax.swing.JTextField jfEnterName;
    private javax.swing.JLabel jlLatitude;
    private javax.swing.JLabel jlLongitude;
    private javax.swing.JLabel jlSearchName;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}
