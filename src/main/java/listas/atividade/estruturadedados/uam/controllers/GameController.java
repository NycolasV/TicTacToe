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

    public final int CANCEL_MOVEMENT_CODE = 0;
    public final int HUMAN_VICTORY_CODE = -1;
    public final int MACHINE_VICTORY_CODE = -2;
    public final int ENDGAME_CODE = -3;
    
    private final PlayerController controller;
    private final Player humanPlayer;
    private final Player machinePlayer;
    public int humanVictoryValidation;
    public int machineVictoryValidation;

    public GameController(String name) throws Exception {
        this.humanVictoryValidation = 0;
        this.machineVictoryValidation = 0;

        this.controller = new PlayerController();
        this.humanPlayer = controller.createPlayer(name);
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

    public String[] getHumanMovements() {
        return humanPlayer.getMovements();
    }

    public String[] getMachineMovements() {
        return machinePlayer.getMovements();
    }

    public void restartGame() {
        humanVictoryValidation = 0;
        controller.removeAllMovement(humanPlayer);
        
        machineVictoryValidation = 0;
        controller.removeAllMovement(machinePlayer);
    }

    public int setMovement(String movement, JButton Box) {
        try {
            if (humanVictoryValidation == -1 || machineVictoryValidation == -2) {
                if (Box != null) {
                    JOptionPane.showMessageDialog(null,
                            "Jogo encerrado, reinicie-o para continuar", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Jogo encerrado");
                }
                
                return ENDGAME_CODE;
            }

            var result = controller.setNewMovement(movement, humanPlayer);

            if (result) {
                if (Box != null) {
                    Box.setText("X");
                }

                var confirmPlay = JOptionPane.showConfirmDialog(null, "Confimar movimento");

                if (confirmPlay == JOptionPane.YES_OPTION) {
                    if (validateMovements(humanPlayer)) {
                        humanVictoryValidation = HUMAN_VICTORY_CODE;
                        return HUMAN_VICTORY_CODE;
                    } else {
                        return machineMovement();
                    }
                } else {
                    if (Box != null) {
                        Box.setText("");
                    }

                    controller.removeMovement(movement, humanPlayer);
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return CANCEL_MOVEMENT_CODE;
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
            machineVictoryValidation = MACHINE_VICTORY_CODE;
        }
        
        return chosen;
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
