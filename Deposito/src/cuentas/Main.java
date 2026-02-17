package cuentas; // REQUISITO 1: Paquete

public class Main {

    public static void main(String[] args) {
        // REQUISITO 2: Cambiar nombre de variable miCuenta a cuenta1
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Llamamos al nuevo método.
        // El parámetro '0' (float) se pasa para cumplir el REQUISITO 5, aunque no afecte la lógica interna.
        operativa_cuenta(cuenta1, 0.0f);
    }

    // REQUISITO 3: Método operativa_cuenta que engloba la lógica
    // REQUISITO 5: Parámetro cantidad de tipo float
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}