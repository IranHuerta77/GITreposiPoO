package Paquete;

public class LIBRO {
    String Titulo;
    String Autor;
    String Color;
    String TipoLetra;
    String DificultadLectura;

    public LIBRO() {
        Titulo = Titulo;
    }

    public LIBRO(String titulo, String autor, String color, String tipoLetra, String dificultadLectura) {
        Titulo = titulo;
        Autor = autor;
        Color = color;
        TipoLetra = tipoLetra;
        DificultadLectura = dificultadLectura;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setTipoLetra(String tipoLetra) {
        TipoLetra = tipoLetra;
    }

    public void setDificultadLectura(String dificultadLectura) {
        DificultadLectura = dificultadLectura;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getColor() {
        return Color;
    }

    public String getTipoLetra() {
        return TipoLetra;
    }

    public String getDificultadLectura() {
        return DificultadLectura;
    }

    //Metodo info
    public void mostrarInfo(){
        System.out.println("La información del libro es: ");
        System.out.println("El titulo es: " + getTitulo());
        System.out.println("El autor es: " + getAutor());
        System.out.println("El color es: " + getColor());
        System.out.println("El tipo de letra es: " + getTipoLetra());
        System.out.println("La dificultad de lectura es: " + getDificultadLectura());
    }

}
