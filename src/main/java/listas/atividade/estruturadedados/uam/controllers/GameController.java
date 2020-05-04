package listas.atividade.estruturadedados.uam.controllers;

import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import listas.atividade.estruturadedados.uam.models.Player;

/**
 * @author NycolasVieira
 */
public class GameController {

    private final PlayerController controller;
    private final Player humanPlayer;
    private final Player machinePlayer;
    private int lastReturn;
    
    public GameController(PlayerController controller, Player player) throws Exception {
        this.lastReturn = 0;
        this.controller = controller;
        this.humanPlayer = player;
        this.machinePlayer = controller.createPlayer("Computador");
    }

    public String getHumanPlayerName() {
        return humanPlayer.getName();
    }

    public String getMachinePlayerName() {
        return machinePlayer.getName();
    }

    public long getHumanPlayerScore() {
        return humanPlayer.getScore();
    }

    public void setHumanPlayerScore(long score) {
        humanPlayer.setScore(score);
    }

    public long getMachinePlayerScore() {
        return machinePlayer.getScore();
    }

    public void setMachinePlayerScore(long score) {
        machinePlayer.setScore(score);
    }

    public void restartGame() {
        lastReturn = 0;
        controller.removeAllMovement(humanPlayer);
        controller.removeAllMovement(machinePlayer);
    }

    public int setMovement(String movement, JButton Box) {        
        try {
            if(lastReturn == -1 || lastReturn == -2){
                JOptionPane.showMessageDialog(null, 
                        "Jogo encerrado, reinicie-o para continuar", "ERRO", JOptionPane.ERROR_MESSAGE);
                return -3;
            }

            var result = controller.setNewMovement(movement, humanPlayer);   
            
            if (result) {
                Box.setText("X");

                var confirmPlay = JOptionPane.showConfirmDialog(null, "Confimar movimento");

                if (confirmPlay == JOptionPane.YES_OPTION) {
                    if (validateMovements(humanPlayer)) {
                        lastReturn = -1;
                    } else {
                        lastReturn = machineMovement();
                    }
                    
                    return lastReturn;
                } else {
                    Box.setText("");
                    controller.removeMovement(movement, humanPlayer);
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return 0;
    }

    private int machineMovement() {
        Random randomInt = new Random();

        int chosen = 0;
        boolean result;

        do {
            chosen = randomInt.nextInt((9 - 1) + 1) + 1;
            result = controller.setNewMovement("b" + chosen, machinePlayer);
        } while (!result);

        if (validateMovements(machinePlayer)) {
            return -2;
        } else {
            return chosen;
        }
    }

    private boolean validateMovements(Player player) {
        var movements = player.getMovements();

        if (movements == null || movements.length <= 0) {
            return false;
        }

        List<String> list = Arrays.asList(movements);

        var result = list.containsAll(Arrays.asList("b1", "b2", "b3"));

        if (!result) {
            result = list.containsAll(Arrays.asList("b1", "b5", "b9"));

            if (!result) {
                result = list.containsAll(Arrays.asList("b1", "b4", "b7"));

                if (!result) {
                    result = list.containsAll(Arrays.asList("b2", "b5", "b8"));

                    if (!result) {
                        result = list.containsAll(Arrays.asList("b3", "b6", "b9"));

                        if (!result) {
                            result = list.containsAll(Arrays.asList("b3", "b5", "b7"));

                            if (!result) {
                                result = list.containsAll(Arrays.asList("b4", "b5", "b6"));

                                if (!result) {
                                    result = list.containsAll(Arrays.asList("b7", "b8", "b9"));
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if (!result) {
            var allMovements = controller.getAllMovement(humanPlayer).length
                    + controller.getAllMovement(machinePlayer).length;

            if (allMovements >= 9) {
                return false;
            }
        }

        return result;
    }
}
