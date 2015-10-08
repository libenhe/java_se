package homework;

/**
 * 有两个箱子(Box)，其长、宽、高分别为：（1）12，20，25；（2）10，30，20。分别求他们的体积。
 * 编一个基于对象的程序，且定义两个构造函数，其中一个有参数，一个无参数。
 * 
 * @author Li Benhe
 * 
 */
public class Box {

	private int boxLong;
	private int boxWide;
	private int boxHeight;

	public Box() {

	}

	public Box(int boxLong, int boxWide, int boxHeight) {
		super();
		this.boxLong = boxLong;
		this.boxWide = boxWide;
		this.boxHeight = boxHeight;
	}

	public int getBoxLong() {
		return boxLong;
	}

	public void setBoxLong(int boxLong) {
		this.boxLong = boxLong;
	}

	public int getBoxWide() {
		return boxWide;
	}

	public void setBoxWide(int boxWide) {
		this.boxWide = boxWide;
	}

	public int getBoxHeight() {
		return boxHeight;
	}

	public void setBoxHeight(int boxHeight) {
		this.boxHeight = boxHeight;
	}

	public int volume() {
		return this.boxHeight * this.boxLong * this.boxWide;
	}

	public static void main(String[] args) {
		Box box3 = new Box();
		box3.setBoxHeight(12);
		Box box1 = new Box(12, 20, 25);
		Box box2 = new Box(10, 30, 20);
		System.out.println("第一个箱子体积为：" + box1.volume());
		System.out.println("第二个箱子体积为：" + box2.volume());
	}
}
