package course9;

import course5_6hw.Tema1.*;

public class HumanService {

    /* 3.Create a HumanService class, having 2 HumanRepository fields:
HumanRepository<Student> studentRepository
HumanRepository<Professor> professorRepository
Have a main method in the HumanService where you:
3.1. Add 4 objects inside each repository
3.2. Print all to System console
3.3. Modify 2 objects inside each repository
3.3. Print all to System console again, to show modified values
3.4. Delete 2 objects inside each repository (1 that was modified, 1 that wasn’t)
3.5. Print all to System console again
3.6. Print a single element from each repository, retrieved by its name field (show getAllByName works)*/

    private static final HumanRepository<Student> studentRepository = new HumanRepository<>();
    private static final HumanRepository<Professor> professorRepository = new HumanRepository<>();

    public static void main(String[] args) {

        Student s1 = new Student("Marius", "Pop", "24.03.2000",
                "01.10.2018", "UBB", "Contabilitate", StudentType.PHD, "01");
        Student s2 = new Student("Marius", "Bojor", "12.08.1991",
                "01.10.2010", "UTCN", "Info", StudentType.BACHELOR, "02");
        Student s3 = new Student("Andrei", "Ardelean", "04.09.1994",
                "01.10.2013", "UBB0", "Info", StudentType.PHD, "03");
        Student s4 = new Student("Adelina", "Dragos", "01.03.1990",
                "01.10.2009", "UMF", "Medicina", StudentType.PHD, "04");

        studentRepository.add(s1);
        studentRepository.add(s2);
        studentRepository.add(s3);
        studentRepository.add(s4);

        System.out.println("before update");
        System.out.println(studentRepository.getAll());

        System.out.println("after update");

        studentRepository.updateById("01", s4);
        studentRepository.updateById("03", s2);
        System.out.println(studentRepository.getAll());


        System.out.println("Delete by ID");

        studentRepository.deleteById("03");
        studentRepository.deleteById("01");
        System.out.println(studentRepository.getAll());

        System.out.println("By name");

        studentRepository.getAllByName("Marius");
        System.out.println(studentRepository.getAll());


        Professor p1 = new Professor("Pop", "Mircea", "15.03.1968", "15.03.1999",
                "Matematica", "15.09.1999", "UTCN", ProfessorType.PROFESSOR,
                "01");
        Professor p2 = new Professor("Muresan", "Ana", "25.06.1971", "10.08.2000",
                "Engleza", "15.08.2000", "UMF",
                ProfessorType.PROFESSOR, "06");
        Professor p3 = new Professor("Anca", "Matei", "30.04.1989", "15.09.2015",
                "Biologie", "15.09.2015 ", "UMF", ProfessorType.ASSOCIATE,
                "10");
        Professor p4 = new Professor("Alincai", "Marius", "24.11.1988", "10.10.2010",
                "Chimie", "12.10.2010", "UMF", ProfessorType.ASSISTANT, "25");


        professorRepository.add(p1);
        professorRepository.add(p2);
        professorRepository.add(p3);
        professorRepository.add(p4);

        System.out.println("Before update");
        System.out.println(professorRepository.getAll());

        System.out.println("After update by ID");
        professorRepository.updateById("01", p3);
        professorRepository.updateById("10", p4);
        System.out.println(professorRepository.getAll());

        System.out.println("Delete by ID");

        professorRepository.deleteById("25");
        professorRepository.deleteById("01");
        System.out.println(professorRepository.getAll());

        System.out.println("Get by name");

        professorRepository.getAllByName("Ana");
        System.out.println(professorRepository.getAll());


    }
}

