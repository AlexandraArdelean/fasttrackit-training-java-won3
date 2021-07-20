package course5_6hw.Tema1;

public enum StudentType implements ScholarType{
    BACHELOR("A absolvit liceul"),
    MASTER("Urmeaza sa inceapa masteratul"),
    PHD("Se gandeste sa faca si un doctorat");


    private String DegreeType;

    StudentType(String degree) {

        this.DegreeType = degree;
    }

    public String getDegreeType() {

        return DegreeType;
    }
}