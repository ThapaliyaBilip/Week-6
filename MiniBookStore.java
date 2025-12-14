
public class MiniBookStore
{
     public static void main(String[] args)
    {
    String[] categories = {"Fiction", "Nepali"};
    String[][] titles = new String[2][1];
    double[][] prices = new double[2][1];
    
    
    titles [0][0] = "The oddesy";
    prices [0][0] = 1500;
    titles [1][0]= "Muna Madhan";
    prices [1][0]= 400;
        
     System.out.println("--- Book Corner Inventory ---");                                                                                                 
       for (int i = 0; i < categories.length; i++) {                                                                                                        
                                                                                                                                                                                                                                                                        
        System.out.println("\nCategory: " + categories[i]);                                                                                                   
        if (titles[i][0]!=null)
           {
            System.out.println(" Title"+titles[i][0]);
            }  
        else
        {
            System.out.println("\n no title");
        }
        
            System.out.println("Price:"+prices [i][0]);                                                                                                          
        }                                                    
    }
}