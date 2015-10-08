package homework;

/**
 * 设计一个矩形类(Rectangle)，其数据成员包括长和宽，能计算矩形的面积。请在main函数中创建矩形对象，并使用它。
 * (请提供构造函数) 
 * @author Li Benhe
 * 
 */
public class Rectangle {

	private int rectangleLong;
	private int rectangleLongWide;

	public Rectangle() {
	}

	public Rectangle(int rectangleLong, int rectangleLongWide) {
		this.rectangleLong = rectangleLong;
		this.rectangleLongWide = rectangleLongWide;
	}

	public int getRectangleLong() {
		return rectangleLong;
	}

	public void setRectangleLong(int rectangleLong) {
		this.rectangleLong = rectangleLong;
	}

	public int getRectangleLongWide() {
		return rectangleLongWide;
	}

	public void setRectangleLongWide(int rectangleLongWide) {
		this.rectangleLongWide = rectangleLongWide;
	}

	public int area() {
		return this.rectangleLong * rectangleLongWide;
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setRectangleLong(20);
		rectangle.setRectangleLongWide(50);
		System.out.println("矩形面积为：" + rectangle.area());

	}
}
