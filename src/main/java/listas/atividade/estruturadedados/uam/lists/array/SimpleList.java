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
public class SimpleList<T> implements ISimpleList<T> {

    private T[] simpleList;
    private int lenght;

    public SimpleList(Class<T> classType) {
        this.simpleList = (T[]) Array.newInstance(classType, 0);
        this.lenght = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.simpleList == null || this.simpleList.length == 0;
    }

    @Override
    public T insert(T elem) {
        if (this.simpleList.length == 1) {
            if (this.simpleList[0] == null) {
                this.simpleList[0] = elem;
                return elem;
            }
        }

        lenght++;
        var size = lenght;
        this.simpleList = Arrays.copyOf(this.simpleList, size);

        size--;
        this.simpleList[size] = elem;
        return elem;
    }

    @Override
    public T update(T oldElem, T newElem) {
        for (T value : this.simpleList) {
            if (value == oldElem) {
                value = newElem;
                return value;
            }
        }

        throw new NullPointerException("Element not found");
    }

    @Override
    public T update(T newElem, int index) {
        if (this.simpleList == null
                || (this.simpleList.length - 1) < index
                || index < 0) {
            throw new NullPointerException("Index out of range");
        }

        this.simpleList[index] = newElem;
        return newElem;
    }

    @Override
    public T[] getAll() {
        if (this.simpleList == null || this.simpleList.length == 0) {
            throw new NullPointerException("List is empty");
        }

        return this.simpleList;
    }

    @Override
    public T getValue(T elem) {
        for (T value : this.simpleList) {
            if (value == elem) {
                return value;
            }
        }

        throw new NullPointerException("Element not found");
    }

    @Override
    public T getValue(int index) {
        if (this.simpleList == null
                || (this.simpleList.length - 1) < index
                || index < 0) {
            throw new NullPointerException("Index out of range");
        }

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
        for (int i = 0; i < this.simpleList.length; i++) {
            if (this.simpleList[i] == elem) {
                if (removeElement(i)) {
                    return;
                } else {
                    return;
                }
            }
        }

        throw new NullPointerException("Element not found");
    }

    @Override
    public void remove(int index) {
        if (this.simpleList == null
                || (this.simpleList.length - 1) < index
                || index < 0) {
            throw new NullPointerException("Index out of range");
        }

        for (int i = 0; i < this.simpleList.length; i++) {
            if (this.simpleList[i] == this.simpleList[index]) {
                if (removeElement(i)) {
                    return;
                } else {
                    return;
                }
            }
        }
    }

    private boolean removeElement(int i) {
        if (this.simpleList.length == 1) {
            this.simpleList[i] = null;
            return true;
        }

        for (int j = i; j < this.simpleList.length; j++) {
            try {
                this.simpleList[j] = this.simpleList[j+1];
            } catch(Exception ex){
                this.simpleList[j] = null;
                
                var newSize = this.simpleList.length - 1;
                
                this.simpleList = Arrays.copyOf(this.simpleList, newSize);
                break;
            }
        }
        
        return false;
    }
}
