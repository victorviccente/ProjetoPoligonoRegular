package entities;

public class PoligonoRegular {

    private int numeroLados;
    private double tamanhoLado;

    public PoligonoRegular(int numeroLados, double tamanhoLado) {
        this.numeroLados = numeroLados;
        this.tamanhoLado = tamanhoLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double calcularPerimetro() {
        return numeroLados * tamanhoLado;
    }

    public double calcularAnguloInterno() {
        return (numeroLados - 2) * 180.0 / numeroLados;
    }

    public double calcularArea() {
        return 0;
    }
}
