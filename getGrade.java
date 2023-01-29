package Class15HW;

public class getGrade {
    String getGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else if (score > 70) {
            return "C";
        } else if (score > 50) {
            return "D";
        }
        return "F";
    }

    public static void main(String[] args) {
        getGrade grade = new getGrade();
        System.out.println(grade.getGrade(75));
    }
}
