package com.company;

import java.util.LinkedList;

public class Torre extends Pieza {
    public Torre(String color){
        super.setColor(color);
        super.setIdent('T');
    }
    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movTorre = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);

        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1])){
                if(tablero.posiciones[coor[0] - i][coor[1]]== null){
                    movTorre.add(new Posicion().coorToCode(coor[0] - i,coor[1]));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1])){
                if(tablero.posiciones[coor[0] + i][coor[1]]== null){
                    movTorre.add(new Posicion().coorToCode(coor[0] + i,coor[1]));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0], coor[1] - i)){
                if(tablero.posiciones[coor[0]][coor[1] - i]== null){
                    movTorre.add(new Posicion().coorToCode(coor[0],coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0], coor[1] + i)){
                if(tablero.posiciones[coor[0]][coor[1] + i]== null){
                    movTorre.add(new Posicion().coorToCode(coor[0],coor[1] + i));
                }else{
                    break;
                }
            }
        }
        return movTorre;
    }
}
