package listas.atividade.estruturadedados.uam.lists;

import listas.atividade.estruturadedados.uam.lists.linkedlist.Node;
import java.util.ArrayList;

/**
 * @author NycolasVieira
 * @param <T>
 */
public interface ILinkedList<T> {
    
    public boolean isEmpty();
    
    public Node insertStart(T elem);
    
    public Node insertLast(T elem);
    
    public Node updateStart(T elem);
    
    public Node updateNode(T oldElem, T newElem);
    
    public void removeStart();
    
    public void removeNode(T elem);
    
    public ArrayList<Node> getAllNodes();
    
    public Node getNode(T elem);
    
    public ArrayList<T> getAllValues();
    
    public T getValue(T elem);
    
    public String showList();
}
