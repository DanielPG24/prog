package prog.ud5.ejer1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Daniel", 30000);
        cuenta1.ingresar(1000);
        cuenta1.retirar(50);
        cuenta1.setTitular("Daniel Pino");
        System.out.println("Saldo total: " + cuenta1.getSaldo());
    }
}
