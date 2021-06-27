package course5.Tema_part1;

public class University {
    public static void main(String[] args) {
        //Studentul
        Student student = new Student();
        student.firstName();
        student.lastName();
        student.dateOfBirth();

        student.setDateOfEnrollment("Data inscrierii la facultate: 01 octombrie 2010.");
        System.out.println(student.getDateOfEnrollment());
        student.setFacultyName("Facultatea aleasa: UMF Cluj");
        System.out.println(student.getFacultyName());
        student.setSpecializationName("Specializarea: farmacie");
        System.out.println(student.getSpecializationName());
        System.out.println(StudentType.PHD.getDegreeType());
        System.out.println("\n");

        //Profesorul
        Professor professor = new Professor();
        professor.firstName();
        professor.lastName();
        professor.dateOfBirth();

        professor.setDateOfHiring("Data angajarii in cadrul facultatii: 01.09.2009. ");
        System.out.println(professor.getDateOfHiring());
        professor.setSpecializationName("Specializarea: chimie analitica. ");
        System.out.println(professor.getSpecializationName());
        System.out.println(ProfessorType.PROFESSOR.getPositionType());

    }
}
