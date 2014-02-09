/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

       public static void main(String[] args){
        int x=0;
        int y=0;
      x= Integer.parseInt(args[0].toString());
      y= Integer.parseInt(args[1].toString());

    if (x<y){
    for(int i = x; i<=y;i++){
        int z=i;
        System.out.print(""+z+","+" ");
        
    }
    }
    else if (y<x){
        for(int i = y; i<=x;i++){
        int z=i;
        System.out.print(""+z+","+" ");
    }
    
    }
    
}
}