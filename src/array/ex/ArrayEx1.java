package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int [] students = new int[]{90, 80, 70, 60, 50};
        // int [] students = {90, 80, 70, 60, 50}; 으로 바로 써도 된다.
        double average = 0;
        int total = 0;

        for (int student : students) {
            total += student;
        }

        average = (double) total / 5;
        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
