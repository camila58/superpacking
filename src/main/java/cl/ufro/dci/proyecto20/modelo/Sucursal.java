package cl.ufro.dci.proyecto20.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSucursal;

    @Column(name="direccion")
    private String direccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSupermer",nullable = false)
    private Supermercado supermercado;

    public Sucursal(String direccion) {
        this.direccion = direccion;
    }
    public Sucursal(){

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
