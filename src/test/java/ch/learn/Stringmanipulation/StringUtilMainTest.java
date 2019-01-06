package ch.learn.Stringmanipulation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.learn.stringmanipulation.StringUtilMain;


public class StringUtilMainTest {
	
	@Test
	public void strconcatTest(){
		StringUtilMain utilMain = new StringUtilMain();
		assertEquals( "test1 test2", utilMain.strconcat("test1 ", "test2"));
	}

}
