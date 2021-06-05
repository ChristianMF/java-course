package modelo;

public class Rectangulo {
    
    //Atributs
    private int base;
    private int altura;
    
    //Constructors
    public Rectangulo() {}
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getters and Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Methods
    public int getArea() {
        return this.base * this.altura;
    }
    
}
