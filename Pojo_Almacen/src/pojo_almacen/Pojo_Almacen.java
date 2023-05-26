/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo_almacen;
import interfazsolicitante.ISolicitaServicio;

/**
 *
 * @author sdist
 */
public class Pojo_Almacen implements ISolicitaServicio{

    long quienSoy;
    String host;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pojo_Almacen objServ = new Pojo_Almacen();
        
        objServ.prepara(25, null);
        int n_veces = args.length > 0 ? Integer.parseInt(args[0]):5;
        for( int vez = 1; vez <= n_veces; vez++)
            objServ.solicitaServicio(vez);
        objServ.cierra();
    } 

    private static int getCantidad(java.lang.String isbn) {
        wsalmacen.WSAlmacen_Service service = new wsalmacen.WSAlmacen_Service();
        wsalmacen.WSAlmacen port = service.getWSAlmacenPort();
        return port.getCantidad(isbn);
    }

    private static int restarLibros(java.lang.String isbn, int cantidad) {
        wsalmacen.WSAlmacen_Service service = new wsalmacen.WSAlmacen_Service();
        wsalmacen.WSAlmacen port = service.getWSAlmacenPort();
        return port.restarLibros(isbn, cantidad);
    }

    @Override
    public void prepara(long quienSoy, String host) {
        this.quienSoy = quienSoy;
        this.host     = host;
    }

    @Override
    public void solicitaServicio(int vez) {
        String isbn="a234567898765";
        int n=5;
        int res;
        int cant;
        
//        // Prueba getCantidad
//        System.out.println("Probamos con Libro con ISBN: " + isbn + ".");
//        cant = getCantidad(isbn);
//        System.out.println("Ejecutamos getCantidad: " + cant);
        
        // Prueba restarLibros
        System.out.println("Probamos con Libro con ISBN: " + isbn + ".");
        System.out.println("Vamos a ordenar " + n + " ejemplares.");
        cant = restarLibros(isbn,5);
        System.out.println(cant);
        
                
//        System.out.println("Probamos con Libro con ISBN: " + isbn + ".");
//        System.out.println("Vamos a ordenar " + n + " ejemplares.");
//        cant = getCantidad(isbn);
//        System.out.println("Ejecutamos getCantidad: " + cant);
//        
//        if( cant == -1){
//            System.out.println("El libro no existe en la base de datos.");
//        }
//        else if(n <= cant) {
//            System.out.println("\nHacemos una orden de " + n + " libros. \n");
//            res = restarLibros(isbn,n);
//            
//            cant = getCantidad(isbn);
//            System.out.println("Ejecutamos getCantidad:" + cant);
//
//            System.out.println("Se restarán " + n + " libros de id " + isbn);
//            res=restarLibros(isbn,n);
//        } else if (n > cant) {
//            System.out.println("No hay suficiente stock disponible");
//        }
    }

    @Override
    public void cierra() {
    }
}
