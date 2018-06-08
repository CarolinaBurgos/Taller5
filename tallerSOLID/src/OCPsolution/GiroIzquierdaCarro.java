/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCPsolution;

import vehiculos.Carro;
import vehiculos.Vehiculo;

/**
 *
 * @author Carolina
 */
public class GiroIzquierdaCarro implements TiposGiros{
    
    private Carro carro;

    public GiroIzquierdaCarro(Carro carro) {
        this.carro = carro;        
    }
    
    @Override
    public void girar(Vehiculo vehiculo){
        carro = (Carro) vehiculo; //Downcasting
        carro.girarLlantaDelanteraIzquierdaAIzquierda();
        carro.girarLlantaDelanteraDerechaAIzquierda();
    }
    
}
