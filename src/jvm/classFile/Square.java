package jvm.classFile;
public class Square {
	private int length;
	private int width;
	private int area() {
		// TODO �Զ����ɵķ������
		return length * width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Square area=" + area();
	}

}
