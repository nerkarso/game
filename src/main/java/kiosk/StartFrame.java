/*
 * Copyright (c) 2020 Self-Order Kiosk
 */
package kiosk;

public class StartFrame extends javax.swing.JFrame {

  /**
   * Creates new form StartFrame
   */
  public StartFrame() {
    initComponents();
    app.Global.setAppIcon(this);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlContainer = new javax.swing.JPanel();
    lblTitle = new javax.swing.JLabel();
    lblLogo = new javax.swing.JLabel();
    btnStart = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Order");
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 860));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlContainer.setPreferredSize(new java.awt.Dimension(480, 640));
    pnlContainer.setLayout(new java.awt.GridBagLayout());

    lblTitle.setFont(lblTitle.getFont().deriveFont(lblTitle.getFont().getSize()+20f));
    lblTitle.setText("The Krusty Krab");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    pnlContainer.add(lblTitle, gridBagConstraints);

    lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/customer-logo.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(60, 60, 60, 60);
    pnlContainer.add(lblLogo, gridBagConstraints);

    btnStart.setText("Order here");
    btnStart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnStartActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    pnlContainer.add(btnStart, gridBagConstraints);

    getContentPane().add(pnlContainer, new java.awt.GridBagConstraints());

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
    StateManager.reset();
    new MenuFrame().setVisible(true);
    dispose();
  }//GEN-LAST:event_btnStartActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new StartFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnStart;
  private javax.swing.JLabel lblLogo;
  private javax.swing.JLabel lblTitle;
  private javax.swing.JPanel pnlContainer;
  // End of variables declaration//GEN-END:variables
}
