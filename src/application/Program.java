package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cor;
import entities.Figura;
import service.Quadrado;
import service.Retangulo;
import service.Triangulo;

public class Program {
    

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Figura> figura = new ArrayList<>();
        System.out.println("Qual a cor da figura? ");
        Cor cor = Cor.valueOf(sc.nextLine());
        System.out.println("Qual a largura da figura? ");
        Double largura = sc.nextDouble();
        System.out.println("Qual a altura da figura? ");
        Double altura = sc.nextDouble();

        System.out.println("Quantos lados tem a figura? ");
        int resp = sc.nextInt();
        

        if (resp == 3) {
            figura.add(new Triangulo(largura, altura, cor));
            System.out.println(figura.toString());
        }
        else if (resp == 4 && largura == altura) {
            figura.add(new Quadrado(largura, altura, cor));
            System.out.println(figura.toString());

        }
        else if (resp == 4 && largura != altura) {
            figura.add(new Retangulo(largura, altura, cor));
            System.out.println(figura.toString());
        }
        else {
            System.out.println("Figura geometrica não encontrada!");
        }

        

    
    
        

        



    }

}
