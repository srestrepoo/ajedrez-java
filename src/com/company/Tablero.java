package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class Tablero {
    Pieza[][] posiciones = new Pieza[8][8];
    public Tablero(){
        /**
        for(int i = 0; i < 8; i++){
            this.posiciones[6][i] = new Peon("BLANCO");
        }
         **/
        this.posiciones[7][0] = new Torre("BLANCO");
        this.posiciones[7][7] = new Torre("BLANCO");
        this.posiciones[7][1] = new Caballo("BLANCO");
        this.posiciones[7][6] = new Caballo("BLANCO");
        this.posiciones[7][5] = new Alfil("BLANCO");
        this.posiciones[7][2] = new Alfil("BLANCO");
        this.posiciones[7][3] = new Reina("BLANCO");
        this.posiciones[7][4] = new Rey("BLANCO");

        for(int i = 0; i < 8; i++) {
            this.posiciones[1][i] = new Peon("NEGRO");
        }
        this.posiciones[0][0] = new Torre("NEGRO");
        this.posiciones[0][7] = new Torre("NEGRO");
        this.posiciones[0][1] = new Caballo("NEGRO");
        this.posiciones[0][6] = new Caballo("NEGRO");
        this.posiciones[0][5] = new Alfil("NEGRO");
        this.posiciones[0][2] = new Alfil("NEGRO");
        this.posiciones[0][3] = new Reina("NEGRO");
        this.posiciones[0][4] = new Rey("NEGRO");

    }
    public void imprimirTablero(){
        for(int i = 0; i < 8;i++){
            for(int j = 0; j <8; j++){
                if(this.posiciones[i][j] != null){
                    System.out.print(this.posiciones[i][j].getIdent() + " ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    public HashMap<String, LinkedList<String>> movimientosPosibles(String color){
        HashMap<String, LinkedList<String>> moves = new  HashMap<String, LinkedList<String>>();
        String posicion;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(this.posiciones[i][j] != null){
                    if(this.posiciones[i][j].getColor().compareTo(color) == 0){
                        posicion = new Posicion().coorToCode(i,j);
                        moves.put(posicion, this.posiciones[i][j].movimientos(posicion,this));
                    }
                }
            }
        }
        return moves;
    }

    public void mover(String color, String origen, String destino){
        HashMap<String, LinkedList<String>> moves = this.movimientosPosibles(color);
        if(moves.containsKey(origen)){
            LinkedList<String> movesByPiece = moves.get(origen);
            if(movesByPiece.contains(destino)){
                int coorOrigen[] = new Posicion().codeToCoor(origen);
                int coorDestino[] = new Posicion().codeToCoor(destino);
                this.posiciones[coorDestino[0]][coorDestino[1]] = this.posiciones[coorOrigen[0]][coorOrigen[1]];
                this.posiciones[coorOrigen[0]][coorOrigen[1]] = null;
            }
        }
    }
}
