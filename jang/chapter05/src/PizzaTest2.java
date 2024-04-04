// 예제 5-3
// 피자 객체 2개를 받아서 더 큰 피자를 반환하는 메소드 whosLargest()를 작성해보자
class Pizza2 {
    // 멤버(필드), 인스턴스 변수, 기초자료형 int
    int radius;

    // 생성자, 접근 지정자 없음(default, package => 동일클래스, 동일패키지), 매개변수 int r
    Pizza2(int r) {
        radius = r;
    }

    // 멤버(메소드), 인스턴스 메소드, 반환 타입은 객체(Pizza2)
    Pizza2 whosLargest(Pizza2 p1, Pizza2 p2) {
        if (p1.radius > p2.radius) {
            return p1;
        } else {
            return p2;
        }
    }
}
public class PizzaTest2 {
    public static void main(String[] args) {
        // Pizza2는 클래스, obj1 obj2는 오브젝트이자 클래스의 인스턴스, new~는 생성자, 매개변수로 14, 18이 들어간다
        Pizza2 obj1 = new Pizza2(14);
        Pizza2 obj2 = new Pizza2(18);

        Pizza2 largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}
