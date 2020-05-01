/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.atividade.estruturadedados.uam.lists;

import listas.atividade.estruturadedados.uam.lists.array.SimpleList;

/**
 * @author NycolasVieira
 * @param <T>
 */
public interface ISimpleList<T> {    
    public boolean isEmpty(SimpleList array);
    
    public T insert(T elem);
    
    public T update(T oldElem, T newElem);
    
    public T update(T newElem, int index);
    
    public T[] getAll();
    
    public T getValue(T elem);
    
    public T getValue(int index);
    
    public String showList();
    
    public void remove(T elem);
    
    public void remove(int index);
}
