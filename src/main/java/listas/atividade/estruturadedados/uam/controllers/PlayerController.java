package listas.atividade.estruturadedados.uam.controllers;

import java.util.ArrayList;
import listas.atividade.estruturadedados.uam.lists.linkedlist.LinkedList;
import listas.atividade.estruturadedados.uam.models.Player;

/**
 * @author NycolasVieira
 */
public class PlayerController {

    private LinkedList<Player> players;

    public PlayerController() {
        this.players = new LinkedList();
    }

    public Player createPlayer(String name) throws Exception {
        if (isEmpty(name)) {
            throw new Exception("Name cannot be empty");
        }

        for (var player : players.getAllValues()) {
            if (name.equals(player.getName())) {
                throw new Exception("Name already exists, try another one");
            }
        }

        Player player = new Player(name);
        players.insertLast(player);
        return player;
    }

    public boolean setNewMovement(String movement, Player player) {
        if (isEmpty(movement) || player == null) {
            return false;
        }

        for (var anotherPlayer : players.getAllValues()) {
            for (var move : anotherPlayer.getMovements()) {
                if (movement.equals(move)) {
                    return false;
                }
            }
        }

        player.setMovement(movement);
        return true;
    }

    public String[] getAllMovement(Player player) {
        if (player == null) {
            return null;
        }

        return player.getMovements();
    }

    public boolean removeMovement(String movement, Player player) {
        if (isEmpty(movement) || player == null) {
            return false;
        }

        player.removeMovement(movement);
        return true;
    }

    public void removeAllMovement(Player player) {
        if (player == null) {
            return;
        }

        player.restarMovements();
    }

    public void setScore(long point, Player player) {
        if (point <= 0 || player == null) {
            return;
        }

        player.setScore(point);
    }

    public void getScore(Player player) {
        if (player == null) {
            return;
        }

        player.getScore();
    }

    public ArrayList<Player> getPlayerList() throws Exception {
        if (this.players.isEmpty()) {
            throw new Exception("List is empty");
        }

        return players.getAllValues();
    }

    public Player getPlayer(String name) throws Exception {
        if (this.players.isEmpty() || isEmpty(name)) {
            throw new Exception("List is empty");
        }

        for (var player : this.players.getAllValues()) {
            if (name.equals(player.getName())) {
                return player;
            }
        }

        return null;
    }

    private boolean isEmpty(final String s) {
        return s == null || s.trim().isEmpty();
    }
}
