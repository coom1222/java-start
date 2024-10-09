package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 :");
        int stdNum = input.nextInt();

        int[][] students = new int[stdNum][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                students[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += students[i][j];
            }
            double average = (double)total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
