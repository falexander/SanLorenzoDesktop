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
@Table(name="imgdescriptions")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
public class imgdescriptions {
    
    @Id    
    @SequenceGenerator(name="secuencia_imgdescriptions",sequenceName="imgdescriptions_id_seq", allocationSize=1)
    @Column(name="id", columnDefinition="serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="secuencia_imgdescriptions")
    private Integer id;                        
    
    @Column(name="imgname")
    private String imgname;    
    
    @Column(name="description")
    private String description;    

    public imgdescriptions() {
    }

    public imgdescriptions(Integer id, String imgname, String description) {
        this.id = id;
        this.imgname = imgname;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
