package com.company;

import java.util.LinkedList;

public class Alfil extends Pieza {
    public Alfil(String color){
        super.setColor(color);
        super.setIdent('A');
    }

    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movAlfil = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);

        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1] - i)){
                if(tablero.posiciones[coor[0] - i][coor[1] - i]== null){
                    movAlfil.add(new Posicion().coorToCode(coor[0] - i,coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1] + i)){
                if(tablero.posiciones[coor[0] + i][coor[1] + i]== null){
                    movAlfil.add(new Posicion().coorToCode(coor[0] + i,coor[1] + i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1] - i)){
                if(tablero.posiciones[coor[0] + i][coor[1] - i]== null){
                    movAlfil.add(new Posicion().coorToCode(coor[0] + i,coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1] + i)){
                if(tablero.posiciones[coor[0] - i][coor[1] + i]== null){
                    movAlfil.add(new Posicion().coorToCode(coor[0] - i,coor[1] + i));
                }else{
                    break;
                }
            }
        }
        return movAlfil;
    }
}
