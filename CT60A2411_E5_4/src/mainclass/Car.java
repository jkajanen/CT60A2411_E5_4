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
    private String carPartBody;
    private String carPartChassis;
    private String carPartEngine;
    private String carPartWheel;
    private int numberOfAxles;
    
    public void print( String carPart)    {
    
    System.out.println("Manufacturing: " + carPart);
    }
    
    public void buildCar() {
        String carPart;
        int i;
        
        Body newBody = new Body(); 
        carPartBody = newBody.carPart;
        this.print( carPartBody );
        Chassis newChassis = new Chassis();
        carPartChassis = newChassis.carPart;
        this.print( carPartChassis );
        Engine newEngine = new Engine();
        carPartEngine = newEngine.carPart;
        this.print( carPartEngine );
        Wheel newWheel = new Wheel();
        numberOfAxles = newBody.getBodyNumberOfAxles();
        for ( i = 0; i < numberOfAxles; i++ ) {
            carPartWheel = newWheel.carPart;
            this.print( carPartWheel );    
        }
    }
            
     public void reportCarParts() {
         
        System.out.println("Car parts:");
        if ( carPartBody != null )
             System.out.println("\t" + carPartBody);
        if ( carPartChassis != null )
             System.out.println("\t" + carPartChassis);
        if ( carPartEngine != null )
             System.out.println("\t" + carPartEngine);
        if ( carPartWheel != null ) {
             System.out.println("\t" + numberOfAxles + " " + carPartWheel);
        }
                
    }       
           
}
