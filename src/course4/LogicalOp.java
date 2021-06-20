package course4;

public class LogicalOp {

// metoda pentru n factorial

    public long calculateNFact (int n)
    {
        long fact = 1;
        for (int i = 2; i <=n ; i++) {
        fact = fact * i;
        }
        return fact;
    }


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

    // palindrome number

    public void palindromeNum(int n){
        int rev = 0;
        int temp = n;
        while (temp>0){
            rev = rev*10;
            rev = rev + temp%10;
            temp = temp/10;
        }
        if (n == rev){
            System.out.println(" Numarul " + n + " este un palindrom");
        }
        else{
            System.out.println("Numarul "+ n + " nu este un palindrom");
        }
    }


}
