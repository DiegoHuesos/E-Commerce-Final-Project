
package TiendaOnlineCA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Respuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta", propOrder = {
    "newElement"
})
public class Respuesta {

    @XmlElement(required = true)
    protected String newElement;

    /**
     * Obtiene el valor de la propiedad newElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewElement() {
        return newElement;
    }

    /**
     * Define el valor de la propiedad newElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewElement(String value) {
        this.newElement = value;
    }

}
