package scope;
// 변수의 접근 가능한 범위를 스코프(Scope)라 한다
public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if(true){
            int x = 20; // x 생존 시작
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        }   // x 주금
        //System.out.println("x = " + x);
        System.out.println("m = " + m);
    }   // m 주금
}
