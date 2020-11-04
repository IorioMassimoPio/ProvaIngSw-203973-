package Esercitazione.ProvaIngSwList;

import java.util.Collections;
import java.util.List;

public class MyListUtil {

	public List<Integer> ordina(List<Integer> l, String s) {
		if(s.equals("crescente"))
			return ordinaCrescente(l);
		else
			return ordinaDecrescente(l);
	}	
	
	private List<Integer> ordinaCrescente(List<Integer> l) {
		Collections.sort(l);
		return l;
	}
	
	private List<Integer> ordinaDecrescente(List<Integer> l) {
		Collections.sort(l);
		Collections.reverse(l);
		return l;
	}
}
