package test.class2;

public class Circle {
	private int r;
	private double circum, area;
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	//���� ����
	public void calcArea() {
		area = Math.PI*Math.pow(r, 2);
	}
	//���� �ѷ�
	public void calcCircum() {
		circum = 2*Math.PI*r;
	}

}
