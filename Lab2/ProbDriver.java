package Lab2;



public class ProbDriver
{
    public static void main(String[] args) {
        Probability p1 = new Probability(4, 15); //blue marble
        Probability p2 = new Probability(6, 15); //red marble
        
        //Prob of first blue and second red with replacement
        System.out.println(p1.probabilityAND(p2));
        
        System.out.println(p1.probabilityOR(p2, 0));
    }
}
