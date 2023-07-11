package entities;

public class Quadrado extends PoligonoRegular {
    public Quadrado(double tamanhoLado) {
        super(4, tamanhoLado);
    }   

    @Override
    public double calcularArea() {
        return getTamanhoLado() * getTamanhoLado();
    }   
}
