package Day3.Method.Input;


import java.util.Scanner;

//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45
public class Input3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {


            System.out.println("첫번째 숫자를 입력해주세요");
            int num1 = scan.nextInt();
            System.out.println("두번째 숫자를 입력해주세요");
            int num2 = scan.nextInt();

            System.out.println("기호 를 입력해주세요");
            String hi = scan.nextLine();
            if (hi.equals ("+")) {
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            } else if (hi.equals("-")) {
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

            } else if (hi.equals("*")) {
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

            } else if (hi.equals("/")) {
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

            }
        }


        System.out.println("안녕");
    }




}
