package ar.edu.unahur.obj2.observer;

public class Subastador implements ISubastador{
    private String nombre;
    @Override
    public String nombre() {
       return nombre;
    }
    public Subastador(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void notificado(IProducto producto, Oferta nueva) {
        Integer valorDeUltimaOferta = nueva.getValorOfertado();
        producto.recibirOferta(agregarOferta(producto,valorDeUltimaOferta),this);
    }
    @Override
    public Oferta agregarOferta(IProducto producto,Integer valor) {
        return new Oferta(this, valor + 10);
    }
}
