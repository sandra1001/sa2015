/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa_gui;

/**
 *
 * @author Sandra
 */
public class ConfirmRoute extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmRoute
     */
    public ConfirmRoute() {
        initComponents();
        this.setTitle("Program - Add New Route");
        
        String[] stops = Controller.getRouteStops();
        
        if(stops.length != 0)
        {
            String tmp = stops[0];
            for (int i = 1; stops[i] != null; i++)
            {
                tmp += "; " + stops[i];
            }
            jlEnterRouteStops.setText(tmp);
        }
               
        jlEnterRouteName.setText(Controller.getRouteName());
        jlEnterRouteStart.setText(Controller.getRouteStart());
        jlEnterRouteDestination.setText(Controller.getRouteDest());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlRouteName = new javax.swing.JLabel();
        jlRouteStart = new javax.swing.JLabel();
        jlDestinationRoute = new javax.swing.JLabel();
        jlStopsRoute = new javax.swing.JLabel();
        jlEnterRouteName = new javax.swing.JLabel();
        jlEnterRouteStart = new javax.swing.JLabel();
        jlEnterRouteDestination = new javax.swing.JLabel();
        jlEnterRouteStops = new javax.swing.JLabel();
        jbAddRouteButton = new javax.swing.JToggleButton();
        jbBackButton = new javax.swing.JToggleButton();
        jbHomeButton = new javax.swing.JToggleButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitle.setText("Add New Route");

        jlRouteName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlRouteName.setText("Route Name:");

        jlRouteStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlRouteStart.setText("Start:");

        jlDestinationRoute.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlDestinationRoute.setText("Destination:");

        jlStopsRoute.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlStopsRoute.setText("Stops:");

        jlEnterRouteName.setText("jLabel1");

        jlEnterRouteStart.setText("jLabel1");

        jlEnterRouteDestination.setText("jLabel1");

        jlEnterRouteStops.setText("jLabel1");
        jlEnterRouteStops.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jbAddRouteButton.setText("Add New Route");
        jbAddRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddRouteButtonActionPerformed(evt);
            }
        });

        jbBackButton.setText("Back");
        jbBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackButtonActionPerformed(evt);
            }
        });

        jbHomeButton.setText("Home");
        jbHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlRouteName, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jlRouteStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDestinationRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlStopsRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEnterRouteName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlEnterRouteStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlEnterRouteDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlEnterRouteStops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbHomeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jbAddRouteButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRouteName)
                    .addComponent(jlEnterRouteName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRouteStart)
                    .addComponent(jlEnterRouteStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDestinationRoute)
                    .addComponent(jlEnterRouteDestination))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlStopsRoute)
                    .addComponent(jlEnterRouteStops, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAddRouteButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbBackButton)
                        .addComponent(jbHomeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddRouteButtonActionPerformed
        // TODO add your handling code here:
        
        if(Controller.createNewRoute() == true)
        {
            RouteSuccess rsuc = new RouteSuccess();
            rsuc.setVisible(true);
            this.setVisible(false);
        }  
        else
        {
            RouteError rerr = new RouteError();
            rerr.setVisible(true);
            return;
        }
        
    }//GEN-LAST:event_jbAddRouteButtonActionPerformed

    private void jbHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHomeButtonActionPerformed
        // TODO add your handling code here:
        HomeWindow hw = new HomeWindow();
        hw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbHomeButtonActionPerformed

    private void jbBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackButtonActionPerformed
        // TODO add your handling code here:
        AddRoute ar = new AddRoute();
        ar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmRoute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jbAddRouteButton;
    private javax.swing.JToggleButton jbBackButton;
    private javax.swing.JToggleButton jbHomeButton;
    private javax.swing.JLabel jlDestinationRoute;
    private javax.swing.JLabel jlEnterRouteDestination;
    private javax.swing.JLabel jlEnterRouteName;
    private javax.swing.JLabel jlEnterRouteStart;
    private javax.swing.JLabel jlEnterRouteStops;
    private javax.swing.JLabel jlRouteName;
    private javax.swing.JLabel jlRouteStart;
    private javax.swing.JLabel jlStopsRoute;
    private javax.swing.JLabel jlTitle;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
