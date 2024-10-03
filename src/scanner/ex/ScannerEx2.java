package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int i = scanner.nextInt();

        if (i % 2 == 1){
            System.out.println("입력한 숫자 " + i + "은 홀수입니다");
        } else if (i % 2 == 0) {
            System.out.println("입력한 숫자 " + i + "은 짝수입니다");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

    }

}
