/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo_entregas;

import interfazsolicitante.ISolicitaServicio;

/**
 *
 * @author sdist
 */
public class Pojo_Entregas implements ISolicitaServicio{

    long quienSoy;
    String host;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pojo_Entregas objServ = new Pojo_Entregas();
        
        objServ.prepara(25, null);
        int n_veces = args.length > 0 ? Integer.parseInt(args[0]):5;
        for( int vez = 1; vez <= n_veces; vez++)
            objServ.solicitaServicio(vez);
        objServ.cierra();
    }

    private static String crearEnvio(int idFactura) {
        wsentregas.WSEntregas_Service service = new wsentregas.WSEntregas_Service();
        wsentregas.WSEntregas port = service.getWSEntregasPort();
        return port.crearEnvio(idFactura);
    }

    @Override
    public void prepara(long quienSoy, String host) {
       this.quienSoy = quienSoy;
       this.host     = host;
    }

    @Override
    public void solicitaServicio(int i) {
        
        int idFactura = 1;
        String rest;
                
        System.out.println("Generamos entrega de factura con ID: " + idFactura + ".");
        rest = crearEnvio(idFactura);
        
//        if(rest.equals("YAESTA")) {
//            System.out.println("La entrega de esta factura ya existe en la tabla.");
//        } else if (rest.equals("NOEXISTE")) {
//            System.out.println("El id de factura no existe.");
//        } else {
//            System.out.println(rest);
//        }
    }

    @Override
    public void cierra() {
    }
    
}
