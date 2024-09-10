package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100;


        while (i <= endNum){
            sum += i;
            System.out.println("i는 " + i +", sum: " + sum);
            i++;
            // i++ == i = i + 1
        }


    }
}
