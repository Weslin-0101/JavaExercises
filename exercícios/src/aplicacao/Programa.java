package aplicacao;

import entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retan = new Retangulo();

        System.out.println("Digite a altura e a base do retângulo: ");
        retan.base = sc.nextDouble();
        retan.altura = sc.nextDouble();

        System.out.printf("Área: %.2f%n", retan.area());
        System.out.printf("Perímetro: %.2f%n", retan.perimetro());
        System.out.printf("Diagonal: %.2f%n", retan.diagonal());
    }
}
