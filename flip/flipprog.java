package flip;

public class flipprog {
	
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
  
   
    public static void main(String args[])
    {
            String str1 = "apple";
            System.out.println(str1);
            System.out.println(leftrotate(str1, 2));
 
           
    }
}
