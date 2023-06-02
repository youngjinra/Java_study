package Day6.casting.casting;

public class ObjectCasting {
    public static void main(String[] args) {


        // 객체 형변환
        Cat c1 = new Cat();
        Dog d1 = new Dog();

//        Dog d2 = new Cat();  //사람이 봤을 땐 개와 고양이는 동물이지만 자바가 봤을 땐 완전 다른 개념으로 보기때문에 Animal로 묶어서 알려줘야함

        // 객체 형변환
        Animal a1 = new Dog(); // Dog가 Animal변수에 저장된게 아니라, Dog가 Animal로 자동 형변환된 것이다.

        Dog d3 = (Dog)a1; // Animal이 Dog로 수동 형변환 됨
        //형변환은 부모 자식 간에만 가능하다(예를 들어 고양이 부모 밑에 강아지 자식이 안되듯)
    }
}

class Animal {

}


class Cat extends Animal {

}


class Dog extends Animal{

}