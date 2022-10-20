import static org.junit.Assert.*;

import org.junit.Test;

public class MathLibTest {

	@Test
	public void Add_Zero_Zero() {
		MathLib obj = new MathLib();
		assert(0 == obj.Add(0, 0));
	}
	@Test
	public void Add_Double_Double() {
		MathLib obj = new MathLib();
		assert(1.2 == obj.Add(0.5, 0.7));
	}
	@Test
	public void testMul() {
		MathLib obj = new MathLib();
		assert(0.25 == obj.Mul(0.5, 0.5));
		assert(0 == obj.Mul(0, 0));
		assert(2.5 == obj.Mul(5, 0.5));
		assert(-0.25 == obj.Mul(-0.5, 0.5));
	}

}
