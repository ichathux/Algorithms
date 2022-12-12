package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ArithmeticExpression {
    public double evaluate(String equation){
        HashMap<Integer, Integer> map = new HashMap<> ();


        Stack<Character> ops = new Stack<> ();
        Stack<Double> vals = new Stack<> ();
        char[] arr = equation.toCharArray ();
        System.out.println (Arrays.toString (arr));
        for (int i = 0; i < arr.length; i++){
            switch (arr[i]){
                case ' ':
                case '(':
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    ops.push (arr[i]) ;
                    break;
                case ')':
                    Character op = ops.pop ();
                    double v = vals.pop ();
                    System.out.println ("v(1) -> "+v);
                    v = getV (vals , op , v);
                    System.out.println ("v(2) -> "+v);
                    vals.push (v);
                    break;
                default:
                    vals.push (Double.parseDouble (arr[i]+""));
                    System.out.println ("vals -> "+vals);
            }
        }
        return vals.pop ();
     }

    private double getV(Stack<Double> vals , Character op , double v) {
        switch (op){
            case '+':
                v = vals.pop ()+ v;
                break;
            case '-':
                v = vals.pop ()- v;
                break;
            case '*':
                v = vals.pop ()* v;
                break;
            case '/':
                v = vals.pop ()/ v;
                break;
        }
        return v;
    }
}
