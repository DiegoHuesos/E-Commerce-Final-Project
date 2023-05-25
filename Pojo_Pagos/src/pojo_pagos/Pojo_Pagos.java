/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo_pagos;

import isolicitaservicio.ISolicitaServicio;


/**
 *
 * @author sdist
 */
public class Pojo_Pagos  implements ISolicitaServicio{

    long quienSoy;
    String host;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pojo_Pagos objServ = new Pojo_Pagos();
        
        objServ.prepara(25, null);
        int n_veces = args.length > 0 ? Integer.parseInt(args[0]):5;
        for( int vez = 1; vez <= n_veces; vez++)
            objServ.solicitaServicio(vez);
        objServ.cierra();
        
    }
    
    private static void probarValidarUsuario(String numTarjeta) {
        int idUsuario = validarUsuario(numTarjeta);
        
        System.out.print("Para el numero de tarjeta '" + numTarjeta + "': ");
        if (idUsuario < 0) {
            System.out.println("Error - no existe usuario con esa tarjeta"); 
        } else {
            System.out.println("Exito! - el id del usuario es " + idUsuario);
        }
    }
    
    private static void probarCheckMonto(double monto, String numTarjeta) {
        int status = checkMonto(monto, numTarjeta);
        
        System.out.print("Para el numero de tarjeta '" + numTarjeta + "' y el monto '" + monto + "': ");
        if (status == -1) {
            System.out.println("Error - el monto excede el saldo");
        } else {
            System.out.println("Exito! - el saldo es suficiente para el monto");
        }
    }
    
    private static void probarCrearFactura(String numTarjeta) {
        int idFactura = crearFactura(numTarjeta);
        
        System.out.print("Para el numero de tarjeta '" + numTarjeta + "': ");
        System.out.println("Exito! - Se creó la factura y se le asignó el id " + idFactura);
    }
    
    private static void probarRestarSaldo(double monto, String numTarjeta) {
        int status = restarSaldo(monto, numTarjeta);
        
        System.out.print("Para el numero de tarjeta '" + numTarjeta + "' y el monto '" + monto + "': ");
        if (status == -1) {
            System.out.println("Error - el monto excede el saldo");
        } else {
            System.out.println("Exito! - el saldo es suficiente para el monto y restamos el monto");
        }
    }
    
    private static void probarVincularLibro(int idFactura, int cantidad, String isbn) {
        boolean exito = vincularLibro(idFactura, cantidad, isbn);
        
        System.out.print("Para el idFactura '" + idFactura + "', la cantidad '" + cantidad + "' y el isbn '" + isbn + "': ");
        if (exito) {
            System.out.println("Exito! - se logró vincular el libro");
        } else {
            System.out.println("Error - idFactura o isbn no existe");
        }
    }
    
    private static Integer validarUsuario(java.lang.String numTarjeta) {
        pojo_pagos.WSPagos_Service service = new pojo_pagos.WSPagos_Service();
        pojo_pagos.WSPagos port = service.getWSPagosPort();
        return port.validarUsuario(numTarjeta);
    }

    private static Integer checkMonto(double monto, java.lang.String numTarjeta) {
        pojo_pagos.WSPagos_Service service = new pojo_pagos.WSPagos_Service();
        pojo_pagos.WSPagos port = service.getWSPagosPort();
        return port.checkMonto(monto, numTarjeta);
    }

    private static Integer crearFactura(java.lang.String numTarjeta) {
        pojo_pagos.WSPagos_Service service = new pojo_pagos.WSPagos_Service();
        pojo_pagos.WSPagos port = service.getWSPagosPort();
        return port.crearFactura(numTarjeta);
    }

    private static int restarSaldo(java.lang.Double monto, java.lang.String numTarjeta) {
        pojo_pagos.WSPagos_Service service = new pojo_pagos.WSPagos_Service();
        pojo_pagos.WSPagos port = service.getWSPagosPort();
        return port.restarSaldo(monto, numTarjeta);
    }

    private static Boolean vincularLibro(int idFactura, int cantidad, java.lang.String isbn) {
        pojo_pagos.WSPagos_Service service = new pojo_pagos.WSPagos_Service();
        pojo_pagos.WSPagos port = service.getWSPagosPort();
        return port.vincularLibro(idFactura, cantidad, isbn);
    }

    @Override
    public void prepara(long quienSoy, String string) {
       this.quienSoy = quienSoy;
       this.host     = host;
    }

    @Override
    public void solicitaServicio(int i) {
        String numTarjetaValida = "12345";
        String numTarjetaInvalida = "tarjetaInvalida";
        double montoChico = 1.0;
        double montoGrande = 9999999.0;
        String isbnValido = "a234567898765";
        String isbnInvalido = "isbnInvalido";
        int idFacturaValido = 1;
        int idFacturaInvalido = -1;
        int cantidad = 3;
        
        
        // Prueba vincularLibro()
        
        // Prueba crearFactura()
//        System.out.println("Probamos crearFactura");
//        probarCrearFactura(numTarjetaValida);
        
        
//        System.out.println("Probamos validarUsuario");
//        probarValidarUsuario(numTarjetaValida);
//        probarValidarUsuario(numTarjetaInvalida);
//        
//        System.out.println("Probamos checkMonto");
//        probarCheckMonto(montoChico, numTarjetaValida);
//        probarCheckMonto(montoGrande, numTarjetaValida);
//        
//        System.out.println("Probamos cearFactura");
//        probarCrearFactura(numTarjetaValida);
//
//        
//        System.out.println("Probamos restarSaldo");
//        probarRestarSaldo(montoChico, numTarjetaValida);
//        probarRestarSaldo(montoGrande, numTarjetaValida); 
//        
//        System.out.println("Probamos vincularLibro");
//        probarVincularLibro(idFacturaValido, cantidad, isbnValido);
//        probarVincularLibro(idFacturaInvalido, cantidad, isbnInvalido);
    }

    @Override
    public void cierra() {
    }
    
}
