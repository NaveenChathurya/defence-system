/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.view;

import defencesystem.controller.DefenceObservable;
import defencesystem.controller.DefenceObserver;
import defencesystem.Strength;
import defencesystem.SuperDefence;
import static defencesystem.Strength.CLOSED;
import static defencesystem.Strength.HIGH;
import static defencesystem.Strength.MEDIUM;
import static defencesystem.Strength.STRONG;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 * @author Naveen Chathurya
 */
public class Tank extends SuperDefence implements DefenceObserver {
    
    private static DefenceObserver tank;
    private Strength strength = Strength.LOW;
    private DefenceObservable defenceObservable = DefenceObservable.getInstance();
    
    public static DefenceObserver getInstance() {
        if(tank==null)
            tank = new Tank();
        return tank;
    }

    private Tank() {
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
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        btnTankMissile.setEnabled(false);
        btnTankRedar.setEnabled(false);
        btnTankRotate.setEnabled(false);
        btnTankShoot.setEnabled(false);
        txtAreaTank.setEditable(false);
        txtAreaTank.setEnabled(false);
        setResizable(false);
        setLayout(null);
        setBounds(200, 550, 650, 470);
        getContentPane().setBackground(new Color(234,236,233));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliderTank = new javax.swing.JSlider();
        lblTankArea = new javax.swing.JLabel();
        btnTankMissile = new javax.swing.JButton();
        btnTankShoot = new javax.swing.JButton();
        btnTankRedar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTank = new javax.swing.JTextArea();
        txtFieldTank = new javax.swing.JTextField();
        btnTankSend = new javax.swing.JButton();
        lblTankSoldier = new javax.swing.JLabel();
        lblTankAmmo = new javax.swing.JLabel();
        spinnerTankSoldier = new javax.swing.JSpinner();
        spinnerTankAmmo = new javax.swing.JSpinner();
        chkBoxTankPosition = new javax.swing.JCheckBox();
        btnTankRotate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tank");
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sliderTank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sliderTank.setMajorTickSpacing(20);
        sliderTank.setMinorTickSpacing(10);
        sliderTank.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderTank.setPaintLabels(true);
        sliderTank.setPaintTicks(true);
        sliderTank.setValue(0);

        lblTankArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTankArea.setText("Area Not Cleared");

        btnTankMissile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTankMissile.setText("Missile Operation");

        btnTankShoot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTankShoot.setText("Shoot");

        btnTankRedar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTankRedar.setText("Redar Operation");

        txtAreaTank.setColumns(20);
        txtAreaTank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAreaTank.setRows(5);
        txtAreaTank.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtAreaTank);

        txtFieldTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTankActionPerformed(evt);
            }
        });
        txtFieldTank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldTankKeyPressed(evt);
            }
        });

        btnTankSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTankSend.setText("Send");
        btnTankSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankSendActionPerformed(evt);
            }
        });

        lblTankSoldier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTankSoldier.setText("Soldier Count");

        lblTankAmmo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTankAmmo.setText("Ammo Count");

        chkBoxTankPosition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkBoxTankPosition.setText("Position");
        chkBoxTankPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkBoxTankPositionStateChanged(evt);
            }
        });
        chkBoxTankPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxTankPositionActionPerformed(evt);
            }
        });

        btnTankRotate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTankRotate.setText("Rotate Shooting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTankSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTankRedar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTankRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTankShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTankMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBoxTankPosition)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTankAmmo)
                                    .addComponent(lblTankSoldier))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinnerTankSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(sliderTank, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderTank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTankMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTankShoot, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTankRotate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkBoxTankPosition)
                                            .addComponent(btnTankRedar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTankSoldier)
                                    .addComponent(spinnerTankSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTankAmmo)
                                    .addComponent(spinnerTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTankSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldTank))))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkBoxTankPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxTankPositionActionPerformed
        
    }//GEN-LAST:event_chkBoxTankPositionActionPerformed

    private void txtFieldTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTankActionPerformed
    }//GEN-LAST:event_txtFieldTankActionPerformed

    private void btnTankSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankSendActionPerformed
        DefenceObservable.getInstance().setCountsTank((int)spinnerTankSoldier.getValue(),(int)spinnerTankAmmo.getValue(),sliderTank.getValue());
    }//GEN-LAST:event_btnTankSendActionPerformed

    private void txtFieldTankKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldTankKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            defenceObservable.recieveMessageTank("Tank : "+txtFieldTank.getText());
            txtFieldTank.setText("");
        }
    }//GEN-LAST:event_txtFieldTankKeyPressed

    private void chkBoxTankPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkBoxTankPositionStateChanged
        if(chkBoxTankPosition.isSelected()) {
            position(strength);
        }else {
            btnTankMissile.setEnabled(false);
            btnTankRedar.setEnabled(false);
            btnTankRotate.setEnabled(false);
            btnTankShoot.setEnabled(false);
        }
    }//GEN-LAST:event_chkBoxTankPositionStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTankMissile;
    private javax.swing.JButton btnTankRedar;
    private javax.swing.JButton btnTankRotate;
    private javax.swing.JButton btnTankSend;
    private javax.swing.JButton btnTankShoot;
    private javax.swing.JCheckBox chkBoxTankPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTankAmmo;
    private javax.swing.JLabel lblTankArea;
    private javax.swing.JLabel lblTankSoldier;
    private javax.swing.JSlider sliderTank;
    private javax.swing.JSpinner spinnerTankAmmo;
    private javax.swing.JSpinner spinnerTankSoldier;
    private javax.swing.JTextArea txtAreaTank;
    private javax.swing.JTextField txtFieldTank;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean b) {
        if(b==true){
            lblTankArea.setText("Area Cleared");
            txtAreaTank.setText("");
            txtFieldTank.setText("");
            spinnerTankAmmo.setValue(0);
            spinnerTankSoldier.setValue(0);
            sliderTank.setValue(0);
            chkBoxTankPosition.setSelected(false);
        }else {
            lblTankArea.setText("Area Not Cleared");
        }
    }

    @Override
    public void sendMessage(String sendMessage,int index,boolean position) {
        if(index==0) {
            txtAreaTank.append(sendMessage+"\n");
        }else if(index==2 && position==true) {
            txtAreaTank.append("Private : "+sendMessage+"\n");
        }
    }

    @Override
    public void position(Strength strength) {
        this.strength = strength;
        if(chkBoxTankPosition.isSelected()) {
            switch(strength) {
                case LOW:
                    btnTankShoot.setEnabled(false);
                    btnTankMissile.setEnabled(false);
                    btnTankRedar.setEnabled(false);
                    btnTankRotate.setEnabled(false);
                    break;
                case MEDIUM:
                    btnTankShoot.setEnabled(true);
                    btnTankMissile.setEnabled(false);
                    btnTankRedar.setEnabled(false);
                    btnTankRotate.setEnabled(false);
                    break;
                case HIGH:
                    btnTankShoot.setEnabled(true);
                    btnTankMissile.setEnabled(true);
                    btnTankRedar.setEnabled(false);
                    btnTankRotate.setEnabled(false);
                    break;
                case STRONG:
                    btnTankShoot.setEnabled(true);
                    btnTankMissile.setEnabled(true);
                    btnTankRedar.setEnabled(true);
                    btnTankRotate.setEnabled(false);
                    break;
                case CLOSED:
                    btnTankShoot.setEnabled(true);
                    btnTankMissile.setEnabled(true);
                    btnTankRedar.setEnabled(true);
                    btnTankRotate.setEnabled(true);
                    break;
            }
        }else {
            btnTankShoot.setEnabled(false);
            btnTankMissile.setEnabled(false);
            btnTankRedar.setEnabled(false);
            btnTankRotate.setEnabled(false);            
        }
    }
}