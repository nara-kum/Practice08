package com.javaex.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Friend> fr= new ArrayList<Friend>();
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<3; i++) {

			String info = sc.nextLine();
			String[] fArray = info.split(" "); 
			
			Friend frd = new Friend(fArray[0],fArray[1],fArray[2]);
			
			fr.add(frd);
		}
		
		for(int i=0; i<fr.size(); i++) {
			
			fr.get(i).showInfo();
		}
		
		sc.close();
		
	}

}