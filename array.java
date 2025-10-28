import java.util.Scanner;
public class array 
{
     static int arr[][]=new int[2][];
    //  arr[0]=new int[2];
    //   arr[1]=new int[3];
    public static void main(String[] args)
    {
        //Scanner sc= new Scanner(System.in);
        arr[0]=new int[2];
      arr[1]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
              for(int j=0;j<arr[i].length;j++)
              {
                 arr[i][j]= (int)(Math.random()*100);
              }
         }
    //     for(int i=0;i<5;i++)
    //     {
    //        for(int j=0;j<2;j++)
    //     {
    //         System.out.print(arr[i][j]+" ");
    //     }
    //      System.out.println( " " );
        
    // }
    for(int n[]:arr)
        {
           for(int m:n)
        {
            System.out.print( m+" ");
        }
         System.out.println(  );
    }
    
}
}
