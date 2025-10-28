import java.util.Scanner;

class main
{
    public static void main(String args[]) 
    {
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter operand 1:");
      int n1= sc.nextInt();
      System.out.println("Enter operand 2:");
      int n2= sc.nextInt();
      sc.nextLine();
      for(;;)
 {
      System.out.println("Enter operator:");
      String op= sc.nextLine();
      switch(op)
      {
        case "+":System.out.println(n1+n2);
                 break;
        case "-":System.out.println(n1-n2);
                 break;         
        case "*":System.out.println(n1*n2);
                 break;
        case "/":System.out.println(n1/n2);
                 break;
        case "exit":System.out.println("exiting...");
                  System.exit(0);
                 break;         
        default: System.out.println("Invalid operator");
                       

      }
     // if( op.equals("exit"))
      //{
      //  break;
      //}
    }
     

    }
}