package listas.atividade.estruturadedados.uam.ui;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import listas.atividade.estruturadedados.uam.controllers.GameController;

/**
 * @author NycolasVieira
 */
public class ConsoleGame {

    static GameController controller;

    public static void main(String[] args) {
        System.out.println("TIC-TAC-TOE");

        try {
            Scanner scanner = new Scanner(System.in);

            createNewPlayer(scanner);

            createGame(scanner);
        } catch (Exception ex) {
            Logger.getLogger(ConsoleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createNewPlayer(Scanner scanner) throws Exception {
        System.out.println("Insira o nome do usuário: ");

        controller = new GameController(scanner.next());
    }

    public static void createGame(Scanner scanner) {
        var result = 0;
        do {
            System.out.println("\nHorizontais (1 ao 3; 4 ao 6; 7 ao 9)");
            System.out.println("Informe o número da posição: ");

            var movement = "";
            var correctValue = false;
            do {
                try {
                    int value = Integer.parseInt(scanner.next());

                    if (value < 1 || value > 9) {
                        System.out.println("Valor inválido");
                        correctValue = false;
                    } else {
                        movement = "b" + value;
                        correctValue = true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Valor inválido");
                    correctValue = false;
                }
            } while (!correctValue);

            result = controller.setMovement(movement, null);

            if (controller.humanVictoryValidation == controller.HUMAN_VICTORY_CODE) {
                System.out.println("VENCEDOR: " + controller.getHumanPlayerName());
                
                var score = controller.getHumanPlayerScore();
                score++;
                System.out.println("PONTUAÇÃO: " + score);
                controller.setHumanPlayerScore(score);
            }

            if (controller.machineVictoryValidation == controller.MACHINE_VICTORY_CODE) {
                System.out.println("VENCEDOR: " + controller.getMachinePlayerName());
                
                var score = controller.getMachinePlayerScore();
                score++;
                System.out.println("PONTUAÇÃO: " + score);
                controller.setMachinePlayerScore(score);
            }

            if(result == controller.CANCEL_MOVEMENT_CODE){
                System.out.println("Movimento cancelado, jogue novamente");
            } else {
                System.out.println("Movimentos de " + controller.getHumanPlayerName() + ": " + Arrays.toString(controller.getHumanMovements()));
                System.out.println("Movimentos de " + controller.getMachinePlayerName() + ": " + Arrays.toString(controller.getMachineMovements()));
            }
        } while (result != -1 || result != -2);
    }
}
