class mobile{
   private  String brand="Apple";
  private  int price=10000;
    
    public void getmob()
    {
        
        System.out.println(brand+":"+price);
    }

}

public class string {
    public static void main(String[]args)
    {
        mobile m1=new mobile();
        mobile m2=new mobile();
        m1.getmob();
    }
    
}
