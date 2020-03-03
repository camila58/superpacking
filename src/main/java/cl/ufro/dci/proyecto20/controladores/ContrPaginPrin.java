package cl.ufro.dci.proyecto20.controladores;

import cl.ufro.dci.proyecto20.modelo.Usuario;
import cl.ufro.dci.proyecto20.repositorio.IUsuarioReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/pagiPrincia")
public class ContrPaginPrin {
    @Autowired
    private IUsuarioReposi iUsuarioReposi;

    public String mostrarDatos(Model model){
        ArrayList<Usuario>usuarios=(ArrayList<Usuario>)iUsuarioReposi.findAll();
       model.addAttribute("usuario",usuarios);

       return("/PaginaPrincipal");
    }
}
