package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] [] tablero = {{' ', '|', ' ', '|', ' '},
                {' ', '-', ' ', '-', ' '},
                {' ', '|', ' ', '|', ' '},
                {' ', '-', ' ', '-', ' '},
                {' ', '|', ' ', '|', ' '}};

            imprimirtablero(tablero);
        System.out.println("Donde quieres poner (1,9):");
         int posicion =  scanner.nextInt();
        System.out.println(posicion);
        switch (posicion) {
            case 1:
                tablero [0] [0] = 'X';
                break;
            case 2:
                tablero [0] [2] = 'X';
                break;
            case 3:
                tablero [0] [4] = 'X';
                break;
            case 4:
                tablero [2] [0] = 'X';
                break;
            case 5:
                tablero [2] [2] = 'X';
                break;
            case 6:
                tablero [2] [4] = 'X';
                break;
            case 7:
                tablero [4] [0] = 'X';
                break;
            case 8:
                tablero [4] [2] = 'X';
                break;
            case 9:
                tablero [4] [4] = 'X';
                break;
        }
        imprimirtablero(tablero);
    }
    public static void imprimirtablero(char[][] tablero) {
        for (char[] row : tablero) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(' ');
        }
    }
}
