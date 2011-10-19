package ch.hszt.ple_rhu_she.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.hszt.ple_rhu_she.MdpJunitImplementation;

public class MdpJunitImplementationTest {
	
	private MdpJunitImplementation testInstance;
	private String emptyString;
	private String lowerCaseString;
	private String whiteSpaceString;
	private String[] stringArray;

	@Before
	public void setUp() throws Exception {
		
		testInstance = new MdpJunitImplementation();
		emptyString = "";
		lowerCaseString = "steve";
		whiteSpaceString = "Steve Heller Party";
		stringArray = new String[3];
		stringArray[0] = "Steve";
		stringArray[1] = "Delia";
		stringArray[2] = "Party";

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEmpty() {
		assertTrue(testInstance.isEmpty(emptyString));
	}

	@Test
	public void testCapitalize() {
		assertEquals(testInstance.capitalize(lowerCaseString), "Steve");
	}

	@Test
	public void testReverse() {
		assertEquals(testInstance.reverse(whiteSpaceString), "ytraP relleH evetS");
	}

	@Test
	public void testJoin() {
		assertEquals(testInstance.join(stringArray), "Steve Delia Party");
	}

}
