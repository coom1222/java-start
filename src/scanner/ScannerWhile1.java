package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("문자열을 입력하세요(exit면 종료)");
            String str = scanner.nextLine();    // scanner.next어쩌구로 입력, 그 입력받은걸 String xxx 변수에 저장
            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }

    }
}
