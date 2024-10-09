package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        int total = 0;
        double avg;

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            total += arr[i];
        }
        avg = (double) total/arr.length;

        System.out.println("입력한 정수의 합계");
        System.out.println("total = " + total);

        System.out.println("입력한 정수의 평균");
        System.out.println("avg = " + avg);

    }
}
/*
total 변수는 입력된 정수들의 합을 누적하는 데 사용됩니다.
따라서 처음에 아무 값도 더해지기 전에는 total의 값이 0이어야만 의미가 있습니다.
즉, 누적 덧셈을 위해 처음부터 0에서 시작해야 합니다.

avg는 나중에 계산된 값을 저장하는 결과값을 저장하는 변수입니다.
avg는 정수들을 모두 입력받고 나서 마지막에 한 번 평균을 계산하여 값을 저장합니다.
즉, 처음부터 초기화할 필요 없이, 계산 후에 값이 할당되므로 명시적으로 초기화하지 않아도 됩니다.
초기화하지 않고도 문제없이 작동하는 이유는 avg에 처음부터 값을 할당할 예정이기 때문입니다.
만약 avg가 초기화 없이 사용되기 전에 접근된다면,
그때는 문제가 생길 수 있지만, 이 코드에서는 그렇지 않으므로 초기화가 필요하지 않습니다.
 */
