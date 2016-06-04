package javacalculus;

import javacalculus.core.CalculusEngine;
import javacalculus.struct.CalcFunction;
import javacalculus.test.FunctionDef;
import javacalculus.test.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by anjeo on 2/12/2016.
 */
public class uncertainityCalculuator {
    protected CalculusEngine engine;
    public static void main(String [] args){
      /* CalculusEngine engine = new CalculusEngine();
        // CalcFunction function1 = engine.derivative("DIFF(ln(x),x)");
        CalcFunction function2 = engine.derivative("DIFF(SIN(x)*y,y)");
        // String result = engine.executae(QUERY);
       // CalcFunctionEvaluator evaluate= y.getEvaluator();
        System.out.println(function2);
            Scanner y = new Scanner(System.in);
           // CalcFunction f = engine.derivative("DIFF(SIN(x*y),x)");
        System.out.println("what is the function name?");
            String name = y.nextLine();
            uncertainityCalculuator test = new uncertainityCalculuator();
           FunctionDef function = new FunctionDef(name,null);
           // System.out.println("The derivative is:");
            HashMap<String,Variable> vars = function.getVariables();
           HashMap<String,Variable> temp = new HashMap<String,Variable>();
          for(String value : vars.keySet()){
                System.out.println("What is the value of "+ value);
                Double next = y.nextDouble();
                temp.put(value,new Variable(next));
           }
           function.setVariables(temp);
        ArrayList<Double>  numerical = function.derivateCalculator();
        int i = 0;
        for(String value : vars.keySet()){
               // System.out.println("the derivative with respect to: "+value+" is "+vars.get(value).derivativeName);
            //double exact = function.recursiveEvaluate(vars.get(value).derivative);
           // System.out.println("Evaluated at the given points is: "+exact);
            System.out.println("Numerical Derivative evaluted with respect to: "+value+" is "+numerical.get(i));
           // System.out.println("Numerical Derivative Vs Exact "+value+" is "+(numerical.get(i)-exact)*100/exact + "%");
            System.out.println("Evaluated at the given points is: "+function.recursiveEvaluate(function.function));

            i++;
            }*/


        }
    public static Variable calculateUncertainity(String functionName, HashMap<String,Variable> value){
        Variable result = new Variable(new Double(0));
        FunctionDef function = new FunctionDef(functionName,value);
        double uncertain = 0;
        ArrayList<Double>  numerical = function.derivateCalculator();
        for(Double d : numerical){
            uncertain += d*d;
        }
        uncertain = Math.pow(uncertain,1/2);

        result.value = function.recursiveEvaluate(function.function);
        result.uncertain = uncertain;
        return result;
    }

    }




