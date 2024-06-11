package org.sai.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

@Service
public class Flames_service {

	public String falmes(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		ArrayList<Character> al = new ArrayList<Character>();
		for (Character c : s1.toCharArray()) {
			al.add(c);
		}
		ArrayList<Character> a2 = new ArrayList<Character>();
		for (Character c : s2.toCharArray()) {
			a2.add(c);
		}
		Iterator<Character> iterator = al.iterator();
		while (iterator.hasNext()) {
			Character c = iterator.next();
			if (a2.contains(c)) {
				iterator.remove(); // Removes from 'al'
				a2.remove(c); // Removes from 'a2'
			}
		}
//			System.out.println(al+ " "+a2);
		int count = al.size() + a2.size();
//			System.out.println(size);
		ArrayList<String> flmes = new ArrayList<String>();
		flmes.add("friend");
		flmes.add("Lover");
		flmes.add("Affection");
		flmes.add("Marriage");
		flmes.add("Enemy");
		flmes.add("Sibling");

		while (flmes.size() > 1) {
			int index = 0;
			int i = count % flmes.size();
			if (i != 0) {
				index = i - 1; // index start with zero. so take -1
				flmes.remove(index);
			} else {
				index = flmes.size() - 1;
				flmes.remove(index);
			}

		}
//			System.out.println(flmes);
		return flmes.get(0);

	}

}
