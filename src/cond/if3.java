package cond;

public class if3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7){
            System.out.println("미취학");
        }
        if (8 <= age && age <= 13){
            System.out.println("초등");
        }
        if (14 <= age && age <= 16){
            System.out.println("중등");
        }
        if (17 <= age && age <= 19){
            System.out.println("고등");
        }
        if (20 <= age){
            System.out.println("성인");
        }
    }
}
