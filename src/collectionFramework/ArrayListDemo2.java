package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//another way of creating ArrayList
		List<Integer> in = new ArrayList<>();
		in.add(3);
		in.add(1);
		in.add(5);
		in.add(3);
		in.add(8);
		in.add(3);
		in.add(1);
		in.add(5);
		in.add(3);
		in.add(8);
		System.out.println("ArrayList: "+in);
		System.out.println("-----------------------------------------------------");
		
		List<Integer> in1 = new LinkedList<>();
		in1.add(3);
		in1.add(1);
		in1.add(5);
		in1.add(3);
		in1.add(8);
		in1.add(3);
		in1.add(1);
		in1.add(5);
		in1.add(3);
		in1.add(8);
		System.out.println("LinkedList: "+in1);
		System.out.println("-----------------------------------------------------");
		
		List<Integer> in2 = new Vector<>();
		in2.add(3);
		in2.add(1);
		in2.add(5);
		in2.add(3);
		in2.add(8);
		in2.add(3);
		in2.add(1);
		in2.add(5);
		in2.add(3);
		in2.add(8);
		System.out.println("Vector: "+in2);
		System.out.println("-----------------------------------------------------");
		
		List<Integer> in3 = new Stack<>();
		in3.add(3);
		in3.add(1);
		in3.add(5);
		in3.add(3);
		in3.add(8);
		in3.add(3);
		in3.add(1);
		in3.add(5);
		in3.add(3);
		in3.add(8);
		System.out.println("Stack: "+in3);
		System.out.println("-----------------------------------------------------");

	}

}
