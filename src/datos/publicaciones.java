/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
/**
 *
 * @author alex
 */
@Entity
@Table(name="publicaciones")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class publicaciones implements Serializable{
    
    @Id
    @SequenceGenerator(name="secuencia_publicaciones", sequenceName="Publicaciones_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_publicaciones")    
    private Integer id;            
    
    @Column(name="tema")
    private String tema;    

    @Column(name="contenido")
    private String contenido;    
    
    @Column(name="fechapublicacion")
    private Date fechapublicacion;
    
    @Column(name="fechamodificacion")
    private Date fechamodificacion;    
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="usuarios_id")
    private usuarios usuarios_id; 
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="categorias_id")
    private categorias categorias_id;
    
    @OneToMany(mappedBy="publicaciones_id",cascade= CascadeType.ALL)
    private Set<comentarios> lusercomentarios;        

    public publicaciones() {
    }

    public publicaciones(Integer id, String tema, String contenido, Date fechapublicacion, Date fechamodificacion, usuarios usuarios_id, categorias categorias_id) {
        this.id = id;
        this.tema = tema;
        this.contenido = contenido;
        this.fechapublicacion = fechapublicacion;
        this.fechamodificacion = fechamodificacion;
        this.usuarios_id = usuarios_id;
        this.categorias_id = categorias_id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public usuarios getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(usuarios usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public categorias getCategorias_id() {
        return categorias_id;
    }

    public void setCategorias_id(categorias categorias_id) {
        this.categorias_id = categorias_id;
    }

    public Set<comentarios> getLusercomentarios() {
        return lusercomentarios;
    }

    public void setLusercomentarios(Set<comentarios> lusercomentarios) {
        this.lusercomentarios = lusercomentarios;
    }
            
}
