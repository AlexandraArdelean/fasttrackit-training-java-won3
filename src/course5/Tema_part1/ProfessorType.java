package course5.Tema_part1;

public enum ProfessorType {
    ASSISTANT("Ocupa postul de asistent"),
    ASSOCIATE("Preda ocazional, fiind asociat"),
    PROFESSOR("Este titular pe post incepand cu 9 septembrie 2010");

    private final String PositionType;
    ProfessorType(String position){
        this.PositionType = position;

    }

    public String getPositionType(){
    return PositionType;
    }
}
