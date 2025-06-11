package oop.inheritance;

public class BoxWeight extends Box{
	public double weight;


	BoxWeight(){
		super();
		this.weight = 1;
	}

	BoxWeight(int length, int width, int height, double weight) {
		super(length, width, height);
		this.weight = weight;
	}

	BoxWeight(BoxWeight boxWeight){
		super(boxWeight);
		this.weight = boxWeight.weight;
	}


	BoxWeight(int dimension){
		super(dimension);
		this.weight = 1;
	}


	public void display(){
		super.display();
		System.out.println("Weight is " + weight + "lb");
	}


	@Override
	public boolean equals(Object otherBox) {
		if(!super.equals(otherBox)) return false;
		if (this.getClass() != otherBox.getClass()) return false;
		BoxWeight otherBoxWeight = (BoxWeight) otherBox;
		return this.weight == otherBoxWeight.weight;
	}

	@Override
	public String toString() {
		return super.toString() + " weight= " + weight;
	}
}
