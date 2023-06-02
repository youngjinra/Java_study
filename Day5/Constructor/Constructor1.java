package Day5.Constructor;

public class Constructor1 {
    public static void main(String[] args){

        int a; // 선언(시스템 용어)
        a = 10; // 초기화(시스템 용어)

        //객체를 만들면 반드시!!!!! 데이터를 넣어줘야 한다.(초기화)
        Person p1 = new Person(1,20,"홍길동");
        // 객체 초기화
        // 1.객체 초기화는 너무 불편하고,귀찮다.
        // 2.초기화를 자주 까먹는다(사람이 작업하는 부분이기 때문)

        // 위 1,2번을 해결하기 위해 생성자를 만든다.

        p1.no = 1;
        p1.age = 20;
        p1.name = "홍길동";

        Person p2 = new Person(2,30,"홍길순");//Person() 생성자라는 함수이다.
        p2.no = 2;
        p2.age = 30;
        p2.name = "홍길순";

        p1.introduce();
        p2.introduce();



    }
}



class Person {
    int no;
    int age;
    String name;

    // 생성자 -> 메서드(함수)의 일종
    // 1.리턴 타입 X
    // 2. 메서드이름을 꼭! 클래스명과 동일하게 지어야 함.
    // 3. 이 메서드는 반드시 실행됨.

    public Person(int a, int b, String c){
        System.out.println("사람이 한명 생성됨.");
        System.out.println("번호 : " + a);
        System.out.println("나이 : " + b);
        System.out.println("이름 : " + c);
        no = a;
        age = b;
        name = c;
    }

    public void introduce(){
        System.out.printf("안녕하세요 %d번, %d살 %s입니다.\n", no, age, name);
    }
}
