package course5.cCount_vCount;

public class Main {
    public void switchCount(String count){

    int vCount = 0, cCount = 0;
    String str = "publicitate"; //declarare string
    str = str.toLowerCase(); // transformam literele mari in litere mici

            switch (count) {
        case "vocals":
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u') //cautam vocalele
                {
                    vCount++;

                }
            System.out.println("Nr. vocale este: " + vCount);
                break;


        case "cons":

            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                        && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                    cCount++;
                }

                        System.out.println("Nr. consoane este: " + cCount);
}


            }
}





