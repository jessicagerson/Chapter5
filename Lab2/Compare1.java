package Lab2;



public class Compare1
{
    // instance variables - replace the example below with your own
    private String s1;
    private String s2;
    private int largest;

    /**
     * Constructor for objects of class Compare1
     */
    public Compare1(String s1, String s2)
    {
        // initialise instance variables
        this.s1 = s1;
        this.s2 = s2;
    }
        public static int largest(String s1, String s2){
            if (s1.compareTo(s2) < 0){
            return -1;
        }
        else if((s1.compareTo(s2) > 0)){
            return 1;
        }
        else {
            return 0;
        }
    
    }
}
