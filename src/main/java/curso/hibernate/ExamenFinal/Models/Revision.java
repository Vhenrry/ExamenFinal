package curso.hibernate.ExamenFinal.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Revision", schema = "empresa")
public class Revision {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "encargado", nullable = false)
    private Tecnico encargado;

    @ManyToOne
    @JoinColumn(name = "vehiculo", nullable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "chofer", nullable = false)
    private Operador chofer;

    @Column(nullable = false)
    private LocalDate fechaRevision;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tecnico getEncargado() {
        return encargado;
    }

    public void setEncargado(Tecnico encargado) {
        this.encargado = encargado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Operador getChofer() {
        return chofer;
    }

    public void setChofer(Operador chofer) {
        this.chofer = chofer;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

}
