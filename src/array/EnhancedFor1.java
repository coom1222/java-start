package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};


        // 일반 for문
        for (int i = 0; i< numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);
        }

        // 향상된 for문, for-each문
        // for-each문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다.
        // 단순히 해당 배열을 처음부터 끝까지 탐색한다.
        // 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있다.
        // 단축키 iter
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        // for-each문을 사용할 수 없는 경우 : 증가하는 index 값이 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는" + numbers[i]);
        }
    }
}
