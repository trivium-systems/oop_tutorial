package oop.inheritance;


public class Box {
	private int length, width, height;

	Box() {
		this.length = -1;
		this.width = -1;
		this.height = -1;
	}

	Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	Box(int dimension) {
		this.length = dimension;
		this.width = dimension;
		this.height = dimension;
	}

	Box(Box box) {
		this.length = box.length;
		this.width = box.width;
		this.height = box.height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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


	public void display() {
		System.out.println("Length: " + length + " Width: " + width + " Height: " + height);
	}

	public int volume() {
		return length * width * height;
	}


	@Override
	public boolean equals(Box this, Object otherBox) {
		if (this == otherBox) return true;
		if (otherBox == null) return false;
		if (!(otherBox instanceof Box box)) return false;

		return (length == box.length) && (width == box.width) && (height == box.height);
	}


	@Override
	public String toString() {
		return "Box{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
	}
}
