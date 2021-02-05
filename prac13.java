package practice_pg;
import java.util.*;
public class prac13 {
	public static void main(String [] args) {
		int Array1[]={2,4,5,3,56,78,32},temp;
		int l=Array1.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l-i;j++) {
				if(Array1[j]>Array1[i]) {
				temp=Array1[i];
				Array1[i]=Array1[j];
				Array1[j]=temp;
				}
			}
		}
		for(int i=0;i<l;i++) {
			System.out.println(Array1[i]);
		}
	}

}
