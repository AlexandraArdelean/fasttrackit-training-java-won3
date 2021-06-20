package course4.nFactorial;

public class LogicalOp {

    public long calculateNFact (int n)
    {
        long fact = 1;
        for (int i = 2; i <=n ; i++) {
        fact = fact * i;
        }
        return fact;
    }

}
