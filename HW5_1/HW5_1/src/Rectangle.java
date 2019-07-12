public class Rectangle {
	private int x1, x2, y1, y2;
	Rectangle() {
	
	}
	
	Rectangle(int x1, int y1, int x2, int y2) {

	}
	
	public void set(int x1, int y1, int x2, int y2) {

	}
	
	public int square() {
		int size = (x1-x2) * (y1-y2); // ���� ���
		if (size <0)
			size = -size; // ������ ������ ��� ����� ����� ��
		return size;
	}
	public void show() {
		System.out.print("�簢���� ��ǥ�� (");
		System.out.print(x1 + "," + y1 + "), (");
		System.out.println(x2 + "," + y2 + ")�Դϴ�.");
	}
	public boolean equals(Rectangle x) {
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1);; // x�� ���� ����
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this�� ���� ����
		int height1 = (x.y1>x.y2?(x.y1-x.y2):(x.y2-x.y1)); // x�� ���� ����
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this�� ���� ����
		if (width1 == width2 && height1 == height2)
			return true;
		return false;
	}
}
