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
@Table(name="usuarios")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class usuarios implements Serializable{

    @Id
    @SequenceGenerator(name="secuencia_usuario",sequenceName="Usuarios_Id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial", unique=true, nullable=false, precision=22, scale=0)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_usuario")
    private Integer id;    
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private roles roles_id;    
    
    @OneToOne(cascade= CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private estados estados_id;    
    
    @Column(name="nombres")
    private String nombres;    
    
    @Column(name="apellidos")
    private String apellidos;        

    @Column(name="alias")
    private String alias;        
    
    @Column(name="password")
    private String password;            
    
    @Column(name="email")
    private String email;            
    
    @Column(name="telefonofijo")
    private String telefonofijo;                
    
    @Column(name="telefonocelular")
    private String telefonocelular;                    
    
    @Column(name="direccion")
    private String direccion;                        

    public usuarios() {
    }

    public usuarios(int id, int roles_id, int estados_id, String nombres, String apellidos, String alias, String password, String email, String telefonofijo, String telefonocelular, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.alias = alias;
        this.password = password;
        this.email = email;
        this.telefonofijo = telefonofijo;
        this.telefonocelular = telefonocelular;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public roles getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(roles roles_id) {
        this.roles_id = roles_id;
    }

    public estados getEstados_id() {
        return estados_id;
    }

    public void setEstados_id(estados estados_id) {
        this.estados_id = estados_id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonofijo() {
        return telefonofijo;
    }

    public void setTelefonofijo(String telefonofijo) {
        this.telefonofijo = telefonofijo;
    }

    public String getTelefonocelular() {
        return telefonocelular;
    }

    public void setTelefonocelular(String telefonocelular) {
        this.telefonocelular = telefonocelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
                    
}
