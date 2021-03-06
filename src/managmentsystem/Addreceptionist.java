package managmentsystem;

import javax.swing.JOptionPane;

public class Addreceptionist extends javax.swing.JFrame {

    String name;
    int id;

    public Addreceptionist() {
        initComponents();
    }

    public Addreceptionist(String name, int id) {
        initComponents();
        this.name = name;
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD RECEPTIONIST");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAME :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact No :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address :");

        btnsubmit.setBackground(new java.awt.Color(0, 102, 255));
        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("SUBMIT");
        btnsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("CANCEL");
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        txtaddress.setColumns(20);
        txtaddress.setLineWrap(true);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password : ");

        txtpass.setEditable(false);
        txtpass.setBackground(new java.awt.Color(204, 204, 204));
        txtpass.setText("12345");
        txtpass.setEchoChar((char)0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsubmit))
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtpass))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(btncancel))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.dispose();
        new viewreception(name, id).setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        register();
    }//GEN-LAST:event_btnsubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public void register() {

        String name = txtname.getText();
        String contact = txtcontact.getText();
        String address = txtaddress.getText();
        String password = "12345";

        if (name.trim().isEmpty() || contact.trim().isEmpty() || address.trim().isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fields can't be empty");
        } else {
            try {
                String query = "insert into reception(name, contact, address, password) VALUES('" + name + "','" + contact + "','" + address + "','" + password + "')";
                Db.setData(query);
                this.dispose();
                new viewreception(this.name, id).setVisible(true);
            } catch (Exception e) {
                System.out.println("" + e.getMessage());
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
            java.util.logging.Logger.getLogger(Addreceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addreceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addreceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addreceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addreceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
