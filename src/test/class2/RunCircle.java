package test.class2;

public class RunCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setR(7);
		c2.setR(25);
		
		c1.calcCircum();
		c1.calcArea();
	
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c1.getR(), c1.getCircum());
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c1.getR(), c1.getArea());
		
		c2.calcCircum();
		c2.calcArea();
		
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c2.getR(), c2.getCircum());
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c2.getR(), c2.getArea());

	}

}
