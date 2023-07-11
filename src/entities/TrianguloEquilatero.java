package entities;

public class TrianguloEquilatero extends PoligonoRegular {

    public TrianguloEquilatero(double tamanhoLado) {
        super(3, tamanhoLado);
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * getTamanhoLado() * getTamanhoLado();
    }

}
