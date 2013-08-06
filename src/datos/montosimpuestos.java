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
@Table(name="montosimpuestos")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class montosimpuestos {
    
    @Id    
    @SequenceGenerator(name="secuencia_montosimpuestos",sequenceName="montosimpuestos_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_montosimpuestos")
    private Integer id;                    
    
    @Column(name="fechainicio")
    private Date fechainicio;        
    
    @Column(name="fechafin")
    private Date fechafin;        
    
    @Column(name="monto")
    private double monto;                            
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="impuestos_id")
    private impuestos impuestos_id;                             
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="estados_id")
    private estados estados_id;                                 

    public montosimpuestos() {
    }

    public montosimpuestos(Integer id, Date fechainicio, Date fechafin, double monto, impuestos impuestos_id, estados estados_id) {
        this.id = id;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.monto = monto;
        this.impuestos_id = impuestos_id;
        this.estados_id = estados_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public impuestos getImpuestos_id() {
        return impuestos_id;
    }

    public void setImpuestos_id(impuestos impuestos_id) {
        this.impuestos_id = impuestos_id;
    }

    public estados getEstados_id() {
        return estados_id;
    }

    public void setEstados_id(estados estados_id) {
        this.estados_id = estados_id;
    }    
    
}
