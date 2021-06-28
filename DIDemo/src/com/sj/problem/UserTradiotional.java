/**
 * 
 */
package com.sj.problem;

import com.sj.serviceproviders.CalcA;
import com.sj.serviceproviders.CalcB;
import com.sj.serviceproviders.Calculator;

/**
 * @author SangeetaJ
 *
 */
public class UserTradiotional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using service 'A'

		Calculator calc = new CalcB();

		calc.calculate();

	}

}
