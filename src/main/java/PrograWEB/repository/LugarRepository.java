/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.repository;

import PrograWEB.entily.Datos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aldav
 */
@Repository   /* Definimos que tipo de clase o como se va a conportar*/
public interface LugarRepository extends CrudRepository<Datos,Long> {
    
}
