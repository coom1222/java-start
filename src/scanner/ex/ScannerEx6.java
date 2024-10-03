package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        // num1dl num2보다 큰 경우, 두 숫자를 교환
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        //
        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {    // i가 마지막값이 아니면
                System.out.print(",");  // 쉽표출력 즉, 마지막이면 쉼표를 출력하지 않음
            }
        }
    }
}





