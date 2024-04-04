import java.util.Scanner;

// 영화를 나타내는 Movie 클래스를 정의한다.
// 사용자로부터 감명 깊게 본 영화의 제목과 감독을 입력받아서 Movie 객체 배열에 저장하고 다시 출력하는 프로그램을 작성한다.
/*
실행 결과
영화제목: 에어리언 2
영화감독: 제임스 카메론
영화제목: 티파니에서 아침을
영화감독: 에드워드 블레이크
{ 에이리언 2, 제임스 카메론 } { 티파니에서 아침을, 에드워드 블레이크 }
 */
class Movie {
    String title, director;

    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 생성자, 매개변수, 참조변수(필드와 생성자를 참조)
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // toString() 메소드 오버라이드
    @Override
    public String toString() {
        return "{ " + title + ", " + director + " }";
    }
}

public class MovieArrayTest {
    public static void main(String[] args) {
        // Movie라는 객체를 참조하는 배열 생성
        Movie[] movieList = new Movie[2];

        // Scanner 클래스, sc 오브젝트 생성, new Scanner 생성자
        Scanner sc = new Scanner(System.in);

        // sc는 오브젝트 사용했으니 인스턴스, nextLine은 메소드(인스턴스 메소드)
        for (int i = 0; i < movieList.length; i++) {
            System.out.print("영화제목: ");
            String title = sc.nextLine();
            System.out.print("영화감독: ");
            String director = sc.nextLine();

            movieList[i] = new Movie(title, director);
        }

        // Movie movie는 루프를 돌릴 객체의 자료형과 일치해야함, movieList는 루프를 돌릴 객체
        for (Movie movie : movieList) {
            System.out.print(movie); // 수정: Movie 객체의 toString() 메소드 호출
        }

        sc.close(); // Scanner 객체를 사용한 후에는 리소스 누수를 방지하기 위해 닫아주는 것이 좋습니다.
    }
}

