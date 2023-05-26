/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojotiendaonline;

import TiendaOnlineCA.Respuesta;
import java.util.ArrayList;
import java.util.Random;
import solicita_servicio.ISolicitaServicio;

/**
 *
 * @author sdist
 */
public class PojoTiendaOnline implements ISolicitaServicio {
    
    private ArrayList<String> isbns, tarjetas;
    private TiendaOnlineCA.PedidoInput part1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaOnlineCA.PedidoInput part1 = new TiendaOnlineCA.PedidoInput();
        part1.setNumTarjeta("12345");
        
        TiendaOnlineCA.Pedido p = new TiendaOnlineCA.Pedido();
        p.setIsbn("a234567898765");
        p.setCantidad(1);
        part1.getPedidos().add(p);
        
        p.setIsbn("c234567298765");
        p.setCantidad(1);
        part1.getPedidos().add(p);
        
        Respuesta r = pedidoLibrosOperation(part1);
        System.out.println(r.getNewElement());
    }

    private static Respuesta pedidoLibrosOperation(TiendaOnlineCA.PedidoInput part1) {
        TiendaOnlineCA.TiendaOnline4Service1 service = new TiendaOnlineCA.TiendaOnline4Service1();
        TiendaOnlineCA.PedidoLibrosPortType port = service.getCasaPort1();
        return port.pedidoLibrosOperation(part1);
    }

    @Override
    public void prepara(long l, String string) {
        isbns = new ArrayList<>();
        isbns.add("a234567898765");
        isbns.add("b234567898365");
        isbns.add("c234567298765");
        isbns.add("d234167898765");
        isbns.add("e234167898765");
        
        tarjetas = new ArrayList<>();
        tarjetas.add("12345");
        tarjetas.add("12245");
        part1 = new TiendaOnlineCA.PedidoInput();
    }

    @Override
    public void solicitaServicio(int i) {
        int cantLibros = 1+ (int)(100*Math.random());
        part1.setNumTarjeta(tarjetas.get((int)((tarjetas.size()-1)*Math.random())));
        for(int j = 0; j < cantLibros; ++j){
            TiendaOnlineCA.Pedido p = new TiendaOnlineCA.Pedido();
            p.setIsbn(isbns.get( (int)((isbns.size()-1)*Math.random())) );
            p.setCantidad((int)(5*Math.random()));
            part1.getPedidos().add(p);
        }
        System.out.println("Request "+i+" "+pedidoLibrosOperation(part1).getNewElement());
    }

    @Override
    public void cierra() {
     
    }
    
}
