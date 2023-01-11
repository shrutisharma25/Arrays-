import java.util.Scanner;
class span
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array:-");
		int n=sc.nextInt();
		int a[]=new int[n];
        System.out.println("Enter the elements of an array-->");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        sc.close();
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		int span =max-min;
		System.out.println("Span:-"+span);
	}
}