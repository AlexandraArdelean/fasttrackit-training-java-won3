package course4;

public class Main {
    public static void main(String[] args) {
        // n factorial
        LogicalOp op = new LogicalOp();
        System.out.println("N factorial al numarului 6 este: " + op.calculateNFact(6));

        // numar prim
        op.primeNum(11);

        // palindrom

        op.palindromeNum(121);


    }
}


