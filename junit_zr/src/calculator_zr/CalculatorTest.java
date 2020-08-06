package calculator_zr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import calculator_zr.Calculator;

public class CalculatorTest {

	 private static Calculator calculator = new Calculator();
	    
	    @Before//�̶�����Σ����κ�һ������ִ��֮ǰ����ִ�д����Σ�
	    public void setUp() throws Exception {
	        calculator.clear();
	    }

	    @Test
	    public void testAdd() {
	        calculator.add(3);
	        calculator.add(4);
	        assertEquals(7, calculator.getResult());
	    }

	    @Test
	    public void testSubstract() {
	        calculator.add(8);
	        calculator.substract(2);
	        assertEquals(6, calculator.getResult());
	    }

	    @Ignore("Multiply() Not yet implemented")//����ĳЩδ��ɵķ���
 	    @Test
	    public void testMultiply() {
	    }

	    @Test
	    public void testDivide() {
	        calculator.add(6);
	        calculator.divide(2);
	        assertEquals(3, calculator.getResult());
	    }
	    
	    @Test(expected=ArithmeticException.class )//�����쳣
	    public void divideByZero()  {
	    	calculator.divide( 0 ); 
	    }

	    
	    @Test(timeout=1000 )//��ƽ�����Ǹ���ѭ�������Ʋ���ʱ��
	    public void squareRoot()  {
	    	calculator.squareRoot( 9 );
	    }

}
