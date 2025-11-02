package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductoSubastado implements IProducto {
    List<ISubastador> usuarios = new ArrayList<>();
    List<Oferta> ofertasRecibidas = new ArrayList<>();

    @Override
    public void agregarSubastador(ISubastador unSubastador) {
        usuarios.add(unSubastador);
    }
    @Override
    public void quitarSubastador(ISubastador unSubastador) {
       usuarios.remove(unSubastador);
    }
    @Override
    public void notificar() {
        // notifico a todos los subastadores
        usuarios.forEach(u -> u.notificado(this,ultimaOfertaRecibida()));
    }
    public List<ISubastador> getUsuarios() {
        return usuarios;
    }
    public List<Oferta> getOfertasRecibidas() {
        return ofertasRecibidas;
    }
    public void recibirOferta(Oferta unaOferta,ISubastador subastador) {
        if(estaElSubastador(subastador)){
            ofertasRecibidas.add(unaOferta);
            notificar(); 
        }
        throw new NoEstaElSubastador("El Subastador no participa en la subasta");
    }
    @Override
    public Oferta ultimaOfertaRecibida(){
       return ofertasRecibidas.getLast();
    }
    public boolean estaElSubastador(ISubastador subastador){
        return usuarios.contains(subastador);
    }
}
