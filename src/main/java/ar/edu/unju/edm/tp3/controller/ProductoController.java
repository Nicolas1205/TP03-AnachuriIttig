package ar.edu.unju.edm.tp3.controller;

import ar.edu.unju.edm.tp3.model.Producto;
import ar.edu.unju.edm.tp3.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ProductoController {
    @Autowired
    IProductosService productosService;

    @GetMapping("/agregarProducto")
    String mostrarFormulario(@RequestParam("codigo") Optional<Integer> codigo, Model model) {
        var producto = codigo.map(productosService::recuperarProducto).orElse(new Producto());

        model.addAttribute("producto", producto);
        return "agregarProductos";
    }

    @PostMapping("/agregarProducto")
    String procesarFormulario(@ModelAttribute("producto") Producto producto) {
        producto.setEstado(true);
        productosService.crearProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/productos")
    String mostrarProductos(Model model) {
        var lista = productosService.listarProductos();
        model.addAttribute("productos", lista);
        return "productos";
    }
}
