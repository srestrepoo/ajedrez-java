package com.company;

import java.util.LinkedList;

public class Rey extends Pieza {
    public Rey(String color){
        super.setColor(color);
        super.setIdent('R');
    }
    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movRey = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);
            if(dentroTablero(coor[0] - 1, coor[1] - 1)) {
                if (tablero.posiciones[coor[0] - 1][coor[1] - 1] == null) {
                    movRey.add(new Posicion().coorToCode(coor[0] - 1, coor[1] - 1));
                }
            }
            if(dentroTablero(coor[0] + 1, coor[1] + 1)) {
                if (tablero.posiciones[coor[0] + 1][coor[1] + 1] == null) {
                    movRey.add(new Posicion().coorToCode(coor[0] + 1, coor[1] + 1));
                }
            }
            if(dentroTablero(coor[0] + 1, coor[1] - 1)){
                if(tablero.posiciones[coor[0] + 1][coor[1] - 1]== null){
                    movRey.add(new Posicion().coorToCode(coor[0] + 1,coor[1] - 1));
                }
            }
            if(dentroTablero(coor[0] - 1, coor[1] + 1)){
                if(tablero.posiciones[coor[0] - 1][coor[1] + 1]== null){
                    movRey.add(new Posicion().coorToCode(coor[0] - 1,coor[1] + 1));
                }
            }
            if(dentroTablero(coor[0] - 1, coor[1])){
                if(tablero.posiciones[coor[0] - 1][coor[1]]== null){
                    movRey.add(new Posicion().coorToCode(coor[0] - 1,coor[1]));
                }
            }
            if(dentroTablero(coor[0] + 1, coor[1])){
                if(tablero.posiciones[coor[0] + 1][coor[1]]== null){
                    movRey.add(new Posicion().coorToCode(coor[0] + 1,coor[1]));
                }
            }
            if(dentroTablero(coor[0], coor[1] - 1)) {
                if (tablero.posiciones[coor[0]][coor[1] - 1] == null) {
                    movRey.add(new Posicion().coorToCode(coor[0], coor[1] - 1));
                }
            }
            if(dentroTablero(coor[0], coor[1] + 1)){
                if(tablero.posiciones[coor[0]][coor[1] + 1]== null){
                    movRey.add(new Posicion().coorToCode(coor[0],coor[1] + 1));
                }
            }

        return movRey;
    }
}
