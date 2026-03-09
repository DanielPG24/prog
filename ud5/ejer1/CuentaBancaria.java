package prog.ud5.ejer1;

class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;
    
    //Métodos
    public CuentaBancaria(String titular, double saldo){
        
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresar(double cantidad){
        if (cantidad > 0) {
            System.out.println("Se han ingresado sus " + cantidad + " correctamente");
            saldo = saldo + cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad <= saldo) {
            System.out.println("Se han retirado" + cantidad + "correctamente");
            saldo = saldo - cantidad;
        } else {
            System.out.println("No tienes saldo suficiente. Saldo actual: " + saldo);
        }
    }
    
    public void setTitular(String titular){
        
    }
    
    public void setSaldo(String titular){
        
    }
}
