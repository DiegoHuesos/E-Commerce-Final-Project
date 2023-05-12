/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sdist
 */
@Entity
@Table(name = "ENVIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envio.findAll", query = "SELECT e FROM Envio e")
    , @NamedQuery(name = "Envio.findById", query = "SELECT e FROM Envio e WHERE e.id = :id")
    , @NamedQuery(name = "Envio.findByIdfactura", query = "SELECT e FROM Envio e WHERE e.idfactura = :idfactura")
    , @NamedQuery(name = "Envio.findByNombrepaqueteria", query = "SELECT e FROM Envio e WHERE e.nombrepaqueteria = :nombrepaqueteria")
    , @NamedQuery(name = "Envio.findByDiasaentrega", query = "SELECT e FROM Envio e WHERE e.diasaentrega = :diasaentrega")})
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDFACTURA")
    private Integer idfactura;
    @Size(max = 32)
    @Column(name = "NOMBREPAQUETERIA")
    private String nombrepaqueteria;
    @Column(name = "DIASAENTREGA")
    private Integer diasaentrega;

    public Envio() {
    }

    public Envio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getNombrepaqueteria() {
        return nombrepaqueteria;
    }

    public void setNombrepaqueteria(String nombrepaqueteria) {
        this.nombrepaqueteria = nombrepaqueteria;
    }

    public Integer getDiasaentrega() {
        return diasaentrega;
    }

    public void setDiasaentrega(Integer diasaentrega) {
        this.diasaentrega = diasaentrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Envio[ id=" + id + " ]";
    }
    
}
