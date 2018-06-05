
package bibliotecapersonal;

public class Autor {
  
    private String nombre;
    private String pais;
    
    
    //constructor
    

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        String autor="Autor{" + 
                "nombre=" + nombre + 
                ", pais=" + pais + '}';
        return  autor;
    }
    
    
    
    
}
