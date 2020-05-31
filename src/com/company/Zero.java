package com.company;

public class Zero extends Player {

    @Override
    public String getName() {
        return "НОЛИК";
    }

    @Override
    public char[][] move(Integer x, Integer y, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[x][y] == '_') {
                    array[x][y] = 'O';

                }

            }
        }
        return array;
    }

}

