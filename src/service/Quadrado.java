package service;

import entities.Cor;
import entities.Figura;

public class Quadrado extends Figura implements AreaCalculavel {

    // CONSTRUTOR
    public Quadrado() {
        super();
    }

    public Quadrado(Double largura, Double altura, Cor cor) {
        super(largura, altura, cor);
    }
    // CONSTRUTOR

    // METODOS
    @Override
    public Double area() {
        return getLargura() * getLargura();
    }

    @Override
    public String toString() {
        super.toString();
        return "\nQuadrado tem: " +
        "\n Largura: " + getLargura() +
        "\n Altura: " + getAltura() +
        "\n Cor: " + getCor() +
        "\n Area: " + area();
        
    }
    // METODOS


    
}
