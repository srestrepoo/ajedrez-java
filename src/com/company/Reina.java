package com.company;

import java.util.LinkedList;

public class Reina extends Pieza{
    public Reina(String color){
        super.setColor(color);
        super.setIdent('Q');
    }
    public LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> movReina = new LinkedList<String>();
        int[] coor = new Posicion().codeToCoor(posicion);

        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1] - i)){
                if(tablero.posiciones[coor[0] - i][coor[1] - i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] - i,coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1] + i)){
                if(tablero.posiciones[coor[0] + i][coor[1] + i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] + i,coor[1] + i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1] - i)){
                if(tablero.posiciones[coor[0] + i][coor[1] - i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] + i,coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1] + i)){
                if(tablero.posiciones[coor[0] - i][coor[1] + i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] - i,coor[1] + i));
                }else{
                    break;
                }
            }
        }for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] - i, coor[1])){
                if(tablero.posiciones[coor[0] - i][coor[1]]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] - i,coor[1]));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0] + i, coor[1])){
                if(tablero.posiciones[coor[0] + i][coor[1]]== null){
                    movReina.add(new Posicion().coorToCode(coor[0] + i,coor[1]));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0], coor[1] - i)){
                if(tablero.posiciones[coor[0]][coor[1] - i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0],coor[1] - i));
                }else{
                    break;
                }
            }
        }
        for(int i = 1; i < 8;i++){
            if(dentroTablero(coor[0], coor[1] + i)){
                if(tablero.posiciones[coor[0]][coor[1] + i]== null){
                    movReina.add(new Posicion().coorToCode(coor[0],coor[1] + i));
                }else{
                    break;
                }
            }
        }
        return movReina;
    }
}
