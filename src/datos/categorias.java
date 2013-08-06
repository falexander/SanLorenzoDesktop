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
@Table(name="categorias")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class categorias implements Serializable{
    
    @Id
    @SequenceGenerator(name="secuencia_categorias",sequenceName="Categorias_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_categorias")    
    private Integer id;        
    
    @Column(name="categoria")
    private String categoria;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @OneToMany(mappedBy="categorias_id",cascade= CascadeType.ALL)
    private Set<publicaciones> lcatpublicaciones;        

    public categorias() {
    }

    public categorias(Integer id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
