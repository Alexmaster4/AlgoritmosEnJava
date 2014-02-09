/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

    public static void main(String[] args){
        int x=15;
      
    x= Integer.parseInt(args[0].toString());
    
    for (int i=0; i<=x; i++){
        int y=0;
        y=i;
        System.out.println("el valor actual es:"+i);    
    }
    
    }
 
}