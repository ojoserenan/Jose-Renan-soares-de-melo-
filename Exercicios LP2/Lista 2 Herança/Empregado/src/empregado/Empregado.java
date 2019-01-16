/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author joser
 */
public class Empregado {

    private String nome;
    protected float salario;

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    public Empregado() {
    }
    
}
