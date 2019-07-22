package vasanth;
import java.util.*;
import java.util.Scanner;

public class encodedarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] s1=sc.nextLine().split(",");
		int[] a=new int[s1.length];
		int i = 0;
		for(String j:s1)
		{
		    a[i++]=Integer.parseInt(j);
		}
		for(i=0;i<s1.length-1;i++)
		{
			 a[i] = a[i] + a[i+1];
		}
		String b=Arrays.toString(a);
		System.out.println(b);
		
	}
