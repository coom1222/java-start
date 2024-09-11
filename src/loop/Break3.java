package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        // for(; ;)는 조건식이 없다. 이러면 for문은 무한반복한다.
        for(int i = 1; ;i++){
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료, i = " + i + " sum = " + sum);

            }

        }
    }
}
