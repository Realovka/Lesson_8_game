package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        char[][] array = new char[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '_';
            }
        }
        Boolean a = true;  // переменная, для определения окончания игры
        int b = 0;
        Cross cross = new Cross();
        Zero zero = new Zero();
        while (a) {

            cross.mass(array);

            if (b % 2 == 0) {
                arrayList1 = cross.question(array);
                array = cross.move(arrayList1.get(0), arrayList1.get(1), array);
                a=cross.victory(array, a);

                b++;

            } else {
                arrayList1 = zero.question(array);
                array = zero.move(arrayList1.get(0), arrayList1.get(1), array);
                a = zero.victory(array, a);
                b++;

            }
        }
    }
}