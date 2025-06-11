package oop;


public class IdentifyMyParts {
	static int x = 10;
	int y;

	public static void main(String... args) {
		IdentifyMyParts idp1 =  new IdentifyMyParts();
		IdentifyMyParts idp2 = new IdentifyMyParts();

		idp1.y = 6;
		idp1.y = 7;

		idp1.x = 1;
		idp2.x = 2;

		System.out.println(idp1.x);
	}

}