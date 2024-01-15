import java.util.Scanner;

// 예제 3-4
// 성적을 입력하면 학점으로 변환해주는 프로그램 작성(switch로 작성)
/*
실행 결과
성적을 입력하시오: 92
학점: A
 */
public class Score2Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc라는 오브젝트, new Scanner 라는 생성자
        int score, value;
        char grade;

        System.out.print("성적을 입력하시오: ");
        score = sc.nextInt(); // 오브젝트 뒤에 붙었으니 인스턴스메소드

        value = score / 10;

        switch (value) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("학점: " + grade);
    }
}
