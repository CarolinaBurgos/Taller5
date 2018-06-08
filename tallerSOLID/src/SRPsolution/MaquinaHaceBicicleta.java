/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;
import ISPsolution.IFBicicleta;
/**
 *
 * @author USER
 */
public class MaquinaHaceBicicleta extends MaquinaGenerica implements IFBicicleta{

    public MaquinaHaceBicicleta() {
    }

    public MaquinaHaceBicicleta(double energiaRestante) {
        super(energiaRestante);
    }

    @Override
    public void fabricarBicicleta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fabricarAsientoBicicleta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fabricarLlantaBicicleta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
