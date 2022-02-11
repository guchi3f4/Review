package service;

import java.util.ArrayList;
import java.util.Arrays;

import entity.Member;

public class MembarServiceImpl implements MemberService {

	@Override
	public String greet(int i) {
		String[] greetings = {"おはよう", "こんにちは", "こんばんは"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		Member men1 = new Member(1, "太郎", "a@a");
		Member men2 = new Member(2, "次郎", "b@b");
		var list = new ArrayList<Member>(Arrays.asList(men1, men2));
//		list.add(men1);
//		list.add(men2);
		
		return list;
	}

	@Override
	public int sumOf(int a, int b) {
		int total = 0;
		for(; a <= b; ++a) {
			total += a;
		}
		return total;
	}
	
	

}
