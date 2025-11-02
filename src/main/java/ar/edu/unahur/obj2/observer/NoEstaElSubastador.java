package ar.edu.unahur.obj2.observer;

public class NoEstaElSubastador extends RuntimeException {
    public NoEstaElSubastador(){};
    public NoEstaElSubastador(String mensaje){
        super(mensaje);
    }
}
