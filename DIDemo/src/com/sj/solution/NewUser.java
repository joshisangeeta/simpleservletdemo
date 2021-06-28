/**
 * 
 */
package com.sj.solution;

import com.sj.serviceproviders.CalcA;
import com.sj.serviceproviders.Calculator;

/**
 * @author SangeetaJ
 *
 */
public class NewUser {
     Calculator calc;
     Printer printer;
     
    public void invokeCalc() {
    	//Calculator calc = new CalcA();
    	calc.calculate();
    }
	public Calculator getCalc() {
		return calc;
	}
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	public Printer getP() {
		return printer;
	}
	
	public void setPrinter(Printer p) {
		// TODO Auto-generated method stub
		this.printer = p;
	}
	
	public void invokePrint() {
		printer.print();
	}
	

}
