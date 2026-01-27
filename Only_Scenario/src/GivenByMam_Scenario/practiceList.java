package GivenByMam_Scenario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class practiceList {

	public static void main(String[] args) {
		
		Set<String> linkedSet=new LinkedHashSet<String>();
		linkedSet.add("3425tw");
		linkedSet.add("qrew");
		linkedSet.add("jkrqwhrhh");
		linkedSet.add("ewqrq");
		linkedSet.add("q45tgwe");
		linkedSet.remove(linkedSet);
		
		
		
		
		
		
		
		
		
		
		
		
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("kljjds");
		tree.add("lkkkkkb");
		tree.add("asada");
		tree.add("wrewre");
		tree.add("uyt");
		tree.add("werttr");
		tree.add("dfhhgr");
		tree.add("bvc");
		tree.add("rew");
		String ar=tree.getFirst();
		System.out.println(ar);
		System.out.println();


		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(123);
		hash.add(768);
		hash.add(698);
		hash.add(34785);
		hash.add(678);
		hash.add(43222);
		hash.add(87654);
		hash.add(456);
		hash.add(34457);
		for(int All_num :hash) {
			System.out.println(All_num);
		}




		LinkedList<String> linked=new LinkedList<String>();
		linked.add("ram");
		linked.add("ad");
		linked.add("sfasdfa");
		linked.add("afsrdsfd");
		linked.add("rerere");
		linked.add("piudsj");

		for(String Name:linked) {      /// it is process of foreach Loop 
			System.out.println(Name);
		}



		//
		//		ArrayList<String> arr=new ArrayList<String>();
		//		arr.add("vimal");
		//		arr.add("vikash");
		//		arr.add("ram");
		//		arr.add("22344");



	}
}
