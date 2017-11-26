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
public class AbstractFactoryDesign_Main {
    
    public static void main(String[] args) {
        
        Abstract_factories shapefact = FactoryGenerator.getAbstract_factories("SHAPE");
        
        AbstractFact_Shape shape1 = shapefact.getFact_Shape("Rectangle");
        shape1.draw();
        
        AbstractFact_Shape shape2 = shapefact.getFact_Shape("Square");
        shape2.draw();
        
        Abstract_factories colorfact = FactoryGenerator.getAbstract_factories("COLOR");
        
        AbstractFact_Color color1 = colorfact.getColor("Red");
        color1.fill();
        
        AbstractFact_Color color2 = colorfact.getColor("Green");
        color2.fill();
        
    }
    
}
