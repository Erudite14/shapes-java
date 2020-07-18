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
public class square extends rectangle {
  
    String name = "Square";
     
     @Override
    public void shapeName(){
         System.out.println("Shape name: " + name);
     }
    
    @Override
    public void getPeri(){
        double LxW= length + length;
         peri = LxW * 2;
         
         System.out.println("Perimeter: " + peri);
   }
    
    
    
}
