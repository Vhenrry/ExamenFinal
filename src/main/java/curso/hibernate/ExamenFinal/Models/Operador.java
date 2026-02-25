package curso.hibernate.ExamenFinal.Models;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Table;

@Entity
@Table(name = "Operador", schema = "empresa")
public class Operador {

    @Id
    private int id;

    @Column(name = "Nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 20)
    private String apellido;

    @Column(name = "Categoria_licencia", nullable = false, length = 1)
    private String categoria_licencia;

    @Column(name = "Fecha_vencimiento", nullable = false)
    private LocalDate fechaVencimiento;

    @OneToOne(mappedBy = "operador", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Operador_detalle detalle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategoria_licencia() {
        return categoria_licencia;
    }

    public void setCategoria_licencia(String categoria_licencia) {
        this.categoria_licencia = categoria_licencia;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Operador_detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Operador_detalle detalle) {
        this.detalle = detalle;
    }

}
