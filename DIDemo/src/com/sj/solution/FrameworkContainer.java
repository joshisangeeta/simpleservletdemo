/**
 * 
 */
package com.sj.solution;

import com.sj.serviceproviders.Calculator;

/**
 * @author HP
 *
 */
public class FrameworkContainer {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

	        
	      Calculator c1 =   (Calculator) Class.forName(args[0]).newInstance();
	   
	      Printer p1 = (Printer) Class.forName(args[1]).newInstance();
	      
	      NewUser u1 = new NewUser();
	      
	      u1.setCalc(c1);
	      u1.setPrinter(p1);
	      
	      u1.invokeCalc();
	      u1.invokePrint();
	      
	         
	
	   
	
	}

}
