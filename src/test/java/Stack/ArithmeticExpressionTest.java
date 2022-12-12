package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExpressionTest {

    @Test
    public void equation1(){
        assertEquals ( 101.0, new ArithmeticExpression ().evaluate ("( 1+ ((2+3)*(4*5)))"));
    }
    @Test
    public void equation2(){
        assertEquals ( 8, new ArithmeticExpression ().evaluate ("(1+3+4)"));
    }

}