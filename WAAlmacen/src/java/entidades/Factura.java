/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sdist
 */
@Entity
@Table(name = "FACTURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findById", query = "SELECT f FROM Factura f WHERE f.id = :id")
    , @NamedQuery(name = "Factura.findByMontototal", query = "SELECT f FROM Factura f WHERE f.montototal = :montototal")
    , @NamedQuery(name = "Factura.findByFecha", query = "SELECT f FROM Factura f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "Factura.findByNumtarjeta", query = "SELECT f FROM Factura f WHERE f.numtarjeta = :numtarjeta")
    , @NamedQuery(name = "Factura.findByMesessinintereses", query = "SELECT f FROM Factura f WHERE f.mesessinintereses = :mesessinintereses")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTOTOTAL")
    private BigDecimal montototal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 32)
    @Column(name = "NUMTARJETA")
    private String numtarjeta;
    @Column(name = "MESESSININTERESES")
    private Integer mesessinintereses;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaId")
    private List<Listalibros> listalibrosList;

    public Factura() {
    }

    public Factura(Integer id) {
        this.id = id;
    }

    public Factura(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMontototal() {
        return montototal;
    }

    public void setMontototal(BigDecimal montototal) {
        this.montototal = montototal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public Integer getMesessinintereses() {
        return mesessinintereses;
    }

    public void setMesessinintereses(Integer mesessinintereses) {
        this.mesessinintereses = mesessinintereses;
    }

    @XmlTransient
    public List<Listalibros> getListalibrosList() {
        return listalibrosList;
    }

    public void setListalibrosList(List<Listalibros> listalibrosList) {
        this.listalibrosList = listalibrosList;
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
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Factura[ id=" + id + " ]";
    }
    
}
