package com.company;
import java.util.LinkedList;

public class Pieza {
    private char ident;
    private String color;

    public char getIdent() {
        return ident;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIdent(char ident) {
        this.ident = ident;
    }

    LinkedList<String> movimientos(String posicion, Tablero tablero){
        LinkedList<String> lista =  new LinkedList<String>();
        return lista;
    };
    public boolean dentroTablero(int i, int j){
        if(i < 8 && j < 8 && i >= 0 && j >= 0 ){
            return true;
        }else {
            return false;
        }
    }
}
