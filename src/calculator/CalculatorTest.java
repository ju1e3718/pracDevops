package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calc;

	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}

	@Test
	void testAddIntInt() {
		assertEquals(10, calc.add(3, 7));
	} // 두 정수를 매개변수로 받아 덧셈을 수행하고 반환

	@Test
	void testAddStringString() {
		assertEquals("apple", calc.add("app", "le"));
	}

}
