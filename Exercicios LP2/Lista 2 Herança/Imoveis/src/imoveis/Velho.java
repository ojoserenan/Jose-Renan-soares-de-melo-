/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

/**
 *
 * @author joser
 */
public class Velho extends Imovel{
    float descontoPreco = 30000;

    public float getDescontoVelho() {
        return descontoPreco;
    }

    public void setDescontoVelho(float descontoVelho) {
        this.descontoPreco = descontoVelho;
    }
    @Override
    public float getPreco(){
        return preco -= descontoPreco;
    }
    
}
