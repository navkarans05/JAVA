package practice_pg;
import java.util.*;
public class prac3 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str=str1.toLowerCase();
	int count=0,count2=0;
	int l=str.length();
	char x[]=new char[l];
	for(int i=0;i<l;i++) {
		x[i]=str.charAt(i);		
			}
	for(int i=0;i<l;i++) {
		if( x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u' ) {
			count++;
		}
		else {
			count2++;
		}
		
	}
	System.out.println("Vowels:"+count);
	System.out.println("Consonants"+count2);
}		
}
