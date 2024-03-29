/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billzz.Lists;

import billzz.Model.Payment;
import billzz.Model.Product;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Anuj
 */
public class PayHistoryPanel extends javax.swing.JPanel implements ListCellRenderer<Payment>  {

    /**
     * Creates new form payHistoryPanel
     */
    public PayHistoryPanel() {
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

        billAmount = new javax.swing.JLabel();
        billDate = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();

        billAmount.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        billAmount.setText("Amount");

        billDate.setText("Bill Date");

        mode.setText("mode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billAmount)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billDate)
                        .addGap(38, 38, 38)
                        .addComponent(mode)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billDate)
                    .addComponent(mode))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billAmount;
    private javax.swing.JLabel billDate;
    private javax.swing.JLabel mode;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Payment> list, Payment value, int index, boolean isSelected, boolean cellHasFocus) {
       
       
       this.billAmount.setText("Paid Amount RS. : " +value.billAmount);
       this.billDate.setText("On Date : " +value.billDate);
       this.mode.setText("Mode : "+value.mode);
       this.setSize(20,5);
       if(isSelected){
         setBackground(list.getSelectionBackground());
         setForeground(list.getSelectionForeground());
       }
       else{
         setBackground(list.getBackground());
         setForeground(list.getForeground());
       }
       setEnabled(true);
       setFont(list.getFont());
       return this; 
    }

}
