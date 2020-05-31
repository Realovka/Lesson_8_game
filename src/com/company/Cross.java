package com.company;

public class Cross extends Player {

    @Override
    public String getName() {
        return "КРЕСТИК";
    }

    @Override
    public char[][] move(Integer x, Integer y, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[x][y] == '_') {
                    array[x][y] = 'X';
                }

            }
        }
        return array;
    }


}