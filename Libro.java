
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, 
        boolean esLibroDeTextoONo)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esLibroDeTextoONo;
    }
    
    public String getAutor () {
        return autor;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public void imprimeAutor(){
        System.out.println(autor + " es el autor de este libro. ");
    }
    
    public void imprimeTitulo(){
        System.out.println(titulo + " es el título de este libro. ");
    }
    
    public int getNumeroDePaginas(){
        return numeroPaginas;
    }
    
    public void imprimeDetalles(){
        String libText;
        if (numeroReferencia.length() < 3  ){
            numeroReferencia = " zzz ";  
        }
        if (esLibroDeTexto == true){
            libText = " Es un libro de texto. ";
        }
        else{
            libText = " No es un libro de texto. ";
        }
        System.out.println( " El titulo del libro seleccionado es " + titulo + ". "       +"\n"+ 
                            " El autor del libro seleccionado es " + autor + ". "          +"\n"+ 
                            " El libro seleccionado tiene " + numeroPaginas + " páginas. "  +"\n"+
                            " El numero de referencia de este libro es " + numeroReferencia + ". "+"\n"+
                            " El libro ha sido prestado "+vecesPrestado+ " veces . "+"\n"+
                             libText);
    }
    
    public String getDetalles(){
        String varDetalles;
        String libText;
        if (numeroReferencia.length() < 3  ){
            numeroReferencia = " zzz ";
        }
        if (esLibroDeTexto == true){
            libText = " Es un libro de texto. ";
        }
        else{
            libText = " No es un libro de texto. ";
        }
        varDetalles =   " El titulo del libro seleccionado es " + titulo + 
                        ". El autor del libro seleccionado es " + autor + 
                        ". El libro seleccionado tiene " + numeroPaginas + " páginas. " +
                        " El numero de referencia de este libro es " + numeroReferencia+ " . "+
                        " El libro ha sido prestado "+ vecesPrestado + " veces . "
                        + libText;
        return varDetalles;
    }
    
    public String getNumeroReferencia () {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String numeroDeReferencia){
        numeroReferencia = numeroDeReferencia;
        if (numeroReferencia.length() < 3){
            System.out.println ("[-]ERROR numero de referencia demasiado corto");
        }
        
    }
    
    public void prestar(){
        vecesPrestado++;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean esLibroDeTexto(){
        return esLibroDeTexto;
    }
}
