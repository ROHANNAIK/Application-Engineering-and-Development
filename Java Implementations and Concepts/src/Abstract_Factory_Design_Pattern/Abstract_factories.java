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
public abstract class Abstract_factories {
    abstract AbstractFact_Color getColor (String color);
    abstract AbstractFact_Shape getFact_Shape (String shape);
    
}
