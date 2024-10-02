package scanner.ex;

import java.util.Scanner;

public class ScannerEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;

        System.out.print("숫자 입력하세요. 입력을 중단할려면 -1를 입력하세요 ");
        while(true){
            int price = scanner.nextInt();

            if(price == -1){
                break;
            }
            sum += price;
            count++;
        }

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + sum/count);

        scanner.close();
    }
}





