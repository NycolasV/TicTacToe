package listas.atividade.estruturadedados.uam.ui;

import listas.atividade.estruturadedados.uam.controllers.*;
import listas.atividade.estruturadedados.uam.models.Player;

/**
 * @author NycolasVieira
 */
public class Game extends javax.swing.JFrame {
    
    GameController controller;
    
    public Game() {
        initComponents();
    }

    public Game(Player player, PlayerController controller) throws Exception {
        initComponents();
        
        this.controller = new GameController(controller, player);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Box2 = new javax.swing.JButton();
        Box3 = new javax.swing.JButton();
        Box1 = new javax.swing.JButton();
        Box4 = new javax.swing.JButton();
        Box5 = new javax.swing.JButton();
        Box6 = new javax.swing.JButton();
        Box7 = new javax.swing.JButton();
        Box8 = new javax.swing.JButton();
        Box9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" TIC TAC TOE");

        Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ActionPerformed(evt);
            }
        });

        Box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box3ActionPerformed(evt);
            }
        });

        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        Box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box4ActionPerformed(evt);
            }
        });

        Box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box5ActionPerformed(evt);
            }
        });

        Box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box6ActionPerformed(evt);
            }
        });

        Box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box7ActionPerformed(evt);
            }
        });

        Box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box8ActionPerformed(evt);
            }
        });

        Box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Box7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Box4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Box5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Box8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        var movement = "b1";
        
        var result = controller.setMovement(movement, Box1);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box1ActionPerformed

    private void Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box2ActionPerformed
        var movement = "b2";
        
        var result = controller.setMovement(movement, Box2);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box2ActionPerformed

    private void Box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box3ActionPerformed
        var movement = "b3";
        
        var result = controller.setMovement(movement, Box3);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box3ActionPerformed

    private void Box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box4ActionPerformed
        var movement = "b4";
        
        var result = controller.setMovement(movement, Box4);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box4ActionPerformed

    private void Box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box5ActionPerformed
        var movement = "b5";
        
        var result = controller.setMovement(movement, Box5);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box5ActionPerformed

    private void Box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box6ActionPerformed
        var movement = "b6";
        
        var result = controller.setMovement(movement, Box6);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box6ActionPerformed

    private void Box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box7ActionPerformed
        var movement = "b7";
        
        var result = controller.setMovement(movement, Box7);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box7ActionPerformed

    private void Box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box8ActionPerformed
        var movement = "b8";
        
        var result = controller.setMovement(movement, Box8);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box8ActionPerformed

    private void Box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box9ActionPerformed
        var movement = "b9";
        
        var result = controller.setMovement(movement, Box9);
        
        SetMachinePlay(result);
    }//GEN-LAST:event_Box9ActionPerformed

    private void SetMachinePlay(int chosen){
        switch ("b" + chosen) {
            case "b1":
                Box1.setText("O");
                break;

            case "b2":
                Box2.setText("O");
                break;

            case "b3":
                Box3.setText("O");
                break;

            case "b4":
                Box4.setText("O");
                break;

            case "b5":
                Box5.setText("O");
                break;

            case "b6":
                Box6.setText("O");
                break;

            case "b7":
                Box7.setText("O");
                break;

            case "b8":
                Box8.setText("O");
                break;

            case "b9":
                Box9.setText("O");
                break;

            default:
                break;
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Box1;
    private javax.swing.JButton Box2;
    private javax.swing.JButton Box3;
    private javax.swing.JButton Box4;
    private javax.swing.JButton Box5;
    private javax.swing.JButton Box6;
    private javax.swing.JButton Box7;
    private javax.swing.JButton Box8;
    private javax.swing.JButton Box9;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
