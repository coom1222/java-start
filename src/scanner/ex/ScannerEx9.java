package scanner.ex;

import java.util.Scanner;

public class ScannerEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;
        System.out.print("숫자 입력하세요. 입력을 중단할려면 -1를 입력하세요 ");
/*
        while(true){
            int input = scanner.nextInt();

            if(input == -1){
                break;
            }
            sum += input;
            count++;    // 평균을 구할려면 몇개인지 알아야겠지?
        }
*/
        // 이렇게 축약해서 쓰는 경우가 꽤나 있다.
        while ((input = scanner.nextInt()) != -1){
            sum += input;
            count++;
        }


        double average = (double)sum / count;   // int와 int의 계산이니 double로 casting해줘야 할것.
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

        scanner.close();
    }
}





