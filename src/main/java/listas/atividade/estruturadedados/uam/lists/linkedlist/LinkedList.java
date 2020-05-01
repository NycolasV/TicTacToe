package listas.atividade.estruturadedados.uam.lists.linkedlist;

import java.util.ArrayList;
import listas.atividade.estruturadedados.uam.lists.*;

/**
 * @author NycolasVieira
 * @param <T>
 */
public class LinkedList<T> implements ILinkedList<T>{

    private Node start;

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public Node insertStart(T elem) {
        Node newNode = new Node(elem);
        newNode.setNext(start);
        start = newNode;
        
        return newNode;
    }

    @Override
    public Node insertLast(T elem) {
        for (var node = start; node != null; node = node.getNext()) {
            if(node.getNext() == null){
                Node newNode = new Node(elem);
                node.setNext(newNode);
                return newNode;
            }
        }

        return null;
    }
    
    @Override
    public Node updateStart(T elem) {
        start.setValue(elem);
        return start;
    }

    @Override
    public Node updateNode(T oldElem, T newElem) {
        if(oldElem == start.getValue()){
            updateStart(newElem);
            return start;
        }
            
        for (var node = start; node != null; node = node.getNext()) {
            if(node.getValue() == oldElem){
                node.setValue(newElem);
                return node;
            }
        }
        
        return null;
    }

    @Override
    public void removeStart() {
        start = start.getNext();
    }

    @Override
    public void removeNode(T elem) {
        if(elem == start.getValue()){
            removeStart();
            return;
        }
            
        var before = start;
        for (var node = start; node != null; node = node.getNext()) {
            if(node.getValue() == elem){
                before = node.getNext();
                node.setValue(null);
                node.setNext(node);
                break;
            }
            
            before = node;
        }
    }

    @Override
    public ArrayList<Node> getAllNodes() {
        var list = new ArrayList<Node>();
        for (var node = start; node != null; node = node.getNext()) {
            list.add(node);
        }

        return list;
    }

    @Override
    public Node getNode(T elem) {
        for (var node = start; node != null; node = node.getNext()) {
            if (elem == node.getValue()) {
                return node;
            }
        }

        return null;
    }

    @Override
    public ArrayList<T> getAllValues() {
        var list = new ArrayList<T>();
        for (var node = start; node != null; node = node.getNext()) {
            list.add((T)node.getValue());
        }

        return list;
    }
    
    @Override
    public T getValue(T elem) {
        for (var node = start; node != null; node = node.getNext()) {
            if (elem == node.getValue()) {
                return (T)node.getValue();
            }
        }

        return null;
    }

    @Override
    public String showList() {
        if (isEmpty()) {
            return "Lista vazia\n";
        }

        String list = "";
        for (var node = start; node != null; node = node.getNext()) {
            list += " " + node.getValue();
        }
        
        return list + "\n";
    }
}
