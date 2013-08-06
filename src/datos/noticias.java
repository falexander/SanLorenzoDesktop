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
@Table(name="noticias")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class noticias implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_noticias",sequenceName="Noticias_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_noticias")
    private Integer id;        
    
    @Column(name="fechapublicacion")
    private Date fechapublicacion;
    
    @Column(name="titulo")
    private String titulo;        
    
    @Column(name="contenido")
    private String contenido;            
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="usuarios_id")
    private usuarios usuarios_id;         

    public noticias() {
    }

    public noticias(Integer id, Date fechapublicacion, String titulo, String contenido, usuarios usuarios_id) {
        this.id = id;
        this.fechapublicacion = fechapublicacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.usuarios_id = usuarios_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public usuarios getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(usuarios usuarios_id) {
        this.usuarios_id = usuarios_id;
    }        
        
}
