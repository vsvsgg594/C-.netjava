package BuiltinData;
import java.math.BigDecimal;

public class Q3 {
    public static void main(String[] args) {
        // Example float value
        float floatValue = 123.456f;
        
        // Convert float to BigDecimal
        BigDecimal decimalValue = new BigDecimal(Float.toString(floatValue));
        
        // Print the BigDecimal value
        System.out.println("BigDecimal value: " + decimalValue);
    }
}
