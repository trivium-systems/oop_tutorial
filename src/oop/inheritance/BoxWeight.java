package oop.inheritance;

public class BoxWeight extends Box{
	public double weight;


	BoxWeight(){
		super();
		this.weight = 1;
	}

	BoxWeight(int width, int height, int length, double weight) {
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

	BoxWeight(BoxWeight boxWeight, double weight){
		super(boxWeight);
		this.weight = weight;
	}

	public void display(){
		super.display();
		System.out.println("Weight is " + weight + "lb");
	}


	@Override
	public boolean equals(Object otherBox) {
		if(!super.equals(otherBox)) return false;
		if(otherBox instanceof BoxWeight otherBoxWeight){
			return this.weight == otherBoxWeight.weight;
		}
		return false;
	}
}
