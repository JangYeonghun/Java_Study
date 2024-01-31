// Programming Exercise 1
// 학생을 나타내는 Student 클래스를 만들어보자
// 학생 이름(name)과 학번(rollno), 나이를 가진다
// Student 클래스를 작성하고 객체를 생성하여 테스트하라
/*
실행 결과
학생의 이름: Kim
학생의 학번: 20180001
학생의 나이: 20
 */
public class StudentTest {
    // 필드, Student 클래스의 멤버 변수, 인스턴스 변수
    // 접근 지정자 private(동일 클래스)
    private String name;
    private int rollNo;
    private int age;

    public StudentTest() {
        // 생성자
        // 참조 변수 this(참조하는건 생성자, 필드 뿐)
        this.name = "";
        this.rollNo = 0;
        this.age = 0;
    }

    public void setName(String name) { // 인스턴스 메서드(멤버 메서드), 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), void는 반환타입이 없음, 매개변수 String name
        // 참조 변수 this(참조하는건 생성자, 필드 뿐)
        this.name = name;
    }

    public String getName() { // 인스턴스 메서드(멤버 메서드), 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 반환 타입은 String
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        StudentTest student = new StudentTest(); // Student 라는 클래스, student 라는 오브젝트(Student 클래스의 인스턴스), new Student는 생성자
        student.setName("Kim"); // student는 오브젝트(인스턴스), setName은 인스턴스 메서드, 매개변수로 Kim을 넣어줬다
        student.setRollNo(20180001);
        student.setAge(20);

        System.out.println("학생의 이름: " + student.getName());
        System.out.println("학생의 학번: " + student.getRollNo());
        System.out.println("학생의 나이: " + student.getAge());
    }
}
