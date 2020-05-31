package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Plus extends Player {
    @Override
    public int[][] move(Integer x, Integer y, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[x][y] == 0) {
                    array[x][y] = 1;
                }

            }
        }
        return array;
    }


    @Override
    public ArrayList<Integer> question(int array[][]) {
        boolean a=true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer x = new Integer(0);
        Integer y = new Integer(0);
        while (a) {
            System.out.println("Введите ячейку по горизонтали, куда хочет поставить фигуру КРЕСТИК");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            System.out.println("Введите ячейку по вертикали, куда хочет поставить фигуру КРЕСТИК");
            Scanner scanner1 = new Scanner(System.in);
            y = scanner1.nextInt();
            if (x >= 0 && x <= 2 && y >= 0 && y <= 2 && array[x][y]==0) {
                a = false;
            } else {
                System.out.println("Так нельзя походить");
            }
        }
        arrayList.add(x);
        arrayList.add(y);
        return arrayList;
    }
}