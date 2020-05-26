package es;

import static org.junit.Assert.*;

import org.junit.Test;

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
