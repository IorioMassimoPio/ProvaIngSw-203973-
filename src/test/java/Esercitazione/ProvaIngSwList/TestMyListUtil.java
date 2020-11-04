package Esercitazione.ProvaIngSwList;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyListUtil {
	
	public static MyListUtil mylist;
	
	@BeforeClass
	public static void prepare() {
		mylist = new MyListUtil();
	}
	
	@Before
	public void pre_test() {
		System.out.println("sto per eseguire un test");
	}
	
	@Test
	public void ordinaCrescenteWorks() {
		List<Integer> l = new ArrayList<Integer>();
    	l.add(7);
    	l.add(3);
    	l.add(9);
    	l.add(2);
    	l.add(5);
    	l.add(1);
		assertEquals(Arrays.asList(1, 2, 3, 5, 7, 9), mylist.ordina(l, "crescente"));
	}
	
	@Test
	public void ordinaDecrescenteWorks() {
		List<Integer> l = new ArrayList<Integer>();
    	l.add(7);
    	l.add(3);
    	l.add(9);
    	l.add(2);
    	l.add(5);
    	l.add(21);
		assertEquals(Arrays.asList(21, 9, 7, 5, 3, 2), mylist.ordina(l, "decrescente"));
	}
}
