package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
        char x = 'A';
        System.out.println((int)(x));
        String test0 = "Hola Mundo";
        System.out.println(test0.charAt(0));

        Posicion posicion = new Posicion();
        String code = "A1";
        int x = 0, y = 7;
        System.out.println(posicion.coorToCode(x,y));
        int[] array = posicion.codeToCoor(code);
        System.out.println(array[0]);
        System.out.println(array[1]);

        Tablero tablero = new Tablero();
        Peon peon1 = new Peon("NEGRO");
        LinkedList<String> peonMovs = peon1.movimientos("H1", tablero);

        for(int i = 0; i < peonMovs.size();i++){
            System.out.println(peonMovs.get(i));
        }

        Tablero tablero = new Tablero();
        tablero.imprimirTablero();
        Peon peon1 = new Peon("BLANCO");
        LinkedList<String> peonMovs = peon1.movimientos("A2", tablero);
        Torre torre1 = new Torre("BLANCO");
        LinkedList<String> torreMovs = torre1.movimientos("D4", tablero);
        Alfil alfil = new Alfil("BLANCO");
        LinkedList<String> alfilMovs = alfil.movimientos("D4", tablero);
        Caballo caballo = new Caballo("BLANCO");
        LinkedList<String> caballoMovs = caballo.movimientos("E4", tablero);
        Reina reina = new Reina("BLANCO");
        LinkedList<String> reinaMovs = reina.movimientos("D4", tablero);
        Rey rey= new Rey("BLANCO");
        LinkedList<String> reyMovs = rey.movimientos("D4", tablero);

        for(int i = 0; i < reyMovs.size();i++){
            System.out.println(reyMovs.get(i));
        }
         **/
        Tablero tablero = new Tablero();
        tablero.imprimirTablero();
        tablero.mover("BLANCO", "B1","D2");
        System.out.println();
        tablero.imprimirTablero();

    }
}
