package course7_8hw.Hw1;

import java.util.UUID;

public class Assignment implements Comparable<Assignment>{
    private String uniqueID;
    private int courseNum;
    private String assignmentTitle;
    private String assignmentDescription;
    private DifficultyLevel myLev;



    @Override
    public int compareTo(Assignment o) {
        // comparison by course number
        int resultByCourseNum = Integer.compare(this.courseNum, o.getCourseNum());
        if (resultByCourseNum != 0) {
            return resultByCourseNum;
        }
        // comparison by course title
        int resultByTitle = this.assignmentTitle.compareTo(o.getAssignmentTitle());
        if(resultByTitle!=0){
            return resultByTitle;
        }
        // comparison by course Difficulty level
        int resultByDifficultyLevel= this.myLev.compareTo(o.getMyLev());
        return resultByDifficultyLevel;

    }
    public Assignment(UUID uniqueID, int courseNum, String assignmentTitle, String assignmentDescription, DifficultyLevel myLev) {
        this.uniqueID= uniqueID.toString();
        this.courseNum = courseNum;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
        this.myLev = myLev;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }


    public DifficultyLevel getMyLev() {
        return myLev;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "uniqueID=" + uniqueID +
                ", courseNum=" + courseNum +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                ", myLev=" + myLev +
                '}';
    }


}

