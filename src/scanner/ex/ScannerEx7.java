package scanner.ex;

import java.util.Scanner;

public class ScannerEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
            String name = scanner.nextLine();   // nextLine은  뒤에 개행문자가 들어간다.

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();    // 10\n 이런식으로 \n이 포함되어 있기 때문에
            scanner.nextLine(); // 스캐너를 한번 더 사용해 그냥 개행문자를 받아주면 된다.

            System.out.println("입력한 이름: " + name +" 나이 = " + age);
        }

    }
}





