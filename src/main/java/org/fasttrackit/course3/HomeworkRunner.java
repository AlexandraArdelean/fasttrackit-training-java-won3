package main.java.org.fasttrackit.course3;
import org.fasttrackit.course3.model.Car;


public class HomeworkRunner {


    public static void main(String[] args) {

        org.fasttrackit.course3.Professor professor = new org.fasttrackit.course3.Professor();

        professor.setFirstName("Pop");
        professor.setLastName("Ciprian");
        professor.setDateOfBirth("Nascut in 10.05.1969");
        professor.setEmailAdress("Are adresa de email: popciprian@gmail.com");
        professor.setAreLicenta("Si-a luat licenta in anul 1989");
        professor.setDateOfHiring("S-a angajat in data de 01.01.1990");


        System.out.println(professor.getFirstName() + " " + professor.getLastName());
        System.out.println(professor.getDateOfBirth());
        System.out.println(professor.getEmailAdress());
        System.out.println(professor.getAreLicenta());
        System.out.println(professor.getDateOfHiring());
        System.out.println("Si lucreaza ca profesor de matematica la liceul Gheorghe Sincai Baia Mare");






    }
}
