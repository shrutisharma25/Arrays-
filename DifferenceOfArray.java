import java.util.Scanner;
public class DifferenceOfArray {
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
        int diff[]=new int[n2];
        int c=0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;
        while(k>=0)
        {
            int a1v = i >= 0 ? a1[i] : 0;
            int d=0;
            if(a2[j]+c >= a1v)
            {
                d=a2[j]+c - a1v;
            }
            else
            {
                d=a2[j]+c+10 - a1v;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }       
        int idx=0;  
        while(idx < diff.length)
        {
            if(diff[idx]==0)
            {
                idx++;
            }
            else
            {
                break;
            }
        }
        while(idx < diff.length)
        {
            System.out.println(diff[idx]);
        }
    }
}
