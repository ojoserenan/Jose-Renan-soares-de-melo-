/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingresso;

/**
 *
 * @author joser
 */
public class IngressoVIP extends Ingresso{
    private float valorAdicional = 50;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public float getValor() {
        return valor += valorAdicional;
    }

    @Override
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "IngressoVIP{" + getValor()+'}';
    }
    
    
}
