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
public class Ingresso {
    float valor = 70;
    
    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + valor + '}';
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
