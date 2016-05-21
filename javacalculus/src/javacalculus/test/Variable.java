package javacalculus.test;

import javacalculus.struct.CalcFunction;

/**
 * Created by anjeo on 4/15/2016.
 */
public class Variable {
    public Double value;
    public CalcFunction derivative;
    public String derivativeName;
    public Variable(Double next) {
        value  = next;
    }
}
