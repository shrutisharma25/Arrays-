class max
{
    public static void main(String[] args) {
        int a=6,b=2,c=4;
        int min=0;
        min = a<=b && b<=c? a<b?a:b : b<c?b:c;
        int max=0;
        max=a>=b? a>=c?a:c : b>=c?b:c;
        System.out.println(max+" "+min);
    }
}