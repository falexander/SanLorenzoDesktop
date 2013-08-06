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
@Table(name="zonas")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class zonas implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_zonas",sequenceName="zonas_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_zonas")
    private Integer id;            
    
    @Column(name="zona")
    private String zona;                
    
    @OneToMany(mappedBy="zona_id",cascade= CascadeType.ALL)
    private Set<inmuebles> lzonasinmuebles;        

    public zonas() {
    }

    public zonas(Integer id, String zona, Set<inmuebles> lzonasinmuebles) {
        this.id = id;
        this.zona = zona;
        this.lzonasinmuebles = lzonasinmuebles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Set<inmuebles> getLzonasinmuebles() {
        return lzonasinmuebles;
    }

    public void setLzonasinmuebles(Set<inmuebles> lzonasinmuebles) {
        this.lzonasinmuebles = lzonasinmuebles;
    }               
    
}
