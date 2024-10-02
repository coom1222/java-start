package scanner.ex;

import java.util.Scanner;

public class ScannerEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("상품의 가격을 입력하세요(-1를 입력하면 종료): ");
            int price = scanner.nextInt();

            if(price == -1){
                break;
            }
            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            System.out.println("총 비용: " + price*quantity);
        }

        scanner.close();
    }
}





