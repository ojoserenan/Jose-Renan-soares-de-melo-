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
public class Novo extends Imovel{
    float adcionalPreco = 10000;

    public float getAdcionalPreco() {
        return adcionalPreco;
    }

    public void setAdcionalPreco(float adcionalPreco) {
        this.adcionalPreco = adcionalPreco;
    }

    @Override
    public float getPreco(){
        return preco += adcionalPreco;
    }
    
}
