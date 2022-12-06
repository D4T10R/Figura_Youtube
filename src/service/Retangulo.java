package service;

import entities.Cor;
import entities.Figura;

public class Retangulo extends Figura implements AreaCalculavel {

    // CONSTRUTOR
    public Retangulo() {
        super();
    }

    public Retangulo(Double largura, Double altura, Cor cor) {
        super(largura, altura, cor);

    }
    // CONSTRUTOR


    // METODOS
    @Override
    public Double area() {
        return getAltura() * getLargura();
    }

    @Override
    public String toString() {
        super.toString();
        return "\nRetangulo tem: " +
        "\n Largura: " + getLargura() +
        "\n Altura: " + getAltura() +
        "\n Cor: " + getCor() +
        "\n Area: " + area();
        
    }
    // METODOS


}