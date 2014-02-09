/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

      int resultado=0;
        int x = 0;
       for (int i=x; i>0; i--){
          int y=i;
          if(i==x){
              resultado=i;
              
          }   
          else { 
          resultado= resultado*y;
  
          } if (i>1){
           System.out.print(""+i+"x");
         
               }
          else {
              System.out.println(""+1+" =");
          }
           
           
           
           
       }
           
           System.out.println("el producto es"+ " " +resultado);
        
    }
   }