package org.example;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       MyListUnit myListUnit = new MyListUnit();
        LinkedList<Integer> lista = new LinkedList<>();
        for(int i = 0;i<10;i++){
            lista.add(i);
        }
        for(int i = 0;i<10;i++){
            lista.add(i);
        }
        myListUnit.ordineCrescente(lista);
    }

}
