import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements of 1st array-->");
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        System.out.println("Enter the elements of an array:-");
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of elements of 2nd array-->");
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        System.out.println("Enter the elements of an array:-");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=sc.nextInt();
        }
        sc.close();
        int sum[]=new int[n1>n2?n1:n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;
        int c=0;
        while(k>=0)
        {
            int d=c;
            if(i>=0)
            {
                d+=a1[i];
            }
            if(j>=0)
            {
                d+=a2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;
            i--; 
            j--;
            k--;
        }
        if(c!=0)
        {
            System.out.print(c);
        }
        for(int val:sum)
        {
            System.out.print(" "+val);
        }


    }
}
