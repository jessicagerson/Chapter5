package Lab2;


public class Probability  implements ProbabilityCalc
{
    double favorable;
    double sampleSpace;
    double prob;
   
    public Probability(double fav, double sampleS)
    {
        // initialise instance variables
        this.favorable = fav;
        this.sampleSpace = sampleS;
        prob = favorable/sampleSpace;
    }
    
    public double probabilityAND(Probability p2) {
        return this.prob * p2.prob;
    }
    
   
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    public double probabilityOR(Probability p2, double overlap) {
        return this.prob + p2.prob - overlap;
    }
    
    


}
