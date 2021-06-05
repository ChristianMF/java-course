
package test;

import domain.Persona;

public class TestMatrices {
    
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 3;
        edades[1][1] = 9;
        edades[2][0] = 0;
        edades[2][1] = 8;
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
               System.out.println("Elementos = " + i + "," + j + ": " + edades[i][j]); 
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
        
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("Elementos = " + i + "," + j + ": " + frutas[i][j]); 
            }
        }
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Carla");
        personas[0][2] = new Persona("Chumel");
        personas[1][0] = new Persona("José");
        personas[1][1] = new Persona("Carnal");
        personas[1][2] = new Persona("Yoyis");
        
        imprimir(personas);
        
    }
    
    public static void imprimir(Object matiz[][]) {
        for (int i = 0; i < matiz.length; i++) {
            for (int j = 0; j < matiz[i].length; j++) {
               System.out.println("Elementos = " + i + "," + j + ": " + matiz[i][j]); 
            }
        }
    }
    
}
