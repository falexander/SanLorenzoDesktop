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
@Table(name="contribuyentes")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class contribuyentes implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_contribuyentes",sequenceName="contribuyentes_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_contribuyentes")
    private Integer id;        
    
    @Column(name="dui")
    private String dui;            
    
    @Column(name="nit")
    private String nit;                
    
    @Column(name="niss")
    private String niss;                
    
    @Column(name="nitjuridico")
    private String nitjuridico;                    
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private usuarios usuarios_id;

    @OneToMany(mappedBy="contribuyente_id",cascade= CascadeType.ALL)
    private Set<inmuebles> luserinmuebles;        
    
    public contribuyentes() {
    }

    public contribuyentes(Integer id, String dui, String nit, String niss, String nitjuridico, usuarios usuarios_id) {
        this.id = id;
        this.dui = dui;
        this.nit = nit;
        this.niss = niss;
        this.nitjuridico = nitjuridico;
        this.usuarios_id = usuarios_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNiss() {
        return niss;
    }

    public void setNiss(String niss) {
        this.niss = niss;
    }

    public String getNitjuridico() {
        return nitjuridico;
    }

    public void setNitjuridico(String nitjuridico) {
        this.nitjuridico = nitjuridico;
    }

    public usuarios getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(usuarios usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public Set<inmuebles> getLuserinmuebles() {
        return luserinmuebles;
    }

    public void setLuserinmuebles(Set<inmuebles> luserinmuebles) {
        this.luserinmuebles = luserinmuebles;
    }
        
    
}
