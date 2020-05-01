/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.atividade.estruturadedados.uam.lists.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import listas.atividade.estruturadedados.uam.lists.*;

/**
 *
 * @author NycolasVieira
 * @param <T>
 */
public class SimpleList<T> implements ISimpleList<T>{

    private final T[] simpleList;
    private int lenght;

    public SimpleList() {
        this.simpleList = (T[]) Array.newInstance(null, 0);
    }
    
    @Override
    public boolean isEmpty(SimpleList array) {
        return this.simpleList == null || this.simpleList.length == 0;
    }

    @Override
    public T insert(T elem) {
        Arrays.copyOf(this.simpleList, lenght++);
        this.simpleList[lenght] = elem;
        return elem;
    }
    
    @Override
    public T update(T oldElem, T newElem) {        
        for (T value : this.simpleList) {
            if (value == (Class <T>) oldElem) {
                value = newElem;
                return value;
            }
        }
        
        throw new NullPointerException("Element not found");
    }

    @Override
    public T update(T newElem, int index) {
        if(this.simpleList == null 
                || (this.simpleList.length - 1) < index 
                || index < 0)
            throw new NullPointerException("Index out of range");
        
        this.simpleList[index] = newElem;
        return newElem;
    }

    @Override
    public T[] getAll() {
        if(this.simpleList == null || this.simpleList.length == 0)
                throw new NullPointerException("List is empty");
            
        return this.simpleList;
    }

    @Override
    public T getValue(T elem) {
        for (T value : this.simpleList) {
            if (value == (Class <T>) elem) {
                return value;
            }
        }
        
        throw new NullPointerException("Element not found");
    }

    @Override
    public T getValue(int index) {
        if(this.simpleList == null 
                || (this.simpleList.length - 1) < index 
                || index < 0)
            throw new NullPointerException("Index out of range");
        
        return this.simpleList[index];
    }
    
    @Override
    public String showList() {
        if (this.simpleList == null || this.simpleList.length == 0) {
            return "Lista vazia\n";
        }

        String list = "";
        for (T value : this.simpleList) {
            list += " " + value + "\n";
        }
        
        return list + "\n";
    }
    
    @Override
    public void remove(T elem) {
        for (T value : this.simpleList) {
            if (value == (Class <T>) elem) {
                
            }
        }
        
        throw new NullPointerException("Element not found");
    }

    @Override
    public void remove(int index) {
        if(this.simpleList == null 
                || (this.simpleList.length - 1) < index 
                || index < 0)
            throw new NullPointerException("Index out of range");
        
        for(int i = 0; i < this.simpleList.length; i++){
            if(this.simpleList[i] == this.simpleList[index]){
                // shifting elements
                for(int j = i; j < this.simpleList.length - 1; j++){
                    this.simpleList[j] = this.simpleList[j+1];
                }
                break;
            }
        } 
    }
    
}
