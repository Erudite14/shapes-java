/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author digim
 */
public class ellipse extends shape {
    
    String name = "Ellipse" ;     
     @Override
    public void shapeName(){
         System.out.println("Shape name: " + name);
     }
     
    
    
    @Override
    public void getPeri(){
        double LxW= length + width;
         peri = LxW * 2;
         System.out.println("Perimeter: " + peri);
        
        //return;
                
   }
    
    
    
    //ellipse E1= new ellipse();
}
