
package com.example.backporfolio.model;



import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    @Temporal(TemporalType.DATE)
    private Date fechanac;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String slogan;
    private String titulo; 
    private String info_profe_resum;
    
    
    
    public Persona() {
        
    }
    
    public Persona(Long id, String nombre, String apellido,String domicilio,Date fechanac,String telefono,String correo, String sobre_mi, String url_foto,String slogan, String titulo,String info_profe_resum) {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;        
        this.domicilio=domicilio;
        this.fechanac=fechanac;
        this.telefono=telefono;
        this.correo=correo;
        this.sobre_mi=sobre_mi;
        this.url_foto=url_foto;
        this.slogan=slogan;
        this.info_profe_resum=info_profe_resum;
                
        
        
                
                
    }
    
}
