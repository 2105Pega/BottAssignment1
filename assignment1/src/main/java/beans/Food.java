package beans;

public class Food {

	private String name;
	private String color;
	private int size;

	public Food(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public Food() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "food [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

}
