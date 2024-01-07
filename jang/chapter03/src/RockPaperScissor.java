import java.util.Scanner;

// 예제 3-3
// 가위, 바위, 보 게임 작성 이를 컴퓨터가 생성한 난수값과 비교
/*
실행 결과
가위(0), 바위(1), 보(2): 1
인간: 1 컴퓨터: 0 인간 승리
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, Scanner는 생성자
        int user, computer;

        System.out.print("가위(0), 바위(1), 보(2): ");
        user = sc.nextInt(); // sc오브젝트 뒤에 인스턴스 메쏘드 nextInt()가 온다

        computer = (int) (Math.random() * 3); // Math라는 자바 클래스 뒤에 정적 메쏘드 random()이 온다(오브젝트 필요 없고 클래스로 호출)

        if (user > computer) {
            System.out.println("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
        } else if (user == computer) {
            System.out.println("인간: " + user + " 컴퓨터: " + computer + " 무승부");
        } else {
            System.out.println("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
        }

    }
}
