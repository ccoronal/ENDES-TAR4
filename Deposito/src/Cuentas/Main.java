package Cuentas;


import Cuentas.CCuenta;

public class Main {
    // main: ejecución
    public static void main(String[] args) {
        // llamada al método operativa_cuenta
        operativa_cuenta();
    }
    // método operativa_cuenta: engloba todas las sentencias que trabajan con cuenta1
    public static void operativa_cuenta() {
        // atributos
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;
        // métodos + estructura
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } 
        catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
