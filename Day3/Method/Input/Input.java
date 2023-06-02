package Day3.Method.Input;

import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        try {

            // 표준 입력 , 해당 값은 아스키코드 참조
            int num = System.in.read();

            System.out.println("출력 : " + num);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
