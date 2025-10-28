public class integer {
    int x,y,z;
    integer()
    {
        x=y=z;
        System.out.println("Values of x= "+x+"y= "+y+"z= "+z);

    }
    integer(int a,int b,int c)
    {
        x=a;y=b;z=c;
         System.out.println("Values of x= "+x+"y= "+y+"z= "+z);
    }
    integer(int a)
    {
        x=y=z=a;
         System.out.println("Values of x= "+x+"y= "+y+"z= "+z);
    }
    integer(integer q)
    {
        x=q.x;
        y=q.y;
        z=q.z;
         System.out.println("Values of x= "+x+"y= "+y+"z= "+z);
    }
    public static void main(String []args)
    {
        integer obj1=new integer();
        integer obj2=new integer(10);
        integer obj3= new integer(4,5,6);
        integer obj4= new integer(obj3);
    }
}