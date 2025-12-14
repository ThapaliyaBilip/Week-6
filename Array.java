
public class Array
{
    public static void main (String[] args)
    {
        int[] age;
        age = new int[5];
        
        
        System.out.println(age.length);
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int firstElement= age[0];
        System.out.println(firstElement);
        int [] agr={1,2,3};//this one if when u need to pass the value in 1 line it self
        int start =0;
        int end=agr.length-1;
        int max =0;
        for (int i=start; i<=end; i++)
        {
            System.out.println(agr[i]);
            if(agr[i] > max){
                max= agr[i];
            }
            else
            {
                System.out.println("This is the max");
            }
        }
        
       // int[] arp={};
        
       // for (int i=end; i>=0; i--)
        //{
         //   System.out.println(agr[i]);
           // agr[i]=  arp[i];
            
       // }
        
        int [][] jump={{1,2,3},{2,3,4},{5,6,7}};  
        for(int i=0;i<=2;i++)
        {
            for(int j=0; i<-jump[i].length-1;i++)
            {
                System.out.print(jump[i][j]);
            }
            System.out.print("\n");
        }
        
        System.out.println (jump[1][0]);
        System.out.println (jump[1][1]);
        System.out.println (jump[1][2]);
        
           
        
        
        
        
    }
}