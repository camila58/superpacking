package cl.ufro.dci.proyecto20.repositorio;

import cl.ufro.dci.proyecto20.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUsuarioReposi extends JpaRepository<Usuario,Integer> {

    public List <Usuario> findAllByIdUsuario(long id);



}
