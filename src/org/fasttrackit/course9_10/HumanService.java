package org.fasttrackit.course9_10;

import org.fasttrackit.course5_6hw.Tema1.*;

import java.util.ArrayList;
import java.util.List;

public class HumanService {

    private final HumanRepository<Student> studentRepository;
    private final HumanRepository<Professor> professorRepository;

    public HumanService(HumanRepository<Student> studentRepository, HumanRepository<Professor> professorRepository) {
        this.studentRepository = studentRepository;
        this.professorRepository = professorRepository;
    }

    public List<Human> getAllHumans() {
        HumanRepository<Student> studentHumanRepository = new HumanRepository<>();
        HumanRepository<Professor> professorHumanRepository = new HumanRepository<>();
        List<Human> allHumans = new ArrayList<>();
        allHumans.addAll(studentHumanRepository.getAll());
        allHumans.addAll(professorHumanRepository.getAll());
        Student s1 = new Student("Marius", "Pop", "24.03.2000",
                "01.10.2018", "UBB", "Contabilitate", StudentType.PHD, "01");

        Student s2 = new Student("Marius", "Bojor", "12.08.1991",
                "01.10.2010", "UTCN", "Info", StudentType.BACHELOR, "02");

//        Student s3 = new Student("Andrei", "Ardelean", "04.09.1994",
//                "01.10.2013", "UBB0", "Info", StudentType.PHD, "03");
//        Student s4 = new Student("Adelina", "Dragos", "01.03.1990",
//                "01.10.2009", "UMF", "Medicina", StudentType.PHD, "04");

        exercise1();

        System.out.println("before update");
        exercise2();

        System.out.println("after update");

        exercise3("02", s1);
        System.out.println(studentRepository.getAll());


        System.out.println("Delete by ID");

        exercise4();
        System.out.println(studentRepository.getAll());

        System.out.println("By name");


        exercise5();
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

        return allHumans;
    }



    public void exercise5(String name) {

        studentRepository.getAllByName(name);
    }

    public void exercise4(String id) {
        studentRepository.deleteById(id);

    }

    public void exercise3(String id, Student s) {

        studentRepository.updateById(id, s);
    }

    public void exercise2() {
        System.out.println(studentRepository.getAll());
    }

    public void exercise1(Student s) {

        studentRepository.add(s);

    }
}


