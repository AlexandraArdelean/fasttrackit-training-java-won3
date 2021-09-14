package org.fasttrackit.course9_10;

import org.fasttrackit.course5_6hw.Tema1.Professor;
import org.fasttrackit.course5_6hw.Tema1.Student;
import org.fasttrackit.course5_6hw.Tema1.StudentType;

public class InjectionRunner {

    public static void main(String[] args) {
        HumanRepository<Student> studentRepositoryToInject= new HumanRepository<>();

        HumanRepository<Professor> professorRepositoryToInject= new HumanRepository<>();

        HumanService humanService=new HumanService(studentRepositoryToInject,
                professorRepositoryToInject);
        Student s1 = new Student("Ana", "Popa", "25.11.2000", "15.10.2016",
                "UMF", "Medicina", StudentType.BACHELOR, "01");
        Student s2 = new Student("Marius", "Bojor", "12.08.1991",
                "01.10.2010", "UTCN", "Info", StudentType.BACHELOR, "02");

        humanService.exercise1(s1);
        humanService.exercise1(s2);
        humanService.exercise2();
        humanService.exercise3("01", s2);



    }
}
