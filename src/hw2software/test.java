package hw2software;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/*import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;*/
 public class test {

@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	public void testadd() {
		//fail("Not yet implemented");
		model m = new model();
		m.setoper(1);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(16,16);
	}
	@Test
	public void testsub() {
		model m=new  model();
		m.setoper(2);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(8,8);
		
	}

	@Test
	public void testdiv() {
		model m=new  model();
		m.setoper(5);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(3,3);
		
	}

	@Test
	public void testmodule() {
		model m=new  model();
		m.setoper(6);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(0,0);
		
	}


}
