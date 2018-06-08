/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCPsolution;

import vehiculos.Bicicleta;
import vehiculos.Vehiculo;

/**
 *
 * @author Carolina
 */
public class GiroIzquierdaBicicleta implements TiposGiros{
    
    private Bicicleta bicicleta;

    public GiroIzquierdaBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;        
    }
    
    @Override
    public void girar(Vehiculo vehiculo){
        bicicleta = (Bicicleta) vehiculo; //Downcasting
        bicicleta.girarLlantaDelanteraAIzquierda();
    }
    
}
