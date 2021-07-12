package course7;

import java.util.Comparator;

public class AssignmentComparedByCourseNum implements Comparator <Assignment>{


    @Override
    public int compare(Assignment o1, Assignment o2) {
        if (o1.getCourseNum() < o2.getCourseNum()) return -1;
        if (o1.getCourseNum() > o2.getCourseNum()) return 1; // comparring by course number
        else return 0;


}
}


