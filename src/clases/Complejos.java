/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Complejos {

    private int partereal;
    private int parteI;

    public Complejos(int partereal, int parteI) {
        this.partereal = partereal;
        this.parteI = parteI;

    }

    public void setPartereal(int partereal) {
        this.partereal = partereal;
    }

    public void setParteI(int parteI) {
        this.parteI = parteI;
    }

    public double getPartereal() {
        return partereal;
    }

    public double getParteI() {
        return parteI;
    }

    public Complejos sumar(Complejos c2) {
        Complejos c;
        int real, i;

        real = this.partereal + c2.partereal;
        i = this.parteI + c2.parteI;
        c = new Complejos(real, i);
        return c;
    }

    public Complejos restar(Complejos c2) {
        Complejos c;
        int real, i;

        real = this.partereal - c2.partereal;
        i = this.parteI - c2.parteI;
        c = new Complejos(real, i);
        return c;
    }

    public Complejos Multiplicar(Complejos c2) {
        Complejos c;
        int real, i;

        real = (this.partereal * c2.partereal) - (this.parteI * c2.parteI);
        i = (this.partereal * c2.parteI) - (this.parteI * c2.parteI);
        c = new Complejos(real, i);
        return c;
    }

    public Complejos Dividir(Complejos c2) {
        Complejos c;
        int real, i;
        real = (this.partereal * c2.partereal) + (this.parteI * c2.parteI) / (c2.partereal * c2.partereal) + (c2.parteI * c2.parteI);
        i = (c2.parteI * c2.partereal) - (this.partereal * c2.parteI) / (c2.partereal * c2.partereal) + (c2.parteI * c2.parteI);
        c = new Complejos(real, i);
        return c;
    }

}
