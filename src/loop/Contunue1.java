package loop;

public class Contunue1 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
/*
예상출력
1
2
4
5
 */
