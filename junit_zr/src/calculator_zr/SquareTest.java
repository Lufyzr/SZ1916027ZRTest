package calculator_zr;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import  org.junit.runners.Parameterized.Parameters;

import  java.util.Arrays;
import  java.util.Collection;


@RunWith(Parameterized.class)
public class SquareTest {

	  private static Calculator calculator = new Calculator();
	     private int  param;
	     private int  result;

	    @Parameters
	    public static Collection data()  {

	         return  Arrays.asList( new  Object[][] {
	                 { 4 ,  16 } ,
	                 { 0 ,  0 } ,
	                 {-2 ,  4 } ,

	        });
	    }
		// 构造函数，对变量进行初始化
	     public SquareTest(int param,int result)  {
	         this.param = param;
	         this.result= result;
	    }
	     
	    @Test
	    public void square(){
	        calculator.square(param);
	        assertEquals(result, calculator.getResult());
	    }


}
