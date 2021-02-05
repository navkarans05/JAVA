package practice_pg;
import java.util.*;
public class prac11 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str[]=st.split("\\s");
		int l=str.length;
		System.out.println(l);
		String str2[]=new String[l];
		System.out.println(str2.length);
		for(int i=0;i<l;i++) {
			str2[i]=str[l-i];
		}
		for(int i=0;i<str2.length;i++) {
			System.out.println(str2[i]);
		}
		
		
		
	}
}
