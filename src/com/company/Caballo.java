package com.company;

import java.util.LinkedList;

public class Caballo extends Pieza {
    public Caballo(String color){
        super.setColor(color);
        super.setIdent('C');
    }
    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movCaballo = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);
        if(dentroTablero(coor[0] - 1, coor[1] + 2)){
            if(tablero.posiciones[coor[0] - 1][coor[1] + 2]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] - 1,coor[1] + 2));
            }
        }
        if(dentroTablero(coor[0] + 1, coor[1] + 2)){
            if(tablero.posiciones[coor[0] + 1][coor[1] + 2]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] + 1,coor[1] + 2));
            }
        }
        if(dentroTablero(coor[0] - 1, coor[1] - 2)){
            if(tablero.posiciones[coor[0] - 1][coor[1] - 2]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] - 1,coor[1] - 2));
            }
        }
        if(dentroTablero(coor[0] + 1, coor[1] - 2)){
            if(tablero.posiciones[coor[0] + 1][coor[1] - 2]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] + 1,coor[1] - 2));
            }
        }
        if(dentroTablero(coor[0] - 2, coor[1] - 1)){
            if(tablero.posiciones[coor[0] - 2][coor[1] - 1]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] - 2,coor[1] - 1));
            }
        }
        if(dentroTablero(coor[0] - 2, coor[1] + 1)){
            if(tablero.posiciones[coor[0] - 2][coor[1] + 1]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] - 2,coor[1] + 1));
            }
        }
        if(dentroTablero(coor[0] + 2, coor[1] - 1)){
            if(tablero.posiciones[coor[0] + 2][coor[1] - 1]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] + 2,coor[1] - 1));
            }
        }
        if(dentroTablero(coor[0] + 2, coor[1] + 1)){
            if(tablero.posiciones[coor[0] + 2][coor[1] + 1]== null){
                movCaballo.add(new Posicion().coorToCode(coor[0] + 2,coor[1] + 1));
            }
        }
        return movCaballo;
    }
}
