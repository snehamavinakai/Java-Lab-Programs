//(5).Demonstrate String Methods.

import java.lang.*;
class StringOperations
{
	public static void main(String[] args) 
	{
	String s1 = "Kle Bca";
	String s2 = "College";
	System.out.println("Length :: "+s1.length());
	System.out.println("Uppercase :: "+s1.toUpperCase());
	System.out.println("Concatination :: "+s1.concat(s2));
	System.out.println("Char At :: "+s1.charAt(2));
	System.out.println("Equals :: "+s1.equals(s2));
	System.out.println("Substring :: "+s1.substring(3));
	System.out.println("Substring :: "+s1.substring(3,6));
	System.out.println("Replace :: "+s1.replace('c','b'));
	System.out.println("Index of :: "+s2.indexOf('l'));
	char a[] = s2.toCharArray();
	  for(int i=0;i<a.length;i++)
	  {
		System.out.println(a[i]);
	  }
    }
}