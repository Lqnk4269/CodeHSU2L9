// Integer and Double are in
// java.lang package


import java.lang.*;

public class DoubleExamples
{
    public static void main(String[] args)
    {
        // Explictly create a Double
        Double d = new Double(0.0);
        
        // Use autoboxing to have
        // Java convert the double value
        // to an Double object
        Double e = 0.1;
        
        
        // Can use Doubles exactly like
        // you can use doubles because
        // of autoboxing
        System.out.println(d + e);
        
        // Can also use the doubleValue value
        // to get the underlying double
        
        double f = d.doubleValue();
        
        // One instance where unboxing doesn't work
        // is when converting from a double to an int
        int g = e;
        
        
        
    }
}