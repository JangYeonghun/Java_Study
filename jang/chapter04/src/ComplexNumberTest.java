// Programming Exercise 4
// 복소수를 나타내는 클래스를 만들어 보자
// 복소수는 real + image x i 와 같은 형태를 갖는다
// 여기서 i = 루트(-1)이다.
// 복소수에 필요한 속성들과 가능한 메소드들을 결정한 후에 클래스를 작성하고 객체를 생성하여서 테스트하라
/*
실행 결과
10+20i
 */
public class ComplexNumberTest {
    // 접근지정자 private(동일클래스), 필드(멤버 변수), 인스턴스 변수
    private int realNum;
    private double imaginaryNum;

    // 생성자, 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 매개변수 realNum imaginaryNum, 참조변수 this(필드와 생성자를 참조)
    public ComplexNumberTest(int realNum, double imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    // 인스턴스 메서드(멤버 메서드), String으로 반환값도 String
    public String ComplexNumber() {
        return realNum + (imaginaryNum >= 0 ? "+" : "") + imaginaryNum + "i";
    }

    public static void main(String[] args) {
        // ComplexNumberTest는 클래스, complexNumberTest는 오브젝트이자 클래스의 인스턴스, new ~는 생성자, 매개변수로 10, 20이 들어간다
        ComplexNumberTest complexNumberTest = new ComplexNumberTest(10, 20);
        System.out.println(complexNumberTest.ComplexNumber()); // complexNumberTest는 인스턴스, .ComplexNumber()는 인스턴스 메서드(반대?는 정적메서드)
    }
}
