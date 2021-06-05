package test;

import java.util.*;

public class TestColecciones {
    
    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
//        imprimir(miLista);

//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        
        Set miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
//        imprimir(miSet);

        Map miMapa = new HashMap();
        
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Carla");
        miMapa.put("valor3", "Rosario");
        
        String elemento = (String) miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);
        
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
}
