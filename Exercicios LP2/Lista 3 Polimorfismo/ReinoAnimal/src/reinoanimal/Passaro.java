/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoanimal;

/**
 *
 * @author joser
 */
public class Passaro extends Ave{
    String tipo;

    public Passaro(String nome, String tipo) {
        super( nome);
        this.tipo = tipo;
    }

 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

     @Override
    public String toString() {
        return "O passaro " + "se chama "+ nome + " e seu tipo e " +tipo + ".";
    }
    
    
    @Override
    public void locomover() {
        System.out.println("voar"); 
    }

    @Override
    public void alimentar() {
        System.out.println("sementes");
    }

    public Passaro( String nome) {
        super( nome);
    }
    
}
