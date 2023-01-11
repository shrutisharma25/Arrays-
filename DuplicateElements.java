class DuplicateElements
{
    public static void main(String args[])
    {
        int a[]={5,4,8,7,9,2,7,5,2,4,8};
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}