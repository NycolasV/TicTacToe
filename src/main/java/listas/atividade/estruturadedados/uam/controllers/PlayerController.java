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

    public Player CreatePlayer(String name) throws Exception {
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

    public boolean SetNewMovement(String movement, Player currentPlayer) {
        if (isEmpty(movement) || currentPlayer == null) {
            return false;
        }

        for (var player : players.getAllValues()) {
            for (var move : player.getMovements()) {
                if (movement.equals(move)) {
                    return false;
                }
            }
        }

        currentPlayer.setMovement(movement);
        return true;
    }
    
    public boolean RemoveMovement(String movement, Player currentPlayer) {
        if (isEmpty(movement) || currentPlayer == null) {
            return false;
        }

        currentPlayer.removeMovement(movement);
        return true;
    }

    public String[] GetAllMovement(Player currentPlayer) {
        if(currentPlayer == null)
            return null;
        
        return currentPlayer.getMovements();
    }
    
    public void setScore(long point, Player currentPlayer){
        if(point <= 0 || currentPlayer == null)
            return;
        
        currentPlayer.setScore(point);
    }
    
    public void getScore(Player currentPlayer){
        if(currentPlayer == null)
            return;
        
        currentPlayer.getScore();
    }

    public ArrayList<Player> getPlayerList() throws Exception{
        if(this.players.isEmpty())
            throw new Exception("List is empty");
        
        return players.getAllValues();
    }
    
    public Player getPlayer(String name) throws Exception{
        if(this.players.isEmpty() || isEmpty(name))
            throw new Exception("List is empty");
        
        for(var player : this.players.getAllValues()){
            if(name.equals(player.getName())){
                return player;
            }
        }
        
        return null;
    }
    
    private boolean isEmpty(final String s) {
        return s == null || s.trim().isEmpty();
    }
}
