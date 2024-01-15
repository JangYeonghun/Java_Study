import java.util.Random;
import java.util.Scanner;

// Mini Project
// 0 ~ 100 사이 수 중 하나 업 앤 다운 게임 만들기
/*
실행 결과
정답을 추측하여 보시오: 50
LOW
정답을 추측하여 보시오: 75
HIGH
정답을 추측하여 보시오: 60
축하합니다. 시도횟수=3
 */
public class ContinueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc 는 오브젝트, new Scanner는 생성자
        int randNum, userNum;
        int count1 = 0, count2 = 0;

        randNum = (int) (Math.random() * 100);

        while (true) {
            System.out.print("정답을 추측하여 보시오: ");
            userNum = sc.nextInt(); // sc는 오브젝트(여기서는 사용됐으니 인스턴스) .nextInt는 인스턴스 메소드(클래스 뒤면 정적 메소드)
            count1++;

            if (randNum > userNum) {
                System.out.println("HIGH");
            } else if (randNum < userNum) {
                System.out.println("LOW");
            } else {
                System.out.println("축하합니다. 시도횟수=" + count1);
                break;
            }
        }

        do {
            System.out.print("정답을 추측하여 보시오: ");
            userNum = sc.nextInt();

            if (randNum > userNum) {
                System.out.println("HIGH");
            } else if (randNum < userNum) {
                System.out.println("LOW");
            }
            count2++;
        } while (randNum != userNum);
        System.out.println("축하합니다. 시도횟수=" + count2);
    }
}
