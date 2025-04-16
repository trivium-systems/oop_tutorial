void main(String[] args) {

	// 1. Arithmetic Operators
	int a = 10;
	int b = 3;
	float c = 3.0f;

	println("=== Arithmetic Operators ===");
	println("a + b = " + (a + b)); // Addition
	println("a - b = " + (a - b)); // Subtraction
	println("a * b = " + (a * b)); // Multiplication
	println("a / b = " + (a / b)); // Integer Division
	println("a / c = " + (a / c)); // Float Division
	println("a % b = " + (a % b)); // Modulus (remainder)

	// 2. Relational (Comparison) Operators
	println("\n=== Relational Operators ===");
	println("a == b : " + (a == b)); // Equal to
	println("a != b : " + (a != b)); // Not equal to
	println("a > b  : " + (a > b));  // Greater than
	println("a < b  : " + (a < b));  // Less than
	println("a >= b : " + (a >= b)); // Greater than or equal to
	println("a <= b : " + (a <= b)); // Less than or equal to

	// 3. Logical Operators
	boolean x = true;
	boolean y = false;

	println("\n=== Logical Operators ===");
	println("x && y : " + (x && y)); // Logical AND
	println("x || y : " + (x || y)); // Logical OR
	println("!x     : " + (!x));     // Logical NOT

	// 4. Assignment Operators
	int value = 10;

	println("\n=== Assignment Operators ===");
	value += 5; // Equivalent to: value = value + 5
	println("value += 5: " + value);

	value *= 2; // Equivalent to: value = value * 2
	println("value *= 2: " + value);

	value -= 4; // Equivalent to: value = value - 4
	println("value -= 4: " + value);

	value /= 2; // Equivalent to: value = value / 2
	println("value /= 2: " + value);

	value %= 3; // Equivalent to: value = value % 3
	println("value %= 3: " + value);

	// 5. Unary Operators
	int num = 5;
	println("\n=== Unary Operators ===");
	println("num = " + num);
	println("++num = " + (++num)); // Pre-increment: increment, then return
	println("num++ = " + (num++)); // Post-increment: return, then increment
	println("After num++: " + num);
	println("--num = " + (--num)); // Pre-decrement
	println("num-- = " + (num--)); // Post-decrement
	println("After num--: " + num);
	println("-num = " + (-num));   // Unary minus
	println("+num = " + (+num));   // Unary plus (does nothing here)

	// 6. Ternary Operator
	int age = 18;
	String result = (age >= 18) ? "Adult" : "Minor"; // condition ? true : false

	println("\n=== Ternary Operator ===");
	println("age = " + age);
	println("Status: " + result);
}