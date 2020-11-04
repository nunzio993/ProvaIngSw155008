package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static MyListUnit myListUnit;

    @BeforeClass
        public static void prepare(){
        myListUnit = new MyListUnit();
    }
    @Test
    public void testaCrescente()
    {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> listaAttesa = new LinkedList<>();
        assertEquals(listaAttesa, myListUnit.ordineCrescente(list));
        for(int i= 0;i<12;i++){
            listaAttesa.add(i);
        }
        assertEquals(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11), listaAttesa);
    }

    @Test
    public void testaDecrescente()
    {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> listaAttesa = new LinkedList<>();
        assertEquals(listaAttesa, myListUnit.ordineCrescente(list));
        int num=12;
        for(int i= 0;i<12;i++){
            num--;
            listaAttesa.add(num);
        }
        assertEquals(Arrays.asList(11,10,9,8,7,6,5,4,3,2,1,0), listaAttesa);
    }
}
