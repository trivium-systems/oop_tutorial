package oop;

public class Sample {
	// fields/data
	static int count;
	private String name;
	private int age;

	// Methods
		// Constructor

		Sample(){
			this.name = null;
			this.age = 0;
			count++;
		}

		Sample(String name){
			this.name = name;
			count++;
		}


		Sample(String name, int age){
			this.name = name;
			this.age = age;
			count++;
		}



		// Setters
		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		// Getters
		public String getName() {
			return name;
		}

		public int getAge(){
			return age;
		}

		// Static methods

		static void printCount(){
			System.out.println(count);
		}


		// Instance methods

		int incrementAge(){
			age++;
			return age;
		}

		int incrementAge(int increment){
			age += increment;
			return age;
		}

		int incrementAge(String increment){
			age += Integer.parseInt(increment);
			return age;
		}

}

