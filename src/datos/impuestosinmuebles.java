/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
/**
 *
 * @author alex
 */
@Entity
@Table(name="impuestosinmuebles")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class impuestosinmuebles {

    @Id    
    @SequenceGenerator(name="secuencia_impuestosinmuebles",sequenceName="impuestosinmuebles_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_impuestosinmuebles")
    private Integer id;                
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="inmuebles_id")
    private inmuebles inmuebles_id;                         
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="impuestos_id")
    private impuestos impuestos_id;                             

    public impuestosinmuebles() {
    }

    public impuestosinmuebles(Integer id, inmuebles inmuebles_id, impuestos impuestos_id) {
        this.id = id;
        this.inmuebles_id = inmuebles_id;
        this.impuestos_id = impuestos_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public inmuebles getInmuebles_id() {
        return inmuebles_id;
    }

    public void setInmuebles_id(inmuebles inmuebles_id) {
        this.inmuebles_id = inmuebles_id;
    }

    public impuestos getImpuestos_id() {
        return impuestos_id;
    }

    public void setImpuestos_id(impuestos impuestos_id) {
        this.impuestos_id = impuestos_id;
    }
           
}
