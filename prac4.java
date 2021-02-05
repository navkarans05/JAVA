package practice_pg;
import java.util.*;
public class prac4 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		int pos=1;
		int a[]=new int[l];
		char x[]=new char[l];
		for(int i=0;i<l;i++) {
			x[i]=str.charAt(i);
		}
		for(int i=0;i<l;i++) {
			int count=1;
			for(int j=i+1;j<l;j++) {
				if(x[i]==x[j]) {
					count++;
				}
				a[i]=count;
			}
			
		}
		int max=a[0];
		
		for(int i=0;i<l;i++) {
			if(a[i]>max) {
				max=a[i];
				pos=a[i];
			}
		}
		System.out.println(x[pos]);
		
	}

}
