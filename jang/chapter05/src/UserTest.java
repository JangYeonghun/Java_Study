import java.util.ArrayList;
import java.util.Scanner;

// MiniProject
// 사용자의 아이디와 패스워드를 저장하는 객체 배열을 생성해 보자
// 다음과 같은 메뉴가 제공되고 1번 메뉴를 선택하면 아이디와 패스워드를 새롭게 추가할 수 있다
/*
실행 결과
================================
1. Sign Up
2. Login
3. Print All Users
4. Exit
================================
번호를 입력하시오: 1
Id: abcd
Password: 1234
================================
1. Sign Up
2. Login
3. Print All Users
4. Exit
================================
번호를 입력하시오: 3
{abcd, 1234}
 */
// 현재까지의 등록된 사용자수는 정적 변수로 구현해 보자
// 객체 배열은 정적이나 동적으로 생성해 보자
class User {
    // 필드(멤버 변수, 인스턴스 변수)
    String userId, password;
    // 필드(멤버 변수, 정적 변수)
    static int count = 0;

    // 생성자, 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 매개변수, 접근지정자(필드와 생성자 참조)
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        count++;
    }

    // toString 메소드 오버라이딩
    @Override
    public String toString() {
        return "{" + userId + ", " + password + "}";
    }
}

public class UserTest {
    public static void main(String[] args) {
        int inputNum;

        ArrayList<User> users = new ArrayList<User>();

        // Scanner 클래스, sc는 오브젝트, new Scanner는 생성자
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("================================\n" +
                               "1. Sign Up \n" +
                               "2. Login \n" +
                               "3. Print All Users \n" +
                               "4. Exit\n" +
                               "================================\n" +
                               "번호를 입력하시오: ");
            inputNum = sc.nextInt(); // sc는 오브젝트 사용됐으니 인스턴스, .nextInt()는 인스턴스 메소드
            sc.nextLine();

            if (inputNum == 1) {
                System.out.print("Id: ");
                String userId = sc.nextLine();

                System.out.print("Password: ");
                String password = sc.nextLine();

                User user = new User(userId, password);
                users.add(user);
                System.out.println(user.count + "번째 가입자에요!");
            } else if (inputNum == 2) {
                System.out.println("로그인!");
                break;
            } else if (inputNum == 3) {
                for (User user : users) {
                    System.out.println(user);
                }
            } else if (inputNum == 4) {
                System.out.println("종료!");
                break;
            }
        }

    }
}
