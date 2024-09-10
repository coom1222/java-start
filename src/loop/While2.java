package loop;

public class While2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;


        while (i < 11){
            sum += i;
            System.out.println("i는 " + i +", 현재 숫자는: " + sum);
            i = i + 1;
        }


    }
}
