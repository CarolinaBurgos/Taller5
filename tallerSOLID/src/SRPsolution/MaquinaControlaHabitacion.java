/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;

import ISPsolution.IHabitacion;
import ISPsolution.ISistemaElectrico;

/**
 *
 * @author USER
 */
public class MaquinaControlaHabitacion extends MaquinaGenerica implements IHabitacion,ISistemaElectrico{

    public MaquinaControlaHabitacion() {
    }

    public MaquinaControlaHabitacion(double energiaRestante) {
        super(energiaRestante);
    }

    @Override
    public void calentarHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enfriarHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirMusicaGlobalmente() {
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
