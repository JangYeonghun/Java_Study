import java.util.ArrayList;

// 이름과 전화번호를 Person이라는 클래스로 정의하고 Person 객체를 저장하는 동적 배열을 생성해 보자
// 몇 사람의 연락처를 저장해 보자
/*
실행 결과
(홍길동, 01012345678)
(김유신, 01012345678)
(최자영, 01012345678)
(김영희, 01012345678)
 */
class Person {
    String name;
    String phoneNumber;

    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 생성자, 매개변수, 참조변수(필드와 생성자 참조)
    public Person (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // toStirng 오버라이드
    @Override
    public String toString() {
        return "(" + name + ", " + phoneNumber + ")";
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
        // 동적 객체 배열 생성
        ArrayList<Person> phoneBook = new ArrayList<Person>();

        // ArrayList의 경우 list.add 를 사용
        phoneBook.add(new Person("홍길동", "01012345678"));
        phoneBook.add(new Person("김유신", "01012345678"));
        phoneBook.add(new Person("최자영", "01012345678"));
        phoneBook.add(new Person("김영희", "01012345678"));

        // for-each
        // Person person은 루프를 돌릴 객체의 자료형과 일치해야함, phoneBook은 루프를 돌릴 객체
        for (Person person : phoneBook) {
            System.out.println(person);
        }
    }
}
