package service;

import entities.Cor;
import entities.Figura;

public class Triangulo extends Figura implements AreaCalculavel {


    // CONSTRUTOR
    public Triangulo() {
        super();
    }

    public Triangulo(Double largura, Double altura, Cor cor) {
        super(largura, altura, cor);
    }
    // CONSTRUTOR


    // METODOS
    @Override
    public Double area() {
        return (getAltura() * getLargura()) / 2;
    }

    @Override
    public String toString() {
        super.toString();
        return "Quadrado tem: " +
        "\n Largura: " + getLargura() +
        "\n Altura: " + getAltura() +
        "\n Cor: " + getCor() +
        "\n Area: " + area();
        
    }
    // METODOS
    
}
