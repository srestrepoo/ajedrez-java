package com.company;

public class Posicion {

    public String coorToCode(int i, int j){
        return (char)(j + 65) + Integer.toString(invertirEjeY(i) + 1);
    }

    public int[] codeToCoor(String code){
        int[] posicion = new int[2];
        int posInv = Integer.parseInt(code.substring(1));
        posicion[0] = invertirEjeY(posInv - 1);
        posicion[1] = code.charAt(0) - 65;
        return posicion;
    }

    public int invertirEjeY(int num){
        int result;
        switch (num){
            case 0:
                result = 7;
                return result;
            case 1:
                result = 6;
                return result;
            case 2:
                result = 5;
                return result;
            case 3:
                result = 4;
                return result;
            case 4:
                result = 3;
                return result;
            case 5:
                result = 2;
                return result;
            case 6:
                result = 1;
                return result;
            case 7:
                result = 0;
                return result;
            default:
                return 8;
        }
    }
}
