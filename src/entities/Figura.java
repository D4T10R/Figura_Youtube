package entities;

public abstract class Figura {

    // ATRIBUTOS
    private Double largura;
    private Double altura;
    private Cor cor; 
    // ATRIBUTOS

    // CONSTRUTORES
    public Figura() {
    }

    public Figura(Double largura, Double altura, Cor cor) {
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    // ENCAPSULAMENTO
    
    // METODOS
    public String toString() {
        return "Figura geometrica tem:" +
        "\n Largura: " + getLargura() + 
        "\n Altura: " + getAltura() + 
        "\n Cor: " + getCor();
    }
    // METODOS
    

}
