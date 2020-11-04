/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model;

/**
 *
 * @author diegonarvaez
 */
public class Logica {

    public int sumar(int n1, int n2) {
        int res = 0;
        return res = n1 + n2;
    }

    public int restar(int n1, int n2) {
        int res = 0;
        return res = n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        int res = 0;
        return res = n1 * n2;
    }

    public int dividir(int n1, int n2) {
        int res = 0;
        return res = n1 / n2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Logica obj = new Logica();

        System.out.print(obj.sumar(2, 2));

    }

}
