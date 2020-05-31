package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        int[][] array = new int[3][3];
        Boolean a = true;
        int b = 0;
        Plus plus = new Plus();
        Nolik nolik=new Nolik();
        while (a) {

            plus.mass(array);

            if (b % 2 ==0) {
                arrayList1 = plus.question(array);
                array = plus.move( arrayList1.get(0), arrayList1.get(1), array);
                booleanArrayList = plus.victory(array, a);
                a = booleanArrayList.get(0);
                b++;

            } else {
                arrayList1 = nolik.question(array);
                array = nolik.move( arrayList1.get(0),  arrayList1.get(1), array);
                booleanArrayList = nolik.victory(array, a);
                a = booleanArrayList.get(0);
                b++;

            }
        }
    }
}