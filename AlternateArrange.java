import java.util.*;
class AlternateArrange
{
    public static void main(String args[])
    {
        int a[]={2,4,6,8,10};
        int temp[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length/2;i++)
        {
            int max=a[i],min=a[i];
            for(int j=i;j<a.length-i;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                }
                if(min>a[j])
                {
                    min=a[j];
                }
            }
            temp[k]=max;
            temp[k+1]=min;
            k=k+2;
        }
        if(a.length%2==0)
        {
           System.out.println(Arrays.toString(temp));
        }
        else
        {
            temp[temp.length-1]=a[(a.length/2)];
            System.out.println(Arrays.toString(temp));
        }
    }
}