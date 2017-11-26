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
public class ColorFactory extends Abstract_factories{
    
     @Override
    public AbstractFact_Color getColor(String color) {
       if (color.equalsIgnoreCase("Red"))
        {
            return new Abs_Red();
        }
        else if (color.equalsIgnoreCase("Green"))
        {
            return new Abs_Green();
        }
        return null;
    }
    
    @Override
    AbstractFact_Shape getFact_Shape (String shape)
    {
        return null;
    }
    
}
