//(3).Sort n elements using an array.

import java.util.*;
class SortOrder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("");

         System.out.print("After Sorting elements in Ascending order: ");
         for(int i=0;i<n;i++)
         {
         	System.out.print(" "+a[i]);
         }

         System.out.println("");

         System.out.print("After Sorting elements in Descending order: ");
         for(int i=n-1;i>=0;i--)
         {
         	System.out.print(" "+a[i]);
         }

	}
}