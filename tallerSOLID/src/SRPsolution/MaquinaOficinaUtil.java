/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;

import ISPsolution.IUtil;

/**
 *
 * @author USER
 */
public class MaquinaOficinaUtil extends MaquinaGenerica implements IUtil{

    public MaquinaOficinaUtil() {
    }

    public MaquinaOficinaUtil(double energiaRestante) {
        super(energiaRestante);
    }

    @Override
    public void imprimirInforme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void servirCafe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
