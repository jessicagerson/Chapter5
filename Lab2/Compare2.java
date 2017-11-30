package Lab2;



public class Compare2
{
    // instance variables - replace the example below with your own
    
    private int i1;
    private int i2;
    
    /**
     * Constructor for objects of class Compare2
     */
    public Compare2(int i1, int i2)
    {
        // initialise instance variables
        this.i1 = i1;
        this.i2 = i2;
    }
    public static int largest(int i1, int i2){
                    if (i1.compareTo(i2) < 0){
            return -1;
        }
        else if((i1.compareTo(i2) > 0)){
            return 1;
        }
        else {
            return 0;
        }
    
    }
    }
 

