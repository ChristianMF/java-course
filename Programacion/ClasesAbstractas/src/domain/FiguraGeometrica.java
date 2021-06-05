package domain;

public abstract class FiguraGeometrica {
    
    //Atributs
    protected String tipoFigura;
    
    //Constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Methods
    public abstract void dibujar();
    
    //Getters and Setters;
    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{tipoFigura=").append(this.tipoFigura);
        sb.append('}');
        return sb.toString();
    }
    
    
}
