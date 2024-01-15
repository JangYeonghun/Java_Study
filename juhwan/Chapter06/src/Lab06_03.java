
public class Lab06_03 {

	public static void main(String[] args) {
	
			int count=0;
			int dice1,dice2,dice3;
			
			while(true) {
				count++;
				dice1=(int)(Math.random()*6+1); //Math.random()은 0.0000~0.9999중 임의의 숫자를 반환하므로 6을 곱하면
				// 0.0000~5.9999이며, 여기에 1을 더하고 정수로 변경하면 주사위의 숫자 1~6 중 하나가 된다.
				dice2=(int)(Math.random()*6+1);
				dice3=(int)(Math.random()*6+1);
				
				if ((dice1==dice2)&&(dice2==dice3))
					break;
			}

				System.out.printf("3개의 주사위는 모두 %d 입니다.\n",dice1);
				System.out.printf("같은 숫자가 나올때까지 %d 번 던졌습니다.",count);
	}

}
