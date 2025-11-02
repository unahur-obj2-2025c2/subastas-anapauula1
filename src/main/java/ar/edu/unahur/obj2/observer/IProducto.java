package ar.edu.unahur.obj2.observer;

public interface IProducto {
    void notificar();
    void agregarSubastador(ISubastador unSubastador);
    void quitarSubastador(ISubastador unSubastador);
    void recibirOferta(Oferta unaOferta,ISubastador subastador);
    Oferta ultimaOfertaRecibida();
}
