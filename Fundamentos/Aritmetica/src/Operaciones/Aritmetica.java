
package Operaciones;

public class Aritmetica {
    
    //Atributos
    int a;
    int b;
    
    //Constructor
    public Aritmetica () {
        System.out.println("Ejecuntando constructor");
    }
    
    public Aritmetica (int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecuntando constructor con argumentos");
    }
    
    
    //Metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
    
}
