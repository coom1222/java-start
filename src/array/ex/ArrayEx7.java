package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"}; // 받아두면 뒤에 쓸 일이 있으므로... 이건 많이 해봐야 익숙해지는 영역
        // String[] subjects = new String[]{"국어", "영어", "수학"}; 이렇게 해도 된다.
/*
{1, 100, 80, 70},
{2,30,40,50},
{3,60,70,50},
{4, 90,100,80}
 */
        // 행(row)
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            // 열(column)
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                students[i][j] = scanner.nextInt();
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
