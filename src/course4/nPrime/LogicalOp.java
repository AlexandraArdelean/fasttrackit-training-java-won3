package course4.nPrime;

public class LogicalOp {



    // prime number
    public void primeNum (int n) {
        int nr = 0;
        int d = 1;
        while (d <= n){
            if (n % d ==0){
                nr++;

            }
            d++;
        }
        if (nr == 2){
            System.out.println("Numarul " + n + " este prim");

        }
        else {
            System.out.println("Numarul " + n + " nu este prim");
        }


    }




}