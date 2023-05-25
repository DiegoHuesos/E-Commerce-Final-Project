/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetodeservicio;
/**
 *
 * @author RGAMBOAH
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import example.hello.Hello;
import solicita_servicio.ISolicitaServicio;

public class ObjetodeServicio implements solicita_servicio.ISolicitaServicio
{
    long quienSoy;
    int a,b,c;
    
    @Override
    public void prepara(long quienSoy, String host) 
    {
      this.quienSoy = quienSoy; 
      try 
      {
          registry = LocateRegistry.getRegistry(host);
          stub = (Hello) registry.lookup("Hello");
             
          System.out.println("Objeto de Servicio:" + this.quienSoy );
      }
      catch (Exception e)
      {
          System.err.println("Objeto de servicio.prepara: No se instanció el proxy del servicio Hello");
          e.printStackTrace();
      }
    }

    @Override
    public void solicitaServicio(int vez) 
    {
        try
        {
          a = (int)(1000.0 * (-1 + 2.0 * Math.random()));
          b = (int)(1000.0 * (-1 + 2.0 * Math.random()));
          c = stub.suma(a,b);
          System.out.println("Objeto De Servicio:" + this.quienSoy + " vez:" + vez +
                                  " La suma de " + a + " y " + b + " es " + c);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }          
    }

    @Override
    public void cierra() {}

    private static Boolean esPrimo(int n) {
        ws_181335.WS181335_Service service = new ws_181335.WS181335_Service();
        ws_181335.WS181335 port = service.getWS181335Port();
        return port.esPrimo(n);
    }

    
}
