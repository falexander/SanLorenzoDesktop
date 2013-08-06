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
@Table(name="estados")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class estados implements Serializable{
    
    @Id
    @SequenceGenerator(name="secuencia_estados",sequenceName="Estados_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_estados")    
    private Integer id;        
    
    @Column(name="estado")
    private String estado;
    
    @OneToMany(mappedBy="estados_id",cascade= CascadeType.ALL)
    private Set<usuarios> lestusuarios;    

    @OneToMany(mappedBy="estados_id",cascade= CascadeType.ALL)
    private Set<montosimpuestos> lmonimpuestos;    
    
    public estados() {
    }

    public estados(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<usuarios> getLestusuarios() {
        return lestusuarios;
    }

    public void setLestusuarios(Set<usuarios> lestusuarios) {
        this.lestusuarios = lestusuarios;
    }        

    public Set<montosimpuestos> getLmonimpuestos() {
        return lmonimpuestos;
    }

    public void setLmonimpuestos(Set<montosimpuestos> lmonimpuestos) {
        this.lmonimpuestos = lmonimpuestos;
    }
        
}
