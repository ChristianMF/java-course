package beans;

public class Rectangulo {
    
    //Atributs
    private int base;
    private int altura;
    
    //Getters and Seters
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getBase() {
        return this.base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getArea() {
        return this.altura * this.base; 
    }
    
}
