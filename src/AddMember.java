/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author user
 */
public class AddMember extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement stm;
    ResultSet rSet;
    String msAccDB = "..//Kevin_Street_Library_DB.accdb"; // path to the DB file        String dbURL = "jdbc:ucanaccess://" + msAccDB;
    String dbURL = "jdbc:ucanaccess://" + msAccDB;
    String uname;
    /**
     * Creates new form AddMember
     */
    public AddMember() {
        initComponents();
    }

    public AddMember(String uname) {
        initComponents();
        setTitle("Hello ::"+uname);
        jLabel7.setText(uname);
        
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
        jLabel1 = new javax.swing.JLabel();
        jmIDField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFnameTextField2 = new javax.swing.JTextField();
        jSurnameTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jSubmitButton1 = new javax.swing.JButton();
        jResetButton1 = new javax.swing.JButton();
        jBackButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("mID");

        jmIDField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIDField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jFnameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFnameTextField2ActionPerformed(evt);
            }
        });

        jSurnameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSurnameTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Surname");

        jLabel4.setText("Joined");

        jLabel5.setText("Add New Member");

        jSubmitButton1.setText("Submit");
        jSubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButton1ActionPerformed(evt);
            }
        });

        jResetButton1.setText("Reset");
        jResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetButton1ActionPerformed(evt);
            }
        });

        jBackButton3.setText("Back");
        jBackButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFnameTextField2)
                            .addComponent(jSurnameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jmIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jSubmitButton1)
                .addGap(18, 18, 18)
                .addComponent(jResetButton1)
                .addGap(18, 18, 18)
                .addComponent(jBackButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jmIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFnameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSurnameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmitButton1)
                    .addComponent(jResetButton1)
                    .addComponent(jBackButton3))
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jmIDField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIDField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmIDField1ActionPerformed

    private void jSubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButton1ActionPerformed
        // Submit new book loan
        String mID = jmIDField1.getText();
        String fName = jFnameTextField2.getText();
        String Surname = jSurnameTextField1.getText();
        
        java.util.Date joined =  jDateChooser1.getDate();
        //Date dueDate = jXDatePicker1.getRealizedDatePicker();
        if (mID.equals("")||fName.equals("")||Surname.equals("")){
            JOptionPane.showMessageDialog(rootPane, "All fields must be filled" );
                    
        }else{
        try {
            // Step 2.A: Create and get connection using DriverManager class
            con = DriverManager.getConnection(dbURL);
            stm = con.prepareStatement("insert into Member (mID,Name,Surname,Joined) values (?,?,?,?)");
            stm.setString(1, mID);
            stm.setString(2, fName);
            stm.setString(3, Surname);
            stm.setString(4,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            stm.execute();
            }
        catch(SQLException sqlex){
            System.err.println(sqlex.getMessage());
        }
        finally {

        // Step 3: Closing database connection
        try {
            if(null != con) {
                // cleanup resources, once after processing
                rSet.close();
                stm.close();
                // and then finally close connection
                con.close();
            }
        }
        catch(NullPointerException e) 
        { 
            
        }   catch (SQLException ex) { 
                Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
    } // End of Constructor
                                         

    }//GEN-LAST:event_jSubmitButton1ActionPerformed
    }
    private void jResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetButton1ActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_jResetButton1ActionPerformed
    private void resetFields(){
        jmIDField1.setText("");
        jFnameTextField2.setText("");
        jSurnameTextField1.setText("");
    }
    private void jBackButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButton3ActionPerformed
        // TODO add your handling code here:
        WelcomePage welcome = new WelcomePage(uname);
        welcome.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackButton3ActionPerformed

    private void jFnameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFnameTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFnameTextField2ActionPerformed

    private void jSurnameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSurnameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSurnameTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField jFnameTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jResetButton1;
    private javax.swing.JButton jSubmitButton1;
    private javax.swing.JTextField jSurnameTextField1;
    private javax.swing.JTextField jmIDField1;
    // End of variables declaration//GEN-END:variables
}
