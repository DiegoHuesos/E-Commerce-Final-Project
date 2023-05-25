
package wsentregas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para envio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="envio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diasaentrega" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idfactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombrepaqueteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envio", propOrder = {
    "diasaentrega",
    "id",
    "idfactura",
    "nombrepaqueteria"
})
public class Envio {

    protected Integer diasaentrega;
    protected Integer id;
    protected Integer idfactura;
    protected String nombrepaqueteria;

    /**
     * Obtiene el valor de la propiedad diasaentrega.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasaentrega() {
        return diasaentrega;
    }

    /**
     * Define el valor de la propiedad diasaentrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasaentrega(Integer value) {
        this.diasaentrega = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idfactura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdfactura() {
        return idfactura;
    }

    /**
     * Define el valor de la propiedad idfactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdfactura(Integer value) {
        this.idfactura = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrepaqueteria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepaqueteria() {
        return nombrepaqueteria;
    }

    /**
     * Define el valor de la propiedad nombrepaqueteria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepaqueteria(String value) {
        this.nombrepaqueteria = value;
    }

}
