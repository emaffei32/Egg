/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo5correcto;

import java.util.Scanner;

/**
 *
 * @author Elizabeth Maffei
 */
public class Cuenta {Scanner leer = new Scanner(System.in);
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private double interes;
    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void CrearCuenta() {
        System.out.println("Ingrese número de cuenta, dni, saldo actual:");
        numeroCuenta = leer.nextInt();
        dni = leer.nextLong();
        saldoActual = leer.nextInt();
    }
    public double Ingresar() {
        System.out.println("** deposito**");
        System.out.println("Ingrese la cantidad a depositar:");
        double dep = leer.nextDouble();
        saldoActual += dep;
        return saldoActual;
    }
    public double Retirar() {
        System.out.println("** E X T R A C C I Ó N **");
        System.out.println("Ingrese la cantidad a retirar:");
        double retiro = leer.nextDouble();
        if (saldoActual < retiro) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldoActual -= retiro;
        }
        return saldoActual;
    }
    public double ExatraccionRapida() {
        System.out.println("** E X T R A C C I Ó N  R Á P I D A **");
        System.out.println("Ingrese el valor que desea retirar (no superior al 20%)");
        double extraccion = leer.nextDouble();
        if (extraccion >= (saldoActual%20)) {
            System.out.println("No se puede realizar extracción rápida porque supera el 20% del saldo actual");
        } else {
            saldoActual -= extraccion;
        }
        return saldoActual;
    }
    public void consultarSaldo() {
        System.out.println("Su saldo actual es: "+saldoActual);
    }
    public void consutarDatos() {
        System.out.println("Su número de cuenta es: "+numeroCuenta);
        System.out.println("Su DNI es: "+dni);
        System.out.println("Su saldo actual es: "+saldoActual);
   }
    @Override
    public String toString() {
        return "Cuenta{" + "leer=" + leer + ", numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
}
    

