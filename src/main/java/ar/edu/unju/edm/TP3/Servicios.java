package ar.edu.unju.edm.TP3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Servicios {
  @GetMapping("/servicios")
  public String getServicios(Model model) {
    return "servicios.html";
  }
}
