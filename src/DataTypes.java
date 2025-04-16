void main() {
	// 1. Integer types
	byte byteValue = 127;           // 1 byte: range from -128 to 127
	short shortValue = 32_000;      // 2 bytes: range from -32,768 to 32,767
	int intValue = 2_000_000_000;   // 4 bytes: range from -2^31 to 2^31-1
	long longValue = 9_000_000_000L;// 8 bytes: range from -2^63 to 2^63-1 (note the 'L' at the end)

	// 2. Floating point types
	float floatValue = 3.14f;       // 4 bytes: single-precision (note the 'f')
	double doubleValue = 3.1415926535; // 8 bytes: double-precision

	// 3. Character type
	char charValue = 'A';           // 2 bytes: stores a single 16-bit Unicode character

	// 4. Boolean type
	boolean isAlive = true;       // 1 bit: true or false
}
