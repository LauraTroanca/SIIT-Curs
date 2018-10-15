/*
 * Program for age validation with CUSTOM EXCEPTION
 */
package exceptions;

/**
 *
 * @author Troanca
 */
public class ValidationException extends Exception {

    /**
     * @param message
     */
    
    public ValidationException(String message) {
    super(message);
    }
    
    static int parseAge(String age) throws ValidationException {
        
    int value;
    try {
    value = Integer.parseInt(age);
    }catch (NumberFormatException e){
    throw new ValidationException("should be an int");
    }
    if(value < 0 || value > 150) {
    throw new ValidationException("should be between 0 and 150 inclusive");
    }
    return value;
    }

    public static void main(String[] args) {
        try {
        int age = parseAge(args[0]);
        } catch (ValidationException e) {
        System.out.println("Invalid age argument: " + e.getMessage());
    }
    
}
}