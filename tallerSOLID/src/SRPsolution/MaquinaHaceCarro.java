/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;
import ISPsolution.IFCarro;
import ISPsolution.ISistemaElectrico;

/**
 *
 * @author USER
 */
public class MaquinaHaceCarro extends MaquinaGenerica implements IFCarro,ISistemaElectrico {

    public MaquinaHaceCarro() {
    }

    public MaquinaHaceCarro(double energiaRestante) {
        super(energiaRestante);
    }

    @Override
    public void fabricarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fabricarAsientoCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fabricarLlantaCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asegurarPuertas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void encenderLuces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarLuces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
