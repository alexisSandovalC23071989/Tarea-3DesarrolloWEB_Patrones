/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.service;

import PrograWEB.entily.Datos;
import java.util.List;

/**
 *
 * @author aldav
 */
public interface INombreSevice {
    public List<Datos> getAllPersona();

    public Datos getDatosById(long id);

    public void saveDatos(Datos datos);

    public void delete(long id);
    
}
