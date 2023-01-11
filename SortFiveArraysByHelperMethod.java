import java.util.*;
class SortFiveArraysByHelperMethod
{
    public static void main(String args[])
    {
        int a1[]={4,6,3,6,5,2,4};
        int a2[]={4,7,2,4,4,3,2,1};
        int a3[]={4,6,3,6,4,3,2,8,4};
        int a4[]={4,2,9,7,8};
        int a5[]={4,9,4,8,0,3,1,2};

        Object[] obj = {a1, a2, a3, a4, a5};
        
        for(int i=0;i<obj.length;i++)
        {
             sort(obj[i]);
        }
        
        for(int i=0;i<obj.length;i++)
        {
             traverse(obj[i]);
        }
        sort(a1);
        sort(a2);
        sort(a3);
        sort(a4);
        sort(a5);

        traverse(a1);
        traverse(a2);
        traverse(a3);
        traverse(a4);
        traverse(a5);        
    }
    public static void traverse(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}