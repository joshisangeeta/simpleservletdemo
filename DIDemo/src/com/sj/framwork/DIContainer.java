/**
 * 
 */
package com.sj.framwork;

import com.sj.problem.UserDI;
import com.sj.serviceproviders.Calculator;

/**
 * @author SangeetaJ
 *
 */
public class DIContainer {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

	        Calculator calc = (Calculator) Class.forName(args[0]).newInstance();
	
	
	        UserDI user1 = new UserDI();
	        
	        user1.setCalc(calc);
	           
	           
	        user1.invokeCalcService();
	
	
	}

}
