import java.util.Scanner;

// Programming Exercise 12
// 학생들의 성적을 받아서 평균을 구하는 프로그램 작성
/*
성적을 입력하세요: 10
성적을 입력하세요: 20
성적을 입력하세요: 30
성적을 입력하세요: 40
성적을 입력하세요: 50
합계: 150
평균: 30.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        int sum = 0;
        double avg;

        int[] scoreList = new int[5];

        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자

        for (int i = 0; i < scoreList.length; i++) {
            System.out.print("성적을 입력하세요: ");
            scoreList[i] = sc.nextInt();

            sum += scoreList[i];
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + (double) sum/scoreList.length);
    }
}
