package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 입력하세요 : ");
        int count = input.nextInt();    // count변수로 배열길이

        int [] arr = new int[count];    // 배열 생성

        int min ,max;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }

        min = max = arr[0]; // 최댓값 최솟값 초기화.

        for (int i = 0; i < count; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
