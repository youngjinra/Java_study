package Day1.Condition;

public class Condition4 {
    public static void main(String[] args) {
        int age = 7; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 할인 대상 이거나 할인 대상 X -> 양자택일
        if (age < 19 || age >= 60) {
            System.out.println("할인 대상");
        } else {
            System.out.println("할인 대상 아님");
        }

        // 양자택일 -> 삼자택일 -> 사자택일 -> 다자택일
        // 학적, 성적등급
        int age2 = 10;

        if (age2 <= 13) {
            System.out.println("초등학생");
        } else if (age2 <= 16) {
            System.out.println("중학생");
        } else if (age2 <= 19) {
            System.out.println("고등학생");
        } else if (age2 >= 20) {
            System.out.println("대학생");
        }
    }
}
