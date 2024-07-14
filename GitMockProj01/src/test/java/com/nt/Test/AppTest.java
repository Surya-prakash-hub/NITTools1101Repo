package com.nt.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arthimetic;

public class AppTest {

	
	
	@Test
	public void testWithPositives()
	{
		Arthimetic a=new Arthimetic();
		
		int expected=40;
		int actual=a.sum(20, 20);
		assertEquals(expected,actual);
		
	}
	@Test
	public void testWithNegative()
	{
		Arthimetic a=new Arthimetic();
		
		int expected=-40;
		int actual=a.sum(-20, -20);
		assertEquals(expected,actual);
		
	}
	@Test
	public void testWithZeros()
	{
		Arthimetic a=new Arthimetic();
		
		int expected=0;
		int actual=a.sum(0, 0);
		assertEquals(expected,actual);
		
	}
}
