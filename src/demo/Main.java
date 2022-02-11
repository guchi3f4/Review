package demo;

import entity.Member;
import service.MembarServiceImpl;

public class Main {

	public static void main(String[] args) {
		var service = new MembarServiceImpl();
		service.greet(0);
		var list = service.getAll();
		System.out.println(service.greet(1) + list.get(0).getName());
		
		for(Member m : list) {
			System.out.println(m);
		}
//		list.forEach((member) -> System.out.println(member));
//		list.forEach(System.out::println);
		
		System.out.println(service.sumOf(3, 5));
	}

}
