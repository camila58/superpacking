package cl.ufro.dci.proyecto20.repositorio;

import cl.ufro.dci.proyecto20.modelo.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHorariRepos extends JpaRepository<Horario,Integer> {
}
