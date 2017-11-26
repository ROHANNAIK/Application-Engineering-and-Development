/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Factory_Design_Pattern;

/**
 *
 * @author Rohan
 */
public class Abs_Red implements AbstractFact_Color{
    
    @Override
    public void fill()
    {
        System.out.println("Inside Red:: fill() method implementation2");
    }
}
