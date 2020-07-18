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


public class circle extends ellipse {
    
    String name = "Circle";
     
     @Override
    public void shapeName(){
         System.out.println("Shape name: " + name);
     }
    
    public void getArea(){
        double pi = 3.14159;
        double radius = length / 2;
        double radius2 = radius * radius;
         area = pi * radius2;
         
         System.out.println("area: " + area);

   }
    
    @Override
    public void getPeri(){
        double L= length;
         double radius = L / 2;
         double pi = 3.14159;
          peri = 2 * pi * radius;
         System.out.println("Perimeter: " +peri);
         
        
        //return;
                
   }
    
    
    
    public void print(){
        System.out.println("...HI!!!!!!!!!! im circle");
    }
    
    
}
