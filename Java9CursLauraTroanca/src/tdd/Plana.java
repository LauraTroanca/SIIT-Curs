/*
 * Class Plana
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class Plana extends FiguraGeometrica{
    
    public static final String PLANA =" plane";
    
    @Override
    public String getDefinition() {
        String definition = super.O+PLANA+super.FIGURA;
        return definition;
    }
    
}
