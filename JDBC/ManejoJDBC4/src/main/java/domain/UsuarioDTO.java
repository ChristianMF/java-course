package domain;

public class UsuarioDTO {
    
    //Atributs
    private int idUsuario;
    private String usuario;
    private String password;
    
    //Constructors
    public UsuarioDTO() {}

    public UsuarioDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public UsuarioDTO(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public UsuarioDTO(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    //Getters and Setters
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{idUsuario=").append(this.idUsuario);
        sb.append(", usuario=").append(this.usuario);
        sb.append(", password=").append(this.password);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
