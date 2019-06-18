/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer =  new Scanner(System.in);
        
        int notas;
        int suma = 0;
        int prom = 0; 
        System.out.print("Digite la cantidad de notas:");
        notas = leer.nextInt();

        for(int i=1; i<= notas; i++){
            System.out.println("ingrese la nota"+" "+i+" "+"de"+" "+notas+":");
            int nota = leer.nextInt();  
            suma = suma + nota;
        }
            prom= suma /notas;
            System.out.println("El promedio de las notas es:"+prom );
            
                    
                    
    }
}
