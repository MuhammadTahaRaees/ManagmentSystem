package managmentsystem;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import sun.java2d.pipe.hw.AccelDeviceEventNotifier;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbbox = new javax.swing.JComboBox<>();
        btnexit = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(404, 500));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/id.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 63, 44));

        txtid.setBackground(new java.awt.Color(204, 204, 204));
        txtid.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 255));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, 30));

        txtpassword.setBackground(new java.awt.Color(204, 204, 204));
        txtpassword.setForeground(new java.awt.Color(0, 0, 255));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/password.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 50, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/select.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        cmbbox.setBackground(new java.awt.Color(204, 204, 204));
        cmbbox.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbbox.setForeground(new java.awt.Color(0, 0, 255));
        cmbbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Reception" }));
        cmbbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbboxActionPerformed(evt);
            }
        });
        jPanel1.add(cmbbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 210, 31));

        btnexit.setBackground(new java.awt.Color(255, 0, 0));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 90, 35));

        btnlogin.setBackground(new java.awt.Color(0, 51, 204));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 400, 90, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/login.PNG"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbboxActionPerformed

    }//GEN-LAST:event_cmbboxActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.dispose();
        System.exit(0);
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    } 
    }//GEN-LAST:event_jPanel1KeyPressed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }//GEN-LAST:event_txtidKeyPressed
    }
    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
      
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }    
    }//GEN-LAST:event_txtpasswordKeyPressed
    
    /**
     * @param args the command line arguments
     */
    public void login(int i) {
        String uid = txtid.getText();
        String pass = String.valueOf(txtpassword.getPassword());
        String query = "";
        if (txtid.getText().trim().isEmpty() || pass.trim().isEmpty()) {
            JOptionPane.showMessageDialog(login.this, "Fields can't be empty");
            txtid.setText("");
            txtpassword.setText("");
        } else {
            try {
                int id = Integer.parseInt(uid);
                String who = "";
                switch (i) {
                    case 0:
                        who = "admin";
                        break;
                    case 1:
                        who = "doctor";
                        break;
                    case 2:
                        who = "reception";
                        break;
                    default:
                        break;
                }
                query = "select * from " + who + " where id = '" + id + "' and BINARY password = '" + pass + "'";                
                ResultSet rs = Db.getData(query);
                if (rs.next()) {
                    this.dispose();
                    String name = rs.getString("Name");
                    switch (i) {
                        case 0:
                            new Admin(name, id).setVisible(true);
                            break;
                        case 1:
                            new doctor(name, id).setVisible(true);
                            break;
                        case 2:
                            new reception(name, id).setVisible(true);
                            break;
                        default:
                            break;
                    }
                } else {                    
                    JOptionPane.showMessageDialog(login.this, "Invalid ID or password", "Login failed", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JComboBox<String> cmbbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
