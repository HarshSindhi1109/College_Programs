class pro
{
    int a,b;
    pro(int c, int d)
    {
        a=c;
        b=d;
    }
    pro(pro e)
    {
        a=e.a;
        b=e.b;
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
}
class d1
{
    public static void main(String args[])
    {
        pro e=new pro(2,3);
        pro f=new pro(e);
        e.display();
        f.display();
    }
}