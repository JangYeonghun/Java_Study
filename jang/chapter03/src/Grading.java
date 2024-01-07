import java.util.Scanner;

// 예제 3-2
// 성적 구하는 프로그램 A는 90이상, B는 80이상, C는 70 이상 ... F까지
/*
실행 결과
성적을 입력하시오: 92
학점 A
 */
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;

        System.out.print("성적을 입력하시오: ");
        grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("학점 A");
        } else if (grade >= 80) {
            System.out.println("학점 B");
        } else if (grade >= 70) {
            System.out.println("학점 C");
        } else if (grade >= 60) {
            System.out.println("학점 D");
        } else {
            System.out.println("학점 F");
        }
    }
}
