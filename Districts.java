import java.util.Scanner;

public class Districts
{
     public static void main(String[] args)
    {
            String [] districts= {"Morang" , "Kathmandu","Kaski", "Sindhuli"};
            
           
        
      
        for (int i = 0; i < districts.length; i++) 
        {
            System.out.println(" "+districts[i]) ;
        
        }
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        
        }
       
            Scanner input= new Scanner(System.in);
            System.out.println("Ask for Index between 0-4");
            int no=input.nextInt();
            for(int i=0; i<+no;i++)
            {
                 System.out.println((i + 1) + ". " + districts[i]);
            }
    }
}