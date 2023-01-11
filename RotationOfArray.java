import java.util.*;
class RotationOfArray
{
    public static void check(int arr[],int r)
    {
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=r;i<arr.length;i++)
        {
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<r;i++)
        {
            temp[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements of an array-->");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements of an array:-");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the position from which elements have to be rotated to the left:-");
        int rotate=sc.nextInt();
        check(array,rotate);
    }
}