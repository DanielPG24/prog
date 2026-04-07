/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud6.ejer3;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Car extends Vehicle{
    private int numberOfDoors;
    
    @Override
    public double calculaSpeed(){
        return 0;
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
	this.numberOfDoors = numberOfDoors;
    }
}
