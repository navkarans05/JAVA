package practice_pg;
import java.util.*;
public class prac2 {
	public static void main(String [] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int l=str.length();
		char st[]=new char[l];
		for(int i=0;i<l;i++) {
			st[i]=str.charAt(i);
		}
		for(int i=0;i<l;i++) {
			System.out.println(st[i]);
		}
		
	}

}
