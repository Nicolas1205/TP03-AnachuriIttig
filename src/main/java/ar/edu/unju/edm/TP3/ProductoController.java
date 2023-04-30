package ar.edu.unju.edm.TP3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class ProductoController {
  @GetMapping("/productos")
  public String getProductos(Model model){
    var productos = new ArrayList<Producto>();
    var imgUrl = "https://tailwindcss.com/_next/static/media/tailwindcss-mark.3c5441fc7a190fb1800d4a5c7f07ba4b1345a9c8.svg";
    productos.add(new Producto("Producto 1", "Producto Description 1", imgUrl));
    productos.add(new Producto("Producto 2", "Producto Description 2", imgUrl)); 
    productos.add(new Producto("Producto 3", "Producto Description 3", imgUrl)); 
    model.addAttribute("productos", productos); 
    return "productos.html"; 
  }
}
