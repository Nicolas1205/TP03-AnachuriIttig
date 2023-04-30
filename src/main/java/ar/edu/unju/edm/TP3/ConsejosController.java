package ar.edu.unju.edm.TP3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class ConsejosController {
  @GetMapping("/consejos")
  public String getConsejos(Model model){
    var consejos = new ArrayList<Consejo>();
    consejos.add(new Consejo("Consejo 1", "Consejo Description 1"));
    consejos.add(new Consejo("Consejo 2", "Consejo Description 2")); 
    consejos.add(new Consejo("Consejo 3", "Consejo Description 3")); 
    model.addAttribute("consejos", consejos); 
    return "consejos.html"; 
  }
}
