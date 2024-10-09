package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
        // 0, 1, 2, 3, 4
        // 배열을 뒤집는다 생각.
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }
}
