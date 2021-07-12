package course7;

import java.util.Comparator;
import java.util.UUID;

public class Assignment {
    private UUID uniqueID;
    private int courseNum;
    private String assignmentTitle;
    private String assignmentDescription;

    public Assignment(UUID uniqueID, int courseNum, String assignmentTitle, String assignmentDescription) {
        this.uniqueID = uniqueID;
        this.courseNum = courseNum;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;

    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "uniqueID=" + uniqueID +
                ", courseNum=" + courseNum +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                '}';
    }
}
