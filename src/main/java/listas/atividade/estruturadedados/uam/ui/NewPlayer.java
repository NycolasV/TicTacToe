package listas.atividade.estruturadedados.uam.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import listas.atividade.estruturadedados.uam.controllers.PlayerController;

/**
 * @author NycolasVieira
 */
public class NewPlayer extends javax.swing.JFrame {

    private final PlayerController controller;

    public NewPlayer() {
        initComponents();
        
        controller = new PlayerController();
        ErrorPlayerName.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayerNameLabel = new java.awt.Label();
        PlayerName = new javax.swing.JTextField();
        CreatePlayerButton = new javax.swing.JButton();
        ErrorPlayerName = new javax.swing.JLabel();
        CloseGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlayerNameLabel.setText("Insira o nome do jogador");

        PlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerNameActionPerformed(evt);
            }
        });
        PlayerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayerNameKeyPressed(evt);
            }
        });

        CreatePlayerButton.setText("Continuar");
        CreatePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePlayerButtonActionPerformed(evt);
            }
        });

        CloseGame.setText("Fechar");
        CloseGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErrorPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(PlayerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreatePlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CloseGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PlayerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ErrorPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreatePlayerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseGame)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        PlayerNameLabel.getAccessibleContext().setAccessibleName("PlayerNameLabel");
        PlayerName.getAccessibleContext().setAccessibleName("PlayerName");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerNameActionPerformed

    }//GEN-LAST:event_PlayerNameActionPerformed

    private void CreatePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePlayerButtonActionPerformed
        try {
            var player = controller.CreatePlayer(PlayerName.getText());
            
            new Game(player, controller).setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            ErrorPlayerName.setVisible(true);
            ErrorPlayerName.setForeground(Color.red);
            ErrorPlayerName.setText(ex.getMessage());
        }
    }//GEN-LAST:event_CreatePlayerButtonActionPerformed

    private void PlayerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayerNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            CreatePlayerButton.doClick();
        }
    }//GEN-LAST:event_PlayerNameKeyPressed

    private void CloseGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseGameActionPerformed
        dispose();
    }//GEN-LAST:event_CloseGameActionPerformed

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
            java.util.logging.Logger.getLogger(NewPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseGame;
    private javax.swing.JButton CreatePlayerButton;
    private javax.swing.JLabel ErrorPlayerName;
    private javax.swing.JTextField PlayerName;
    private java.awt.Label PlayerNameLabel;
    // End of variables declaration//GEN-END:variables
}
