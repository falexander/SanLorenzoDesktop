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
@Table(name="comentarios")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class comentarios implements Serializable{
    
    @Id
    @SequenceGenerator(name="secuencia_comentarios", sequenceName="Comentarios_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_comentarios")    
    private Integer id;            
    
    @Column(name="comentario")
    private String comentario;    
    
    @Column(name="fechacreacion")
    private Date fechacreacion;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="publicaciones_id")
    private publicaciones publicaciones_id;     
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="usuarios_id")
    private usuarios usuarios_id;     

    public comentarios() {
    }

    public comentarios(Integer id, String comentario, Date fechacreacion, publicaciones publicaciones_id, usuarios usuarios_id) {
        this.id = id;
        this.comentario = comentario;
        this.fechacreacion = fechacreacion;
        this.publicaciones_id = publicaciones_id;
        this.usuarios_id = usuarios_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public publicaciones getPublicaciones_id() {
        return publicaciones_id;
    }

    public void setPublicaciones_id(publicaciones publicaciones_id) {
        this.publicaciones_id = publicaciones_id;
    }

    public usuarios getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(usuarios usuarios_id) {
        this.usuarios_id = usuarios_id;
    }
                
}
