package curso.hibernate.ExamenFinal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculo", schema = "empresa")
public class Vehiculo {

    @Id
    @Column(name = "Placa", nullable = false, length = 8)
    private String placa;

    @Column(name = "Odometro")
    private Double odometro;

    @Column(name = "Modelo", length = 15)
    private String modelo;

    @Column(name = "Tipo", length = 25)
    private String tipo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getOdometro() {
        return odometro;
    }

    public void setOdometro(Double odometro) {
        this.odometro = odometro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
