package cuentas; // REQUISITO 1: Paquete

/**
 * Clase que simula el comportamiento de una cuenta bancaria.
 * Permite operaciones de ingreso, retirada y consulta.
 * * @author [T] Adrián Díaz García
 * @version 1.0
 * @since 2025-11-20
 */
public class CCuenta {

    // REQUISITO 4: Encapsular atributos (private)
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * @param nom Nombre del titular.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    /**
     * Devuelve el estado actual del saldo.
     * @return El saldo disponible.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Dinero a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad Dinero a retirar.
     * @throws Exception Si no hay saldo o la cantidad es negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    // GETTERS Y SETTERS (Necesarios tras encapsular)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}