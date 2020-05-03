package listas.atividade.estruturadedados.uam.controllers;

import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import listas.atividade.estruturadedados.uam.models.Player;

/**
 * @author NycolasVieira
 */
public class GameController {
    
    PlayerController controller;
    Player humanPlayer;
    Player machinePlayer;

    public GameController(PlayerController controller, Player player) throws Exception {
        this.controller = controller;
        this.humanPlayer = player;

        var machinePlayer = this.controller.CreatePlayer("Computador");
        this.machinePlayer = machinePlayer;
    }
    
    public int setMovement(String movement, JButton Box) {
        try {
            var result = controller.SetNewMovement(movement, humanPlayer);

            if (result) {
                Box.setText("X");

                var confirmPlay = JOptionPane.showConfirmDialog(null, "Confimar movimento");

                if (confirmPlay == JOptionPane.YES_OPTION) {
                    return machineMovement();
                } else {
                    Box.setText("");
                    controller.RemoveMovement(movement, humanPlayer);
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return 0;
    }

    public int machineMovement() {
        Random randomInt = new Random();
        
        int chosen;
        int tentatives = 0;
        boolean result;
        
        do {
            chosen = randomInt.nextInt((9 - 1) + 1) + 1;
            result = controller.SetNewMovement("b" + chosen, machinePlayer);           
            tentatives++;
        } while (!result && tentatives < 9);

        if(tentatives >= 8){
            chosen = 0;
        }
        
        return chosen;
    }
}
