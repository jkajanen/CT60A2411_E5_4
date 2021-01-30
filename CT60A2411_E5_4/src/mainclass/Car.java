/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author juhak
 */
public class Car {
    public String carManufacturer;
    public String carModel;
    
    public void print( String carPart)    {
    
    System.out.println("Manufacturing: " + carPart);
    }
    
    public void buildCar() {
        String carPart;
        int i;
        
        Body newBody = new Body(); 
        carPart = newBody.carPart;
        this.print( carPart );
        Chassis newChassis = new Chassis();
        carPart = newChassis.carPart;
        this.print( carPart );
        Engine newEngine = new Engine();
        carPart = newEngine.carPart;
        this.print( carPart );
        Wheel newWheel = new Wheel();
        for ( i = 0; i < newBody.getBodyNumberOfAxles(); i++ ) {
            carPart = newWheel.carPart;
            this.print( carPart );
            
        }
            
            
           
         
    };

}
