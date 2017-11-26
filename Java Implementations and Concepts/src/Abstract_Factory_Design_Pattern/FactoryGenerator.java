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
public class FactoryGenerator {
    
    public static Abstract_factories getAbstract_factories(String Choice)
    {
        if(Choice.equalsIgnoreCase("SHAPE"))
        {
            return new ShapeFactory();
        }
        else if (Choice.equalsIgnoreCase("COLOR"))
        {
            return new ColorFactory();
        }
        return null;
    }
    
}
