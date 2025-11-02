package ar.edu.unahur.obj2.observer;

public interface ISubastador {
    void notificado(IProducto producto, Oferta nuevaOferta);
    String nombre();
    Oferta agregarOferta(IProducto producto,Integer valor);
}
