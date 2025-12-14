import java.util.Scanner;

public class StaticArray
{
    public static void main(String[] args)
    {
         String[] name={"Saroj", "Sushant","Ujjwal", "Rabina", "Sandes"};
         
         for(int i=0;i<5;i++)
         {
             System.out.println(""+name[i]);
             
            }
            Scanner input= new Scanner(System.in);
            System.out.println("Ask for Index between 0-4");
            int no=input.nextInt();
            input.nextLine();
            
                
             
        
    }
}