package caliculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areas area = new Areas();
		Operations op = new Operations();
		SimpleIntrest si = new SimpleIntrest();
		area.circle(10);
		area.rectangle(2, 3);
		area.triangle(3, 4);
		si.calculate_intrest(2, 4, 5);
		op.add(2, 3);
		op.sub(10, 8);
		op.div(9, 3);
		op.mul(3, 6);
	}
}