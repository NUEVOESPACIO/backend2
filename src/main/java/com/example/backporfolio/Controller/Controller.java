
package com.example.backporfolio.Controller;

import com.example.backporfolio.model.Persona;
import com.example.backporfolio.service.iPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired    
    private iPersonaService persoServ;
      
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/hola")
    public String decirHola() {
        return "Hola Mundo 2023";
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @DeleteMapping ("/delete/{id}")    
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);        
    }
    
    
    
    
}
