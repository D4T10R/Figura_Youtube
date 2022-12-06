package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        Figura[] figura;
        File file = new File("c:\\Users\\Leona\\Documents\\figuras.txt");

        System.out.println("Quantas figuras geometricas");
        int quantidade = sc.nextInt();
        figura = new Figura[quantidade];

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {


            for (int i = 0; i < quantidade; i++) {

                sc.nextLine();
                System.out.println("Qual a cor da figura? ");
                Cor cor = Cor.valueOf(sc.nextLine());
                System.out.println("Qual a largura da figura? ");
                Double largura = sc.nextDouble();
                System.out.println("Qual a altura da figura? ");
                Double altura = sc.nextDouble();

                System.out.println("Quantos lados tem a figura? ");
                int lados = sc.nextInt();

                if (lados == 3) {
                    figura[i] = (new Triangulo(largura, altura, cor));
                }
                else if (lados == 4 && Math.abs(largura - altura) == 0.0) {
                    figura[i] = (new Quadrado(largura, altura, cor));
                }
                else if (lados == 4 && Math.abs(largura - altura) != 0.0)  {
                    figura[i] = (new Retangulo(largura, altura, cor));
                }         
                else {
                    System.out.println("Figura geometrica não encontrada!");
                }

            }



            for (int i = 0; i < figura.length; i++) {
                bw.write(figura[i].toString());
                bw.newLine();
            }

        

        }
        catch (IOException e) {
            e.getMessage();
        }
    
    
        

        



    }

}
