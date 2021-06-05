package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        
//        indicarDiaDeLaSemana(Dias.DOMINGO);

        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. de Paises en el Continente no. 1: " + Continentes.AFRICA.getPaises());
        
    }
    
    private static void indicarDiaDeLaSemana(Dias dias) {
        
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercero dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuerto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
                
    
    }
    
}
