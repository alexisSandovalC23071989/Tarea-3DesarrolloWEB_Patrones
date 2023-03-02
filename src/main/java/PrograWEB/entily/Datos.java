/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrograWEB.entily;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author aldav
 */
@Entity
@Table(name = "tabla_asociadas")
public class Datos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long IdConcierto;
    private String Nombre_Artista;
    private long Costo_evento;
    private long Fecha_Concierto;
    private long Capacidad_maxima;
    private String Lugar;

    public long getIdConcierto() {
        return IdConcierto;
    }

    public void setIdConcierto(long IdConcierto) {
        this.IdConcierto = IdConcierto;
    }

    public String getNombre_Artista() {
        return Nombre_Artista;
    }

    public void setNombre_Artista(String Nombre_Artista) {
        this.Nombre_Artista = Nombre_Artista;
    }

    public long getCosto_evento() {
        return Costo_evento;
    }

    public void setCosto_evento(long Costo_evento) {
        this.Costo_evento = Costo_evento;
    }

    public long getFecha_Concierto() {
        return Fecha_Concierto;
    }

    public void setFecha_Concierto(long Fecha_Concierto) {
        this.Fecha_Concierto = Fecha_Concierto;
    }

    public long getCapacidad_maxima() {
        return Capacidad_maxima;
    }

    public void setCapacidad_maxima(long Capacidad_maxima) {
        this.Capacidad_maxima = Capacidad_maxima;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    
    

}
