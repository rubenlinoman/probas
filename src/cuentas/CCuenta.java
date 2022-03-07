package cuentas;

public class CCuenta {

    /**
     * Obtener nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener numero de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modificar número de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtener saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modificar saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtener tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Modificar tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    /**
     * Nombre
     */
    private String nombre;
    /**
     * Número de cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de CCuenta
     * @param nom nombre
     * @param cue número de cuenta
     * @param sal saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtener estado de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad cantidad que se desea ingresar
     * @throws Exception lanza excepción si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad que se desea retirar
     * @throws Exception lanza excepción si la cantidad es menor o igual a cero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
