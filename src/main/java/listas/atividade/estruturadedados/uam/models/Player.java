package listas.atividade.estruturadedados.uam.models;

import listas.atividade.estruturadedados.uam.lists.array.SimpleList;

/**
 * @author NycolasVieira
 */
public class Player {
    
    private String name;

    private long score;

    private SimpleList<String> movements;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.movements = new SimpleList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String[] getMovements() {
        return movements.getAll();
    }

    public void setMovement(String movement) {
        this.movements.insert(movement);
    }
}
