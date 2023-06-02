package Day6.casting;

public class Casting {
    public static void main(String[] args) {
        int a = 10; // int,short,byte,long (이 4가지는 정수를 표기 but 범위가 다름)
        double b = 10.5; // double, float (이 2 가지는 실수를 표기)
        //자바의 대정의:자바의 타입과 변수가 일치해야함
        //위 내용을 해석하자면 변수의 타입과 변수에 저장되는 값의 타입이 일치해야함.
        double d = 4; // int를 double 변수에 저장 X. int가 double로 바뀌어서 들어갔다.(형변환. 캐스팅)
        // 자동 (묵시적) 형변환
        // double에 4가 오류없이 실행되지만 4.0으로 출력됨 4와 4.0은 다른 값이다
        System.out.println(d);

        int e = (int)10.6; // double이 int 변수 저장X. doube - > int변환(개발자가 억지로 변환을 했기 때문에 책임은 개발자 탓)
        // 수동(명시적)형변환
        System.out.println(e);

        // 전혀 관계 없는 타입은 형변환 X
        // int a = "hello"; // 안됨


    }
}
