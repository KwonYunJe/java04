package makeClass;

import makeClass.Telephone;

import java.util.Scanner;

import makeClass.Dog;
import makeClass.TV;

public class MyRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Telephone p1 = new Telephone();
		Telephone p2 = new Telephone();
		Dog d1 = new Dog();
		TV t1 = new TV();
		
		p1.size = 11;
		p1.speaker = "Buy Banana";
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.call();
		
		p2.size = 5;
		p2.speaker = "Talk to me";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		System.out.println();
		
		d1.hugry =0;
		d1.play = 1;
		d1.sleep = 0;
		if(d1.hugry == 1) {
			System.out.println("Dog is full");
		}else {
			System.out.println("Dog is hungry");
		}
		if(d1.play == 1) {
			System.out.println("Dog is bored");
		}else {
			System.out.println("Dog want play!");
		}if(d1.sleep == 1) {
			System.out.println("Dog want sleep");
		}else {
			System.out.println("Dog not tired");
		}
		System.out.println();
		
		t1.channel = 32;
		t1.power = 1;
		t1.volume = 22;
		System.out.println("Now channel is " + t1.channel);
		if(t1.power == 1) {
			System.out.println("Turn on TV");
		}else {
			System.out.println("Turn off TV");
		}
		System.out.println("Now volume is " + t1.volume);
		
		
		
	}

}
