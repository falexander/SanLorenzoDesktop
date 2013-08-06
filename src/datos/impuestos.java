/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
/**
 *
 * @author alex
 */
@Entity
@Table(name="impuestos")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class impuestos implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_impuestos",sequenceName="impuestos_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_impuestos")
    private Integer id;            
    
    @Column(name="nombre")
    private String nombre;
    
    @OneToMany(mappedBy="impuestos_id",cascade= CascadeType.ALL)
    private Set<impuestosinmuebles> limpuestos;                    
    
    @OneToMany(mappedBy="impuestos_id",cascade= CascadeType.ALL)
    private Set<montosimpuestos> lmontosimpuestos;                        

    public impuestos() {
    }

    public impuestos(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<impuestosinmuebles> getLimpuestos() {
        return limpuestos;
    }

    public void setLimpuestos(Set<impuestosinmuebles> limpuestos) {
        this.limpuestos = limpuestos;
    }

    public Set<montosimpuestos> getLmontosimpuestos() {
        return lmontosimpuestos;
    }

    public void setLmontosimpuestos(Set<montosimpuestos> lmontosimpuestos) {
        this.lmontosimpuestos = lmontosimpuestos;
    }

}
