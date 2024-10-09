package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 입력하세요 : ");
        int count = input.nextInt();

        int [] arr = new int[count];
        int total = 0;
        double avg;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = input.nextInt();
            total += arr[j];
        }
        avg = (double) total/arr.length;

        System.out.println("입력한 정수의 합계");
        System.out.println("total = " + total);

        System.out.println("입력한 정수의 평균");
        System.out.println("avg = " + avg);

    }
}
