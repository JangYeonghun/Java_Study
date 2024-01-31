// Programming Exercise 2
// 강아지를 나타내는 Dog 클래스를 만들어보자
// 강아지 클래스는 종(breed), 나이(age), 색깔(color) 등의 필드를 가지며,
// barking(), hungry(), sleeping() 메소드를 가진다
/*
실행 결과
(york, 1, orange)
barking()
hungry()
sleeping()
 */
public class DogTest {
    // 필드(멤버 변수), 인스턴스 변수, 접근 지정자 private(동일 클래스)
    private String breed;
    private String color;
    private int age;

    // 접근 지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 생성자, 매개변수 breed, color, age, 참조 변수 this(생성자나 필드를 참조)
    public DogTest(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    // void는 반환타입 없음
    public void printDogInfo() {
        System.out.println("(" + breed + ", " + age + ", " + color + ")");
    }

    public void barking() {
        System.out.println("barking()");
    }

    public void hungry() {
        System.out.println("hungry()");
    }

    public void sleeping() {
        System.out.println("sleeping()");
    }

    public static void main(String[] args) {
        // DogTest는 클래스, dog는 오브젝트(DogTest 클래스의 인스턴스), new DogTest는 생성자, 매개변수 york, orange, 1을 받는다
        DogTest dog = new DogTest("york", "orange", 1);
        // dog는 인스턴스, .~는 인스턴스 메소드(반대는 정적 메소드)
        dog.printDogInfo();
        dog.barking();
        dog.hungry();
        dog.sleeping();
    }
}
