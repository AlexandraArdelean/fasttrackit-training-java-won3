package course5.Tema_part1;

public enum StudentType {
    BACHELOR("A absolvit liceul"),
    MASTER("Urmeaza sa inceapa masteratul"),
    PHD("Se gandeste sa faca si un doctorat");


    private String DegreeType;
    StudentType(String degree){

        this.DegreeType = degree;
    }

    public String getDegreeType() {

        return DegreeType;
    }
}
