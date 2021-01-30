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
public class Body {
    int bodyModel;
    int bodyNumberOfAxles = 4;
    String carPart = "Body";
    
    public void Body() {
        
    }
    
    public int getBodyNumberOfAxles() {
        return bodyNumberOfAxles;
    }
    
    public String getBody() {
            return carPart;
    }
}
