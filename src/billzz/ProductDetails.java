/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billzz;

import billzz.Database.SqlConnection;
import billzz.Model.Products;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuj
 */
public class ProductDetails extends javax.swing.JFrame {

    /**
     * Creates new form ProductDetails
     */
    public ProductDetails() {
        initComponents();
        myInits();
        getContentPane().setBackground(new java.awt.Color(100, 181, 246));
        jButton1.setBackground(Color.decode("#50AF00"));
        jButton1.setForeground(Color.WHITE);
        DeleteBtn.setBackground(Color.decode("#50AF00"));
        DeleteBtn.setForeground(Color.WHITE);
         pack();
        setLocationRelativeTo(null);
    }
    public void myInits() {
        try{
            Statement stmt = SqlConnection.getStat();
            String sql = "select * from product where id  = '"+Products.productId+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                name.setText(rs.getString("product_name"));
                description.setText(rs.getString("product_desc"));
                language.setText(rs.getString("language"));
                rate.setText(rs.getString("product_rate"));                
            }
        }catch(Exception e){
            System.out.print(e.toString());
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        language = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 238, 238));
        jLabel2.setText("Description");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 238, 238));
        jLabel3.setText("Language");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 238, 238));
        jLabel4.setText("Rate");

        name.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        name.setForeground(new java.awt.Color(253, 243, 243));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("PRODUCT NAME");

        description.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        description.setText("desc");

        language.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        language.setText("Lang");

        rate.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        rate.setText("rate");

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(DeleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(description)
                            .addComponent(language)
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stmt = SqlConnection.getStat();
            String productRate = rate.getText();
            String productDesc = description.getText();
            String productLang = language.getText();
            if(productRate.equals("") || productDesc.equals("") || productLang.equals("")){
                 javax.swing.JOptionPane.showMessageDialog(null, "Fill All Feilds", "InfoBox:",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else {
                String sql = "update product set product_rate = '"+productRate+"' , product_desc = '"+productDesc+"' , language = '"+productLang+"' where id = '"+Products.productId+"'";
                stmt.execute(sql);
                this.setVisible(false);
            }
        }catch(Exception e){
             javax.swing.JOptionPane.showMessageDialog(null, e.toString(), "InfoBox:",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Do you wanna delete the product?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION);
        if(selectedOption == JOptionPane.YES_OPTION){
            String deleteProduct = "Delete from product where id = '"+Products.productId+"'";
            try {
                Statement stmt = SqlConnection.getStat();
                stmt.execute(deleteProduct);
                setVisible(false);               
            } catch (Exception ex) {
                System.out.print(ex.toString());
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString(), "InfoBox:",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField language;
    private javax.swing.JLabel name;
    private javax.swing.JTextField rate;
    // End of variables declaration//GEN-END:variables
}
