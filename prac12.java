package practice_pg;
import java.util.*;
//sum and avg of array elements 
public class prac12 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int Array1[]= {4,3,5,2,7,9};
		int sum1=0;
		float avg;
		for(int i=0;i<Array1.length;i++) {
			sum1+=Array1[i];
		}
		avg=sum1/(Array1.length);
		System.out.println("Sum is "+sum1+" Average is "+avg);
	}

}
