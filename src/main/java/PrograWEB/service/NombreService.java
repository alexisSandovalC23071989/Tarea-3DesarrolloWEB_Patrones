/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.service;

import PrograWEB.entily.Datos;
import PrograWEB.repository.NombreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public abstract class NombreService implements INombreSevice {
    
    @Autowired
    private NombreRepository personaRepository;

    @Override
    public List<Datos> getAllPersona() {
        return (List<Datos>) personaRepository.findAll();

    }

    @Override
    public Datos getDatosById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void savePersona(Datos datos) {
        personaRepository.save(datos);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }

    
}
