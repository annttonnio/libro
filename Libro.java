
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    public String getAutor () {
        return autor;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public void imprimeAutor(){
        System.out.println(autor);
    }
    
    public void imprimeTitulo(){
        System.out.println(titulo);
    }
    
    public int getNumeroDePaginas(){
        return numeroPaginas;
    }
    
    public void imprimeDetalles(){
        System.out.println(" El titulo del libro seleccionado es " + titulo);
        System.out.println(" El autor del libro seleccionado es " + autor);
        System.out.println(" El libro seleccionado tiene " + numeroPaginas + " páginas. ");
    }
    
    public String getDetalles(){
        String varDetalles;
            varDetalles = " El titulo del libro seleccionado es " + titulo + 
                        ". El autor del libro seleccionado es " + autor + 
                        ". El libro seleccionado tiene " + numeroPaginas + " páginas. ";
        return varDetalles;
    }
}
