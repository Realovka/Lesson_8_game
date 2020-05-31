package com.company;

import java.util.ArrayList;


public abstract class Player {
    // метод, выводящий массив
    public void mass(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод, задающий вопрос
    public abstract ArrayList<Integer> question(int array[][]);


    // метод хода игрока
    public abstract int[][] move(Integer x, Integer y, int array[][]);


    // метод проверки, а не выиграл ли игрок
    public ArrayList<Boolean> victory(int array[][], Boolean a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[0][0] != 0 && array[0][0] == array[0][1] && array[0][1] == array[0][2]) ||
                        (array[0][0] != 0 && array[0][0] == array[1][0] && array[1][0] == array[2][0]) ||
                        (array[1][0] != 0 && array[1][0] == array[1][1] && array[1][1] == array[1][2]) ||
                        (array[2][0] != 0 && array[2][0] == array[2][1] && array[2][1] == array[2][2]) ||
                        (array[0][1] != 0 && array[0][1] == array[1][1] && array[1][1] == array[2][1]) ||
                        (array[0][2] != 0 && array[0][2] == array[1][2] && array[1][2] == array[2][2]) ||
                        (array[2][0] != 0 && array[2][0] == array[1][1] && array[1][1] == array[0][2])) {


                    System.out.println("Игрок выиграл");
                    a = false;

                } else {
                    System.out.println("Ходит другой игрок");
                }
                break;
            }
            break;

        }
        ArrayList<Boolean> booleanArray = new ArrayList<>();
        booleanArray.add(a);


        return booleanArray;
    }

}

