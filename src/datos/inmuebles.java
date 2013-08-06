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
@Table(name="inmuebles")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class inmuebles implements Serializable{
    
    @Id    
    @SequenceGenerator(name="secuencia_inmuebles",sequenceName="inmuebles_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_inmuebles")
    private Integer id;            
    
    @Column(name="direccion")
    private String direccion;            
    
    @Column(name="telefono")
    private String telefono;                
    
    @Column(name="tomo1")
    private String tomo1;                    
    
    @Column(name="folio1")
    private String folio1;                        
    
    @Column(name="tomo2")
    private String tomo2;                            
    
    @Column(name="folio2")
    private String folio2;                                

    @Column(name="tomoreal")
    private String tomoreal;                                    
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contribuyente_id")
    private contribuyentes contribuyente_id;             
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="zona_id")
    private zonas zona_id;
    
    @OneToMany(mappedBy="inmuebles_id",cascade= CascadeType.ALL)
    private Set<pagos> lpagosinmuebles;     
    
    @OneToMany(mappedBy="inmuebles_id",cascade= CascadeType.ALL)
    private Set<impuestosinmuebles> limpuestosinmuebles;                

    public inmuebles() {
    }

    public inmuebles(Integer id, String direccion, String telefono, String tomo1, String folio1, String tomo2, String folio2, String tomoreal, contribuyentes contribuyente_id, zonas zona_id) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tomo1 = tomo1;
        this.folio1 = folio1;
        this.tomo2 = tomo2;
        this.folio2 = folio2;
        this.tomoreal = tomoreal;
        this.contribuyente_id = contribuyente_id;
        this.zona_id = zona_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTomo1() {
        return tomo1;
    }

    public void setTomo1(String tomo1) {
        this.tomo1 = tomo1;
    }

    public String getFolio1() {
        return folio1;
    }

    public void setFolio1(String folio1) {
        this.folio1 = folio1;
    }

    public String getTomo2() {
        return tomo2;
    }

    public void setTomo2(String tomo2) {
        this.tomo2 = tomo2;
    }

    public String getFolio2() {
        return folio2;
    }

    public void setFolio2(String folio2) {
        this.folio2 = folio2;
    }

    public String getTomoreal() {
        return tomoreal;
    }

    public void setTomoreal(String tomoreal) {
        this.tomoreal = tomoreal;
    }

    public contribuyentes getContribuyente_id() {
        return contribuyente_id;
    }

    public void setContribuyente_id(contribuyentes contribuyente_id) {
        this.contribuyente_id = contribuyente_id;
    }

    public zonas getZona_id() {
        return zona_id;
    }

    public void setZona_id(zonas zona_id) {
        this.zona_id = zona_id;
    }

    public Set<pagos> getLpagosinmuebles() {
        return lpagosinmuebles;
    }

    public void setLpagosinmuebles(Set<pagos> lpagosinmuebles) {
        this.lpagosinmuebles = lpagosinmuebles;
    }        

    public Set<impuestosinmuebles> getLimpuestosinmuebles() {
        return limpuestosinmuebles;
    }

    public void setLimpuestosinmuebles(Set<impuestosinmuebles> limpuestosinmuebles) {
        this.limpuestosinmuebles = limpuestosinmuebles;
    }        
    
}
