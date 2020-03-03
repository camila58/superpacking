package cl.ufro.dci.proyecto20.controladores;

import cl.ufro.dci.proyecto20.modelo.Horario;
import cl.ufro.dci.proyecto20.repositorio.IHorariRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/agregHorario")
public class controllerHora {

    @Autowired
    private IHorariRepos reposiHorario;
    @PostMapping("/agregaHorario")
    public String guardarDatos(@ModelAttribute Horario horario){
        reposiHorario.save(horario);
        return ("/AgregarHorario");
    }
    @GetMapping("/borraHora")
    public String borrarHoras(Model model){
        //ArrayList<Horario>horarios=(ArrayList<Horario>) reposiHorario.deleteAll();
        //model.addAttribute("horario",horarios);
        //PREGUNTAR POR LA PARTE DE BORRAR Y EDITAR
        return ("/AgregarHorario");
    }
    @DeleteMapping("/agregarHorario")
    public String borrarPeriodo(@ModelAttribute Horario horario){
        reposiHorario.delete(horario);
        return("/AgregarHorario");
    }
    @PostMapping("/agregarHorario")
    public String editarHorario(@ModelAttribute Horario horario){
        reposiHorario.
    }


}
