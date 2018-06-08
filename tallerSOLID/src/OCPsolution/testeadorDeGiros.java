package OCPsolution;

import vehiculos.*;

public class testeadorDeGiros {
        
        //Prueba
        /*public static void main(String[] args) {
            Carro c = new Carro();
            GiroIzquierdaCarro gc = new GiroIzquierdaCarro(c);
            
            girarVehiculo(c, gc);
        }*/
                
        public void girarVehiculo(Vehiculo vehiculo, TiposGiros tipo){
            tipo.girar(vehiculo);
        }
}
