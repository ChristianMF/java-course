package test;

import java.util.*;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
        
        imprimir(miLista);

//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        
        Set<String> miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimir(miSet);

        Map<String,String> miMapa = new HashMap();
        
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Carla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos"); //Se sustituye el valor de la llave 3
        
        String elemento = miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
}
