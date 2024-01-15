import java.util.Scanner;

public class Lab05_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String me,com;
		System.out.print("나의 가위/바위/보==> ");
		me=s.next();
		
		String[] hands = {"가위","바위","보"};
		int rnd = (int)(Math.random()*hands.length); // 랜덤 값 추출 메서드 : Math.random() ,hands.length 는 hands 배열의 개수를 나타내므로 3 이며 따라서 rnd 값에 0,1,2 중 하나가 들어간다.
		com=hands[rnd];
		
		System.out.println("컴퓨터의 가위/바위/보==> "+com);
		
		if (me.equals("가위")) {
			if(com.equals("가위"))
				System.out.println("비겼습니다.");
			else if(com.equals("바위"))
				System.out.println("졌습니다.");
			else if(com.equals("보"))
				System.out.println("이겼습니다.");
		}
		else if(me.equals("바위")) {
			if(com.equals("가위"))
				System.out.println("이겼습니다.");
			else if(com.equals("바위"))
				System.out.println("비겼습니다.");
			else if(com.equals("보"))
				System.out.println("졌습니다.");
		}
		else if(me.equals("보")) {
			if(com.equals("가위"))
				System.out.println("졌습니다.");
			else if(com.equals("바위"))
				System.out.println("이겼습니다.");
			else if(com.equals("보"))
				System.out.println("비겼습니다.");
		}
		else {
			System.out.println("가위/바위/보 중 하나를 내세요.");
		}
		s.close();

	}

}
