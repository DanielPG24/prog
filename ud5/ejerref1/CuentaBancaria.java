/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejerref1;

/**
 *
 * @author 12_1DAW_Alum
 */
class CuentaBancaria {
    private String titular;
    private double saldo;
    private static int totalCuenta = 0;
    
    //constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        totalCuenta++;
    }
    
    //getters setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodos
    void mostrarDatos(){
        System.out.println(titular);
        System.out.println(saldo);
    }
    
    void ingresar(double cantidad){
        saldo = saldo + cantidad;
    }
    
    static int getTotalCuentas(){
        return totalCuenta;
    }

}
