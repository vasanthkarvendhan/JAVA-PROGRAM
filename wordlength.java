package vasanth;
import java.util.*;
public class wordlength {
	static int sumofdigits(int n)
	  {
		int rem = 0,t = 0;
		while(n!=0)
		{
			rem = n%10;
			t += rem;
			n = n/10;
		}
		if(t>9)
		{
			t = sumofdigits(t);
		}
		return t;
		}
	  
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	  String[] s1=sc.nextLine().split(" ");
	  String s="";
	  int len;
	  for(String i : s1)
	  {
		  len = i.length();
		  if(len>9)
		  {
			 len =sumofdigits(len); 
		  }
		  s +=len+"";
	  }
      System.out.println(s);

	 
	}

}
