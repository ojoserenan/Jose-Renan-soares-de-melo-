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
public class Vendedor extends Empregado {
    
    private float percentualComissao;

    public Vendedor(float percentualComissao, String nome, float salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario(){
        return (this.salario = salario + percentualComissao);
    }

    @Override
    public String toString() {
        return super.toString()+calcularSalario()+percentualComissao;
    }

    public Vendedor() {
    }
    
    
    
}
