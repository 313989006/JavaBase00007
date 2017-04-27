package com.ddb.javacore.ood2;

public class CalAvg {
	public double calAvg(int[] scores){
		int sum=0;
		double avg =0.0;
		for (int i = 0; i < scores.length; i++) {
			sum = scores[i];
		}
		avg= (double)sum/scores.length;
		return avg;
	}
	public int calMax(int[] scores){
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (max<scores[i]) {
				max =scores[i];
			} 
		}
		return max;
	}
}
