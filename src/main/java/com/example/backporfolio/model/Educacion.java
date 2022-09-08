
package com.example.backporfolio.model;



import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String titulo;
    private Date fechaini;
    private Date fechafin;
    private String descripcion;
    
       
    public Educacion() {
        
    }
    
    public Educacion(Long id, String institucion, String titulo, Date fechaini, Date fechafin, String descripcion) {
        this.id=id;
        this.institucion=institucion;
        this.titulo=titulo;
        this.fechaini=fechaini;
        this.fechafin=fechafin;
        this.descripcion=descripcion;
                
                
    }
    
}
