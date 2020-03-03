package cl.ufro.dci.proyecto20.controladores;
import cl.ufro.dci.proyecto20.modelo.Usuario;
import cl.ufro.dci.proyecto20.repositorio.IUsuarioReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerUsu {
    @Autowired
    private IUsuarioReposi repositorio;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World")String name,Model model){
        Usuario user= new Usuario();
        //user.setIdUsuario(1);
        user.setNombre("camila");
        user.setApellido("muñoz");
        repositorio.save(user);

        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping("/registro")
    public String registro(){

        return "Registrarse";
    }
    @PostMapping("/registro")
    public String guardar(@ModelAttribute Usuario user){
        repositorio.save(user);
        return "redirect:/registro";
    }

    //public String Usuario( Model model){

      //  List<Usuario>usuario=repositorio.findAllByIdUsuario(long id;
        //return("verUsuario");
    //}


}
