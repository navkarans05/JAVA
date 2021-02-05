package practice_pg;
import java.util.*;
//find and display the number of duplicate occurrences of each word,character of a string
public class prac14 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=str.replaceAll("\\s", "");
		char Array1[]=str2.toCharArray();
		for(int i=0;i<Array1.length;i++) {
			int count=0;
			for(int j=0;j<Array1.length;j++) {
				if(Array1[i]==Array1[j] ) {
					count++;
				}
			}
		System.out.println(Array1[i]+" Occurred "+count+" Times");
		}
		String st[]=str.split("\\s");
		for(int i=0;i<st.length;i++) {
			int count=0;
			for(int j=0;j<st.length;j++) {
				 if(st[i].equals(st[j])) {
					 count++;
				 }
			}
			System.out.println(st[i]+" Occurred "+count+" Times");
		}
	}
}
