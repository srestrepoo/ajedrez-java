package com.company;
import java.util.LinkedList;

public class Peon extends Pieza {
    public Peon(String color){
        super.setColor(color);
        super.setIdent('P');
    }

    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movPeon = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);
        if(super.getColor().compareTo("BLANCO") == 0 && dentroTablero(coor[0] - 1, coor[1])) {
            if (tablero.posiciones[coor[0] - 1][coor[1]] == null) {
                movPeon.add(new Posicion().coorToCode(coor[0] - 1,coor[1]));
            }
            if (tablero.posiciones[coor[0] - 2][coor[1]] == null && coor[0] == 6) {
                movPeon.add(new Posicion().coorToCode(coor[0] - 2,coor[1]));
            }
        }else if(super.getColor().compareTo("NEGRO") == 0 && dentroTablero(coor[0] + 1, coor[1])){
            if (tablero.posiciones[coor[0] + 1][coor[1]] == null) {
                movPeon.add(new Posicion().coorToCode(coor[0] + 1,coor[1]));
            }
            if (tablero.posiciones[coor[0] + 2][coor[1]] == null && coor[0] == 2) {
                movPeon.add(new Posicion().coorToCode(coor[0] + 2,coor[1]));
            }
        }
        return movPeon;
    }
}
