package es;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;


public class HelloWorldTest {

	@Test
	public void test() {
		assertNotNull(HelloWorld.teste());
	}
	
	
	@Test
	public void testMain() {
		HelloWorld.main(null);
	}
	
	
	@Test
	public void testIntance() {
		assertNotNull(new HelloWorld().testIntance());
	}
}
