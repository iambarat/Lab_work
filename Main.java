
import java.util.Scanner;

public class Main extends Add {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
		double x,y;
		System.out.println("Enter the numbers that you want to calculate: ");
		x = input.nextDouble();
		y = input.nextDouble();
		
		a.add(x, y);
		s.sub(x, y);
		m.mul(x, y);
		d.div(x, y);
		System.out.println(a.getadd());
		System.out.println(s.getsub());
		System.out.println(m.getmul());
		System.out.println(d.getdiv());
		input.close();
		
	}

}
