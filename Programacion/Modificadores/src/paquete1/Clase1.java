package paquete1;

 class Clase1 {
    
    //Atributs
    private String atributoPrivate = "Valor atributo private";

    //Constructor
    private Clase1() {
        System.out.println("Constructor private");
    }
    
    public Clase1(String arg) {
        this();
        System.out.println("Constructor publico");
    }
    
    //Methods
    private void metodoPrivate() {
        System.out.println("Metodo private");
    }

    //Getters and Setters
    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
}
