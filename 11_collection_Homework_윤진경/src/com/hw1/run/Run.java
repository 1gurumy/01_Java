package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {
	
public static void main(String[] args) {
	
		
	
		// Friend 객체만 넣을 수 있는 ArrayList 객체 생성
		List<Friend> friendlist = new ArrayList<>();
		// Friend 객체 타입을 담을 수 있는 List를 생성하고, 이 List는 ArraysList로 초기화하겠다.
	
		// 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		friendlist.add(new Friend("짱구"));
		friendlist.add(new Friend("철수"));
		friendlist.add(new Friend("유리"));
		friendlist.add(new Friend("훈이"));
		friendlist.add(new Friend("맹구"));
		
		//List에서 다섯 객체 중 랜덤으로 하나를 뽑아
		Random random = new Random();	
		int randomIndex = random.nextInt(friendlist.size()); // 0부터 리스트 크기-1까지의 랜덤 인덱스 생성
		Friend randomFriend = friendlist.get(randomIndex); // 해당 인덱스의 객체를 뽑기
			
	
		randomFriend.pickLeader();
	
}
}
