package practice_pg;
import java.util.*;
public class prac9 {
	public static void main(String [] args) {
		//reverse a string
		String st="navkaran singh";
		int l=st.length()-1;
		char Array1[]=st.toCharArray();
		char Array2[]=new char[l+1];
		for(int i=0;i<=l;i++) {
			Array2[i]=Array1[l-i];	
		}
		String str=String.valueOf(Array2);
		System.out.println(str);
	}

}
