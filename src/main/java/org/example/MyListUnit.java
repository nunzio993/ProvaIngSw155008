package org.example;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyListUnit {

    public LinkedList<Integer> ordineCrescente(LinkedList<Integer> lista){
        Integer k;
        if(lista.isEmpty())
            return lista;

        Comparator c = null;

        for(Integer i : lista){
            for(Integer j : lista){
                if(i.compareTo(j)>0){
                    lista.sort(c);
                }
            }
        }
        for(Integer i : lista)
            System.out.println(i);

        return lista;
    }

    public List<Integer> ordineDecrescente(LinkedList<Integer> lista){
        Integer k;
        if(lista.isEmpty())
            return lista;

        Comparator c = null;

        for(Integer i : lista){
            for(Integer j : lista){
                if(i.compareTo(j)<0){
                    lista.sort(c);
                }
            }
        }

        return lista;
    }
}
