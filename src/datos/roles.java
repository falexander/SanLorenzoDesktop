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
@Table(name="roles")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class roles implements Serializable{
    
    @Id
    @SequenceGenerator(name="secuencia_roles",sequenceName="Roles_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_roles")
    private Integer id;    
    
    @Column(name="rol")
    private String rol;

    public roles() {
    }

    public roles(int id, String rol) {    
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
                
}
