/**
 * 
 */
package com.sj.problem;

import com.sj.serviceproviders.Calculator;

/**
 * @author SangeetaJ
 *
 */
public class UserDI {
	Calculator calc;
	
	
        public Calculator getCalc() {
		return calc;
	}


	public void setCalc(Calculator calc) {
		this.calc = calc;
	}


		public void invokeCalcService(){
	    	
        	
        	calc.calculate();
	     	
	    }


		
		
	
	
	

}
