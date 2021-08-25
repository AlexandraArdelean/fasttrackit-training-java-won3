package org.fasttrackit.course9_10;

import org.fasttrackit.course5_6hw.Tema1.Student;
import org.fasttrackit.course5_6hw.Tema1.StudentType;

public class ExceptionDemonstrator {
    private static final HumanRepository<Student> studentRepository = new HumanRepository<>();

    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Marius", "Pop", "24.03.2000",
                "01.10.2018", "UBB", "Contabilitate", StudentType.PHD, "01");

        Student s2 = new Student("Marius", "Bojor", "12.08.1991",
                "01.10.2010", "UTCN", "Info", StudentType.BACHELOR, "02");


        studentRepository.add(s1);
        studentRepository.add(s2);


        try {
            studentRepository.deleteById("10");

        } catch (EntityNotFoundException e) {
            System.err.println(e);
        }

        try {
            studentRepository.updateById("1", s2);

        } catch (EntityNotFoundException e) {
            System.err.println(e);
        } catch (ValidationException ve) {
            System.err.println(ve);
        }

        try {
            studentRepository.add(null);
        } catch (ValidationException ve) {
            System.err.println(ve);
        }


        try {
            studentRepository.getAllByName(null);
        } catch (ValidationException ve) {
            System.err.println(ve);
        }


    }
}
