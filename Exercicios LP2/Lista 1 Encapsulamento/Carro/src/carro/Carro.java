package carro;
public class Carro {
    
    private String marca;
    private  String cor;
    private  int ano;

    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString(String marca,String cor,int ano) {
        return "O Carro é da marca " + marca + ", cor " + cor + " e ano " + ano;
    }

    public Carro() {
    }
    
    
}
