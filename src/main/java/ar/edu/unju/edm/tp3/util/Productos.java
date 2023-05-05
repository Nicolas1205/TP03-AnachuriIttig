package ar.edu.unju.edm.tp3.util;

import ar.edu.unju.edm.tp3.model.Producto;

import java.util.HashMap;

public class Productos {
    private static HashMap<Integer, Producto> productos = new HashMap<>();

    public static HashMap<Integer, Producto> getProductos() {
        return productos;
    }

    public static void setProductos(HashMap<Integer, Producto> productos) {
        Productos.productos = productos;
    }
}
