package cl.ufro.dci.proyecto20.modelo;


import cl.ufro.dci.proyecto20.modelo.numertion.Dia;
import cl.ufro.dci.proyecto20.modelo.numertion.Periodo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="horario")
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHorario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;



    private Periodo periodo;


    private Dia dia;

    public Horario(){

    }

    public long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

}
