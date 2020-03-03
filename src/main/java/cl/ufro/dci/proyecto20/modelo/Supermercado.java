package cl.ufro.dci.proyecto20.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name="supermercado")
public class Supermercado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSupermer;

    @Column(name="nombre")
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Usuario> empaques;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Sucursal> sucursal;

    public Supermercado(String nombre) {
        this.nombre = nombre;
    }
    public Supermercado(){

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public long getIdSupermer() {
        return idSupermer;
    }

    public void setIdSupermer(long idSupermer) {
        this.idSupermer = idSupermer;
    }

    public List<Usuario> getEmpaques() {
        return empaques;
    }

    public void setEmpaques(List<Usuario> empaques) {
        this.empaques = empaques;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }
    public void addSucursal(Sucursal sucursal){
        this.sucursal.add(sucursal);
    }
    public void removeSucursal(Sucursal sucursal){
        this.sucursal.remove(sucursal);
    }
}
