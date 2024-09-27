package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;   // temp는 if문 안에서만 쓰이는 변수인데 main함수 전체에서 사용되고있다.
        // 비효율적인 메모리 사용, 코드 복잡성 증가의 이유가 있다.
        if(m > 0){
            temp = m*2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m); // if가 끝나도 temp와 m 둘 다 생각해야 한다.
        // 좋은 코드는 군더더기가 없는 코드이다.
    }
}
