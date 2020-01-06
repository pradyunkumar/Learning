package pradyunjava;

import java.util.ArrayList;
import java.util.List;

public class SeatingChart {
    class Student{
        private String name;
        private int AbsenceCount;

        public String getName() {
            return name;
        }

        public int getAbsenceCount() {
            return AbsenceCount;
        }
    }

    private Student[][] seats;

    /**
     *
     * @param studentList
     * @param rows
     * @param cols
     * initialize seats with cols and rows
     * initialize new List studentList as List of Students
     * start count
     * nested for loop for 2D array
     * assign students from lists into seats
     */
    public SeatingChart(List<Student> studentList, int rows, int cols){
        seats = new Student[rows][cols];
        List<Student> students = new ArrayList<>(studentList);
        int count = 0;
        while(count < students.size()) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    seats[i][j] = students.get(count);
                    count++;
                }
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences){
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < cols; j++) {
                if(seats[i][j].getAbsenceCount() > allowedAbsences){

                }
            }
        }

    }
}
