import java.util.Scanner;

// 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성하라
/*
실행 결과
성적을 입력하세요: 10
성적을 입력하세요: 20
성적을 입력하세요: 30
성적을 입력하세요: 40
성적을 입력하세요: 50

합계 : 150
평균 : 30.0
 */
class Grade {
    // 정적 변수, 정적 메소드(얘들은 인스턴스에 영향을 받지 않음), 매개변수
    // default 생성자
    static int score = 0;

    static void totalScore(int grade) {
        score += grade;
    }

    // 반환타입 double, 매개변수
    double avgGrade(int subject) {
        return (double) score / subject;
    }

}
public class GradeTest {
    public static void main(String[] args) {
        int subject;
        int grade;

        // Grade는 클래스, objGrade는 오브젝트, new~는 생성자
        // Scanner는 클래스, sc는 오브젝트, new~는 생성자
        Grade objGrade = new Grade();
        Scanner sc = new Scanner(System.in);

        // sc는 오브젝트, 사용했으니 인스턴스 .nextInt는 인스턴스 메소드
        System.out.print("과목 수를 입력하세요: ");
        subject = sc.nextInt();

        System.out.println();

        for (int i = 0; i < subject; i++) {
            System.out.print("성적을 입력하세요: ");
            grade = sc.nextInt();
            Grade.totalScore(grade);
        }

        // 정적 메소드, 변수는 바로 쓸수 있지만 인스턴스 메소드, 변수는 오브젝트 선언을 해야 사용 가능한걸 알 수 있다
        System.out.println("\n합계 : " + Grade.score);
        System.out.println("평균 : " + objGrade.avgGrade(subject));
    }
}
