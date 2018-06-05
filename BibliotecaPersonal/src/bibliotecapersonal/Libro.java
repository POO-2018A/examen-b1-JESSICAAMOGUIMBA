
package bibliotecapersonal;

import java.util.Objects;


public class Libro {
 
    private String titulo;
    private String autor;
    private int Anio;
    private boolean favorito;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        String libro ="Libro{" + "titulo=" + titulo +
                ", autor=" + autor + 
                ", Anio=" + Anio + 
                ", favorito=" + favorito + '}';
        return libro;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.favorito != other.favorito) {
            return false;
        }
        return true;
    }


    
    
}
