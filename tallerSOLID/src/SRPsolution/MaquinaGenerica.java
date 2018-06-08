/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;

/**
 *
 * @author USER
 */
public class MaquinaGenerica {

    private double energiaRestante; //Valor entre 00.00 y 100.00

    public MaquinaGenerica() {
        this.energiaRestante = 100.00;
    }

    public MaquinaGenerica(double energiaRestante) {
        this.energiaRestante = energiaRestante;
    }
}
