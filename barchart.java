import java.util.Scanner;
class barchart
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of element of an array:-");
        int n=sc.nextInt();
        System.out.println("Enter the element of an array-->");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int floor=max;floor>=1;floor--)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}