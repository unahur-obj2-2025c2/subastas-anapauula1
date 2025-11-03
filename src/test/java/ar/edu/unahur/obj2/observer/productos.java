package ar.edu.unahur.obj2.observer;


import org.junit.jupiter.api.Test;

public class productos {
    @Test
    void cofiguracionInicial() {
        IProducto productoSubas = new ProductoSubastado();
        ISubastador gonzager = new Subastador("gonzager");
        ISubastador diazdan = new Subastador("diazdan");
        ISubastador martomau = new Subastador("martomau");

        // registramos a los subastadores en la lista
        productoSubas.agregarSubastador(gonzager);
        productoSubas.agregarSubastador(martomau);
    }
}
