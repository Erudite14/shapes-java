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
public class shape {
      String name = "Shape" ; 
      double length = 14.0;
      double width = 420.0;
      double area;
      double peri;
     
    
    /*public shape(double length, double width){
        this.length = length;
        this.width = width;
    }*/
    
     public void shapeName(){
         System.out.println(name);
     }
     
     
    public void getArea(){
         area = length + width;
         
         System.out.println("area: " + area);

   }
    
    public void getPeri(){
        double LxW= length + width;
         peri = LxW * 2;
         
         System.out.println("Perimeter: " + peri);
   }
    
    public void print(){
        System.out.print("...HI!!!!!!!!!!");
    }

    public void getLength() {
        System.out.println(length);
    }

    public void getWidth() {
        System.out.println(width);
    }
    
    
}

