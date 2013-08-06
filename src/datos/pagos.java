/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
/**
 *
 * @author alex
 */
@Entity
@Table(name="pagos")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class pagos implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_pagos",sequenceName="pagos_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_pagos")
    private Integer id;            
    
    @Column(name="fechapago")
    private Date fechapago;    
    
    @Column(name="norecibo")
    private String norecibo;                    
    
    @Column(name="mespagado")
    private String mespagado;                        
    
    @Column(name="monto")
    private double monto;                            
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="inmuebles_id")
    private inmuebles inmuebles_id;                     

    public pagos() {
    }

    public pagos(Integer id, Date fechapago, String norecibo, String mespagado, double monto, inmuebles inmuebles_id) {
        this.id = id;
        this.fechapago = fechapago;
        this.norecibo = norecibo;
        this.mespagado = mespagado;
        this.monto = monto;
        this.inmuebles_id = inmuebles_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getNorecibo() {
        return norecibo;
    }

    public void setNorecibo(String norecibo) {
        this.norecibo = norecibo;
    }

    public String getMespagado() {
        return mespagado;
    }

    public void setMespagado(String mespagado) {
        this.mespagado = mespagado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public inmuebles getInmuebles_id() {
        return inmuebles_id;
    }

    public void setInmuebles_id(inmuebles inmuebles_id) {
        this.inmuebles_id = inmuebles_id;
    }            
    
}
