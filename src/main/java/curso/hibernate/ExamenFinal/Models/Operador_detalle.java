package curso.hibernate.ExamenFinal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Table;

@Entity
@Table(name = "Operador_detalle", schema = "empresa")
public class Operador_detalle {

    @Id
    private int id;

    @Column(name = "Telefono")
    private int telefono;

    @Column(name = "Direccion", length = 40)
    private String direccion;

    @Column(name = "Email", length = 40)
    private String email;

    @OneToOne
    @MapsId
    @JoinColumn(name = "Id")
    @JsonBackReference
    private Operador operador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

}
