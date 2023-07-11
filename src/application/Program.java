package application;

import java.util.Scanner;

import entities.PoligonoRegular;
import entities.Quadrado;
import entities.TrianguloEquilatero;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***Cálculo de Polígonos***");

        System.out.println("Qual tipo de objeto você deseja criar?");
        System.out.println("\n\t[1] - Polígono Regular");
        System.out.println("\t[2] - Triângulo Equilátero");
        System.out.println("\t[3] - Quadrado");

        System.out.print("Digite a opção desejada: ");

        int opcao = sc.nextInt();
        PoligonoRegular TipoPoligono;

        if (opcao == 1) {
            System.out.print("\nDigite o número de lados do polígono:");
            int numeroLados = sc.nextInt();
            System.out.print("Digite o tamanho do lado:");
            double tamanhoLado = sc.nextDouble();
            TipoPoligono = new PoligonoRegular(numeroLados, tamanhoLado);
        } else if (opcao == 2) {
            System.out.print("Digite o tamanho do lado do triângulo equilátero:");
            double tamanhoLado = sc.nextDouble();
            TipoPoligono = new TrianguloEquilatero(tamanhoLado);
        } else if (opcao == 3) {
            System.out.print("Digite o tamanho do lado do quadrado:");
            double tamanhoLado = sc.nextDouble();
            TipoPoligono = new Quadrado(tamanhoLado);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            sc.close();
            return;
        }

        double perimetro = TipoPoligono.calcularPerimetro();
        double anguloInterno = TipoPoligono.calcularAnguloInterno();
        double area = TipoPoligono.calcularArea();
        

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Ângulo Interno: " + anguloInterno);
        System.out.println("Área: " + area);

        sc.close();
    }
}