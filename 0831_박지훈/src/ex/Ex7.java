package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {
		// 랜덤 객체 생성
		Random rnd = new Random();

		// 중복 조건문을 작성하지 않고 
		// Set을 이용하여 중복이 발생하지 않도록 생성
		Set<Integer> set = new HashSet();
		
		// while문을 이용하여 set의 크기가 6까지 반복
		while(set.size()<6) {
			// lottoNum 변수 선언후 rnd 객체에 
			// 난수 발생 범위 1~45 대입
			int lottoNum = rnd.nextInt(45)+1;
			
			// 발생시킨 난수들을 set 안에 추가 
			set.add(lottoNum);
		} // while end
		
		// 인덱스가 없는 set 을사용하였기에 set 값을
		// 인덱스가 있는 동적배열(ArrayList) 선언 후
		// list 객체에 값을 대입
		List<Integer> list = new ArrayList(set);
		
		// 순서대로 정렬하기 위하여 Collection sort 사용
		// 순서대로 정렬 하지 않고 섞기 위해서는 Shuffle 사용
		Collections.sort(list);
		System.out.println("★2018년 9월 1일 로또1등 예측★");
		System.out.println(list);
		
		System.out.println("\n---------번호 섞기---------");
		// Shuffle을 이용하면 현재 저장된 값들을 섞는것이 가능하다.
		Collections.shuffle(list);
		System.out.println(list);
	}

}
