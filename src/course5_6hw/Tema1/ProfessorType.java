package course5_6hw.Tema1;

public enum ProfessorType implements ScholarType{
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


