
/**
 * 
 */
package com.madhu.sweets;

/**
 * @author madhu
 *
 */
public class DairyMilk extends Sweet{
	public DairyMilk() {
		setSweetness(0);
		setWeight(0);
	}
	public DairyMilk(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}