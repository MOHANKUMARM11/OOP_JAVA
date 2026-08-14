import java.util.Arrays;

public class Student {
    String name;
    private int roll;
    private int[] marks;

    public Student(String name, int roll,int []marks) {
        this.name = name;
        this.roll = roll;
        if(marks==null||marks.length==0){
            throw new IllegalArgumentException("Cannot create Student without marks");
        }
        if(marks.length!=5){
            throw new IllegalArgumentException("Cannot create Student without 5 marks");
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]<0||marks[i]>100){
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        for(int j=0;j<marks.length;j++){
            if(marks[j]<0||marks[j]>100){
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
        }
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkById(int id, int mark) {
        if(mark<0||mark>100){
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if(id<0 || id>5){
            throw new IllegalArgumentException("Index of  Marks must be between 0 and 5");
        }
        this.marks[id] = mark;
    }

    public int getTotalMarks() {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total += marks[i];
        }
        return total;
    }

    public double getAverageMarks() {
        int total = getTotalMarks();
        return (double)total/(double)marks.length;
    }

    public char calculateGrade(){
        double averageMarks = getAverageMarks();
        if(averageMarks >90){
            return 'O';
        }
        else if(averageMarks >80){
            return 'A';
        }
        else if(averageMarks >70){
            return 'B';
        }
        else if(averageMarks >60){
            return 'C';
        }
        else if(averageMarks >50){
            return 'D';
        }
        else {
            return 'F';
        }
    }

    @Override
    public String toString() {
        return  "Name\t:"       +   name+
                "\nRoll\t:"     +   roll+
                "\nMarks\t:"    +   Arrays.toString(marks)+
                "\nTotal\t:"    +   getTotalMarks()+
                "\nAverage\t:"  +   getAverageMarks()+
                "\nGrade\t:"    +   calculateGrade();
    }
}
