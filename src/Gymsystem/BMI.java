/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gymsystem;

import com.sun.org.apache.xpath.internal.functions.Function;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sid
 */
public class BMI extends javax.swing.JFrame {

    /**
     * Creates new form BMI
     */
    public BMI() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        BMI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Height = new javax.swing.JTextField();
        PirateID = new javax.swing.JTextField();
        Weight = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gymsystem/pirate1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 0, 310, 400);

        BMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMIActionPerformed(evt);
            }
        });
        jPanel1.add(BMI);
        BMI.setBounds(20, 180, 121, 47);

        jButton1.setBackground(new java.awt.Color(255, 199, 2));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(89, 42, 138));
        jButton1.setText("Calculate BMI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 240, 170, 50);

        jButton2.setBackground(new java.awt.Color(255, 199, 2));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(89, 42, 138));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 110, 20);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("PirateID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 58, 17);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Height");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 48, 17);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Weight");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 50, 17);

        Height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightActionPerformed(evt);
            }
        });
        jPanel1.add(Height);
        Height.setBounds(100, 80, 112, 28);

        PirateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PirateIDActionPerformed(evt);
            }
        });
        jPanel1.add(PirateID);
        PirateID.setBounds(100, 40, 112, 28);

        Weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightActionPerformed(evt);
            }
        });
        jPanel1.add(Weight);
        Weight.setBounds(100, 120, 112, 28);

        jButton3.setBackground(new java.awt.Color(255, 199, 2));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(89, 42, 138));
        jButton3.setText("Modify BMI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 300, 170, 50);

        jButton4.setBackground(new java.awt.Color(255, 199, 2));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(89, 42, 138));
        jButton4.setText("Calorie Counter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 360, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main_page MP = new Main_page();
        MP.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
       int hght = Integer.parseInt(Height.getText());
        int wght = Integer.parseInt(Weight.getText());
       String pid = PirateID.getText();
      int bmi = (10000*(wght)/(hght*hght));
       
     BMI.setText(String.valueOf(bmi));
        
        String tmp = (String) jButton1.getText();
        Connection con = null ;
        PreparedStatement pst = null;
        
        try{
            // check the code or just remove db query
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres","sid3791");
            String sql = "insert into bodymassindex values ('"+pid+"','"+hght+"','"+wght+"','"+bmi+"')";// values (?,?,?,"+bmi+")";
                    
             pst = con.prepareStatement(sql);
           
            pst.execute();
          
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,pid+" PirateID already Exists"+"\n"+"Please Modify your BMI");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PirateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PirateIDActionPerformed
        
        
        
    }//GEN-LAST:event_PirateIDActionPerformed

    private void HeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightActionPerformed
      
        
      
        
    }//GEN-LAST:event_HeightActionPerformed

    private void WeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightActionPerformed
        
        
        
    }//GEN-LAST:event_WeightActionPerformed

    private void BMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMIActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
              
       int hght = Integer.parseInt(Height.getText());
        int wght = Integer.parseInt(Weight.getText());
       String pid = PirateID.getText();
      int bmi = (10000*(wght)/(hght*hght));
       
     BMI.setText(String.valueOf(bmi));
        
        String tmp = (String) jButton1.getText();
        Connection con = null ;
        PreparedStatement pst = null;
        
        try{
            // check the code or just remove db query
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres","sid3791");
            String sql = "update Bodymassindex set pirateid ='"+pid+"',height='"+hght+"',weight='"+wght+"',bmi='"+bmi+"' where pirateid ='"+pid+"'";
                    
             pst = con.prepareStatement(sql);
           
            pst.execute();
           JOptionPane.showMessageDialog(null,"BMI is Modified for PirateID "+pid);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,pid+" pirateID is not Correct"+"n\" please enter correct PirateID");
            }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        BMI_calculation bmic = new BMI_calculation();
        bmic.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BMI;
    private javax.swing.JTextField Height;
    private javax.swing.JTextField PirateID;
    private javax.swing.JTextField Weight;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}