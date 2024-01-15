import java.util.Scanner;

public class EX04_01 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		Turtle turtle = new Turtle();
		
		double x,y;
		int tsize;
		String color;
		turtle.up();
		
		while(true) {
			System.out.print("X위치(-200~+200)==>");
			x=s.nextDouble();
			System.out.print("Y위치(-200~+200)==>");
			y=s.nextDouble();
			System.out.print("스탬프크기(1~100)==>");
			tsize=s.nextInt();
			System.out.print("스탬프색상(red,green,blue,black,yellow==>");
			color=s.next();
			
			turtle.setPosition(x, y);
			turtle.shapeSize(tsize, tsize);
			turtle.outlineColor(color);
			turtle.stamp();
			
			
		}

	}

}
