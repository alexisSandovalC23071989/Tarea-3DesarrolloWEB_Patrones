/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.controller;

import PrograWEB.entily.Datos;
import PrograWEB.service.ILugarService;
import PrograWEB.service.INombreSevice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author aldav
 */

@Controller
public class NombreController {
    
     @Autowired
    private INombreSevice nombreService;

    @Autowired
    private ILugarService lugarService;

    @GetMapping("/nombre")
    public String index(Model model) {
        List<Datos> listaPersona = nombreService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "nombre";
    }

    @GetMapping("/nombreN")
    public String crearPersonas(Model model) {

        List<Datos> listaPaises = lugarService.listCountry();
        model.addAttribute("nombre", new Datos());
        model.addAttribute("lugar", listaPaises);
        return "crear";
    }
    
}
