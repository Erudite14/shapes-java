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
public class SHAPES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       shape[] shapeArray = new shape[7];
        
       shapeArray[0] = new ellipse();
       shapeArray[1] = new circle(); 
       shapeArray[2] = new rectangle();
       shapeArray[3] = new square();
       
       shapeArray[4] = new shape();
       
       System.out.println("The length is: ");
       shapeArray[4].getLength();
       System.out.println("");
       System.out.println("The width is: ");
       shapeArray[4].getWidth();
       System.out.println("");
       
       shapeArray[0].shapeName();
       //shapeArray[0].getLength();
       //shapeArray[0].getWidth();
       shapeArray[0].getArea();
       shapeArray[0].getPeri();
       System.out.println("-------------------------------------------");
       shapeArray[1].shapeName();
       shapeArray[1].getArea();
       shapeArray[1].getPeri();
       System.out.println("-------------------------------------------");
       shapeArray[2].shapeName();
       shapeArray[2].getArea();
       shapeArray[2].getPeri();
       System.out.println("-------------------------------------------");
       shapeArray[3].shapeName();
       shapeArray[3].getArea();
       shapeArray[3].getPeri();
       
       
       //System.out.println(C1.length);
       //System.out.println(R1.length);
       //System.out.println(S1.length);
       
       
    
    
    
    //System.out.println(E1.brand);
    }
    
}
