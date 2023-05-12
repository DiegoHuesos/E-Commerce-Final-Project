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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LISTALIBROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listalibros.findAll", query = "SELECT l FROM Listalibros l")
    , @NamedQuery(name = "Listalibros.findById", query = "SELECT l FROM Listalibros l WHERE l.id = :id")
    , @NamedQuery(name = "Listalibros.findByIsbn", query = "SELECT l FROM Listalibros l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Listalibros.findByCantidad", query = "SELECT l FROM Listalibros l WHERE l.cantidad = :cantidad")})
public class Listalibros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 32)
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumn(name = "FACTURA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Factura facturaId;

    public Listalibros() {
    }

    public Listalibros(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
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
        if (!(object instanceof Listalibros)) {
            return false;
        }
        Listalibros other = (Listalibros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Listalibros[ id=" + id + " ]";
    }
    
}
