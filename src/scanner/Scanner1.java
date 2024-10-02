package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  println == print("\n) 이다. 즉, 출력하고 다음 라인으로 넘긴다
        System.out.print("문자열을 입력하세요: "); // println을 하면 입력하는 창이 밑으로 내려간다.
        String str = scanner.nextLine();    // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);



    }
}
