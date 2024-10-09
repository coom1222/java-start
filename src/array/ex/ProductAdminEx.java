package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] products = new String[maxProducts]; // 상품 이름을 저장할 String 배열
        int[] productsPrices = new int[products.length];    // 상품 가격을 저장할 int배열
        int productCount = 0;   // 현재 등록된 상품의 개수를 저장할 int 변수

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료." );
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // enter를 쳐버리면 10만 nextInt가 읽고 \n이 남는다. 이 \n을 소비하기 위해 한줄추가

            if (choice == 1){
                if (productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                products[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productsPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (choice == 2){
                if (productCount == maxProducts){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++){
                    System.out.println((i+1) + "." + products[i] + ": " + productsPrices[i]);
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
