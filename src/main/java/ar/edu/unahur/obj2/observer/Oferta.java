package ar.edu.unahur.obj2.observer;

public class Oferta {
    private ISubastador subtadorQueOferto;
    private Integer valorOfertado;
    public Oferta(ISubastador subtadorQueOferto, Integer valorOfertado) {
        this.subtadorQueOferto = subtadorQueOferto;
        this.valorOfertado = valorOfertado;
    }
    public ISubastador getSubtadorQueOferto() {
        return subtadorQueOferto;
    }
    public void setSubtadorQueOferto(ISubastador subtadorQueOferto) {
        this.subtadorQueOferto = subtadorQueOferto;
    }
    public Integer getValorOfertado() {
        return valorOfertado;
    }
    public void setValorOfertado(Integer valorOfertado) {
        this.valorOfertado = valorOfertado;
    }
}
