package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Player {

    public abstract String getName();

    // метод, выводящий массив
    public void mass(char array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод, задающий вопрос
    public ArrayList<Integer> question(char array[][]) {
        boolean a = true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer x = new Integer(0);
        Integer y = new Integer(0);
        while (a) {
            System.out.println("Введите ячейку по горизонтали, куда хочет поставить фигуру " + getName());
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            System.out.println("Введите ячейку по вертикали, куда хочет поставить фигуру " + getName());
            Scanner scanner1 = new Scanner(System.in);
            y = scanner1.nextInt();
            if (x >= 0 && x <= 2 && y >= 0 && y <= 2 && array[x][y] == '_') {
                a = false;
            } else {
                System.out.println("Так нельзя походить");
            }
        }
        arrayList.add(x);
        arrayList.add(y);
        return arrayList;
    }


    // метод хода игрока
    public abstract char[][] move(Integer x, Integer y, char array[][]);


    // метод проверки, а не выиграл ли игрок
    public Boolean victory(char array[][], Boolean a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[0][0] != '_' && array[0][0] == array[0][1] && array[0][1] == array[0][2]) ||
                        (array[0][0] != '_' && array[0][0] == array[1][0] && array[1][0] == array[2][0]) ||
                        (array[1][0] != '_' && array[1][0] == array[1][1] && array[1][1] == array[1][2]) ||
                        (array[2][0] != '_' && array[2][0] == array[2][1] && array[2][1] == array[2][2]) ||
                        (array[0][1] != '_' && array[0][1] == array[1][1] && array[1][1] == array[2][1]) ||
                        (array[0][2] != '_' && array[0][2] == array[1][2] && array[1][2] == array[2][2]) ||
                        (array[2][0] != '_' && array[2][0] == array[1][1] && array[1][1] == array[0][2])) {


                    System.out.println("Игрок " + getName() + " выиграл");
                    a = false;

                } else {
                    System.out.println("Ходит другой игрок");
                }
                break;
            }
            break;

        }


        return a;
    }

}

