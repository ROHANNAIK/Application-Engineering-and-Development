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
public class ShapeFactory extends Abstract_factories{

    @Override
    public AbstractFact_Shape getFact_Shape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle"))
        {
            return new Abs_Rectangle();
        }
        else if (shape.equalsIgnoreCase("Square"))
        {
            return new Abs_Square();
        }
        return null;
    }

    @Override
    AbstractFact_Color getColor(String Color)
    {
        return null;
    }
}
