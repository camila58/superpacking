package cl.ufro.dci.proyecto20.modelo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;

    @Column( name = "nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( name="idSupermer", nullable = false)
    private Supermercado supermercado;

    @Column(name="correo")
    private String correo;

    @Column(name = "contraseña")
    private String contraseña;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Horario> horario;

    public Usuario(){
    }

    public Usuario(String nombre, String apellido, Supermercado supermercado, String correo, String contraseña, Sucursal sucursal, Horario horario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.supermercado = supermercado;
        this.correo = correo;
        this.contraseña = contraseña;

    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
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

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", supermercado=" + supermercado +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
    public void addHorario(Horario horario){
        this.horario.add(horario);
    }
    public void removeHorario(Horario horario){
        this.horario.remove(horario);
    }
}
