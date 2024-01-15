import java.util.Scanner;

public class Lab06_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int me;
		int com;
		int count=0;
		
		while(true) {
			count++;
			System.out.printf("게임 %d회 : 컴퓨터가 생각한 숫자는? ", count);
			com=(int)(Math.random()*5+1);
			me=s.nextInt();
			
			if (me!=com) {
				System.out.printf("아까워요. %d 였는데요. 다시 해보세요\n",com);
			}
			
			else{
				System.out.println("맞혔네요! 축하합니다!");
				System.out.println("게임을 마칩니다.");
				break;
		}

		}
		}
	}


