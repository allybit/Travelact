
package travelact.sample.controller;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import travelact.sample.model.*;

public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public SignUp() {
        initComponents();
    }

    void addData(String Fname, String Lname, String Adress, String Email, String ContactNum, String Password){
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            
            for(int i = 0; i < ln; i++){
                raf.readLine();
            }
            if(ln > 0){
                raf.writeBytes("\r\n");
                raf.writeBytes("\r\n");
            }
            
            raf.writeBytes(Email + ",");
            raf.writeBytes(Password + "\r\n");
            raf.writeBytes("First name: " + Fname + "\r\n");
            raf.writeBytes("Last name: " + Lname + "\r\n");
            raf.writeBytes("Address: " + Adress + "\r\n");
            
            raf.writeBytes("Contact number: " + ContactNum + "\r\n");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void checkData() {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            String line = raf.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Adress = new javax.swing.JTextField();
        ContactNum = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signinbtn = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        cPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(7, 41, 62));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/logo-1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Come and stay with us to feel even better than at home.");

        jLabel3.setFont(new java.awt.Font("Inter SemiBold", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 181, 255));
        jLabel3.setText("< BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        Email.setBackground(new java.awt.Color(223, 246, 255));
        Email.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setToolTipText("");
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });

        Lname.setBackground(new java.awt.Color(223, 246, 255));
        Lname.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LnameFocusLost(evt);
            }
        });

        Fname.setBackground(new java.awt.Color(223, 246, 255));
        Fname.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FnameFocusLost(evt);
            }
        });

        Adress.setBackground(new java.awt.Color(223, 246, 255));
        Adress.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Adress.setToolTipText("");
        Adress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdressFocusLost(evt);
            }
        });

        ContactNum.setBackground(new java.awt.Color(223, 246, 255));
        ContactNum.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        ContactNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContactNum.setToolTipText("");
        ContactNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContactNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContactNumFocusLost(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(72, 181, 255));
        Submit.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Submit.setText("Submit");
        Submit.setBorderPainted(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Already have an account?");

        signinbtn.setBackground(new java.awt.Color(255, 255, 255));
        signinbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 10)); // NOI18N
        signinbtn.setForeground(new java.awt.Color(72, 181, 255));
        signinbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinbtn.setText("Sign In ");
        signinbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinbtnMouseClicked(evt);
            }
        });

        Password.setBackground(new java.awt.Color(223, 246, 255));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });

        cPassword.setBackground(new java.awt.Color(223, 246, 255));
        cPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cPasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cPassword))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(169, 169, 169))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signinbtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signinbtn))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContactNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNumFocusLost
        // TODO add your handling code here:
        if(ContactNum.getText().equals("Contact Number")){
            ContactNum.setText("");
        }
        ContactNum.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_ContactNumFocusLost

    private void ContactNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNumFocusGained
        // TODO add your handling code here:
        if(ContactNum.getText().equals("")){
            ContactNum.setText("Contact Number");
        }
        ContactNum.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_ContactNumFocusGained

    private void AdressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdressFocusLost
        // TODO add your handling code here:
        if(Adress.getText().equals("Address")){
            Adress.setText("");
        }
        Adress.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AdressFocusLost

    private void AdressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdressFocusGained
        // TODO add your handling code here:
        if(Adress.getText().equals("")){
            Adress.setText("Address");
        }
        Adress.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_AdressFocusGained

    private void FnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusLost
        // TODO add your handling code here:
        if(Fname.getText().equals("First Name")){
            Fname.setText("");
        }
        Fname.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_FnameFocusLost

    private void FnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusGained
        // TODO add your handling code here:
        if(Fname.getText().equals("")){
            Fname.setText("First Name");
        }
        Fname.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_FnameFocusGained

    private void LnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusLost
        // TODO add your handling code here:
      if(Lname.getText().equals("Last Name")){
            Lname.setText("");
        }
       Lname.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_LnameFocusLost

    private void LnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusGained
        // TODO add your handling code here:
        if(Lname.getText().equals("")){
            Lname.setText("Last Name");
        }
        Lname.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_LnameFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        // TODO add your handling code here:
        if(Email.getText().equals("")){
            Email.setText("Email");
        }
        Email.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_EmailFocusLost

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        // TODO add your handling code here:
        if(Email.getText().equals("Email")){
            Email.setText("");
        }
        Email.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_EmailFocusGained

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new WelcomeForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void signinbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinbtnMouseClicked
        // TODO add your handling code here:
         new SignIn().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signinbtnMouseClicked

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
        if(Password.getText().equals("Password")){
            Password.setText("");
        }
        Password.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:
        if(Password.getText().equals("")){
            Password.setText("Password");
        }
        Password.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_PasswordFocusLost

    private void cPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cPasswordFocusGained
        // TODO add your handling code here:
        if(cPassword.getText().equals("Confirm Password")){
            cPassword.setText("");
        }
        cPassword.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_cPasswordFocusGained

    private void cPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cPasswordFocusLost
        // TODO add your handling code here:
        if(cPassword.getText().equals("")){
            cPassword.setText("Confirm Password");
        }
        cPassword.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_cPasswordFocusLost
    
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        countLines();
        checkData();
        addData(Fname.getText(), Lname.getText(), Adress.getText(), Email.getText(), ContactNum.getText(), Password.getText());
        JOptionPane.showMessageDialog(null,"The account has been registered");
        new SignIn().setVisible(true);
        setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private javax.swing.JTextField ContactNum;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Submit;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel signinbtn;
    // End of variables declaration//GEN-END:variables
}
