/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

/**
 *
 * @author Rohan
 */
public class Factory_Pattern_Main {
    
        public static void main(String[] args) {
            
            /*Shape s = new Rectangle();
            s.draw();*/
      Factory_Pattern fact_pattrn = new Factory_Pattern();
        
        Shape shape1 = fact_pattrn.getShape("Rectangle");
        shape1.draw();
        
        Shape shape2 = fact_pattrn.getShape("Square");
        shape2.draw();
   
    }
    
}
