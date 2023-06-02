package Day2.Loop;

public class Loop7 {
    public static void main(String[] args) {
        //구구단
        //2단


        System.out.printf("2 X 1 = %d\n", 2 * 1);
        System.out.printf("2 X 2 = %d\n", 2 * 2);
        System.out.printf("2 X 3 = %d\n", 2 * 3);
        System.out.printf("2 X 4 = %d\n", 2 * 4);
        System.out.printf("2 X 5 = %d\n", 2 * 5);
        System.out.printf("2 X 6 = %d\n", 2 * 6);
        System.out.printf("2 X 7 = %d\n", 2 * 7);
        System.out.printf("2 X 8 = %d\n", 2 * 8);
        System.out.printf("2 X 9 = %d\n", 2 * 9);

        for (int i = 1; i <= 18; i++) {
            System.out.printf("2 X %d = %d\n", i, 2 * i);
        }

        //문자열 결합 문자열1 + 문자열2
        System.out.println("10" + "10");

        //문자 + 숫자 - > 숫자를 문자로 바꿔서 문자열 결합

        System.out.println(10+ "10");

        int age = 22;
        String name = "홍길순";

        System.out.println(age + " 살 " + name + "입니다.");
        System.out.println(age + " 살 " + name + "입니다.");
        System.out.println(age + " 살 " + name + "입니다.");

        //일반적인 방법

        String message = String.format("%d살 홍길동입니다", 20);
        System.out.println(message);

        //편한 방법
        // 단 줄바꿈이 안되기 때문에 줄바꿈 문자 \n을 이용해 직접 줄을 바꿔야 함
        System.out.printf("%d살 %s입니다.\n", age, name);
        System.out.printf("%d살 %s입니다.\n", age, name);

    }
}
