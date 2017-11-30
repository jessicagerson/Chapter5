package Lab2;



public class Compare3
{
    // instance variables - replace the example below with your own
    
    
            public static int largest(Comparable s1, Comparable s2){
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

