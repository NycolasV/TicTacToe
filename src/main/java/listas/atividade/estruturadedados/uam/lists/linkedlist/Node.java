package listas.atividade.estruturadedados.uam.lists.linkedlist;

/**
 * @author NycolasVieira
 * @param <T>
 */
public class Node<T> {
    private Node next;
    private T value;

    public Node(T val) {
        value = val;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
