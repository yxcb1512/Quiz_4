/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_4;

/**
 *
 * @author yeire
 */
public class Quiz_4 {
    
    public void prueba (int v1, int v2){
        
        //realizaremos primeramente una suma de dos valores, luego mi compañera hará 
        //que sea una multiplicacion y lo imprima y por ultimo haré que sea una divicion 
        //y que lo imprima acompañado de un mensaje
       
        //SUMA
        int suma = v1+v2;
        
        System.out.println(suma);

        //MULTIPLICACION
        int multiplicacion = v1 * v2;
        
        System.out.println("La multiplicación es: " + multiplicacion);

        //DIVISION
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("El resultado de la división es: " + division + 
                               "operación completada");
        } else {
            System.out.println("No se puede dividir entre 0 ");
        }
        
    }
    
public static void main(String[]arv){
    
    Quiz_4 q = new Quiz_4();
    
    q.prueba(7,4);
}
}

   
