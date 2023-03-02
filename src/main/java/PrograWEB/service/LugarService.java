/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.service;

import PrograWEB.entily.Datos;
import PrograWEB.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class LugarService implements ILugarService {
    
    @Autowired
    /**
     * hace la union de server y repository es oara unir objetos*
     */
    private LugarRepository lugarRepository;

    @Override
    /*Aqui sobre escribimos los metodos*/
    public List<Datos> listCountry() {
        return (List<Datos>) lugarRepository.findAll();
    
    }
        

    
    
}
