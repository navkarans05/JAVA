package practice_pg;
import java.util.*;
public class prac10 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char Array1[]=st.toCharArray();
		int l=st.length();
		char temp;
		temp=Array1[0];
		Array1[0]=Array1[l-1];
		Array1[l-1]=temp;
		String ans=String.valueOf(Array1);
		System.out.println(ans);
	}

}
