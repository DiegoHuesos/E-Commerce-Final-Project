/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsalmacen;

/**
 *
 * @author sdist
 */
public class Pedido {
    public String isbn;
    public int cantidad;

    public Pedido(){
        this.isbn = null;
        this.cantidad = 0;
    }

    public Pedido(String isbn, int cantidad){
        this.isbn = isbn;
        this.cantidad = cantidad;
    }
}
