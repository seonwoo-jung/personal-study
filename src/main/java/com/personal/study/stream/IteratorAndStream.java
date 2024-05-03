package com.personal.study.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorAndStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");

		// 1. Iterator 사용
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("================");

		// 2. stream forEach 사용
		list.stream().forEach(name -> System.out.println(name));
	}
}
