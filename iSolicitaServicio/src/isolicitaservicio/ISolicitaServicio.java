/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isolicitaservicio;

/**
 *
 * @author RGAMBOAH
 */
public interface ISolicitaServicio 
{
    public void prepara( long quienSoy, String host);
    public void solicitaServicio(int vez);
    public void cierra();    
}
