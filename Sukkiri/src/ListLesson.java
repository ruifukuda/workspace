import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListLesson {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Paul");
		names.add("Geoge");
		names.add("Ringo");
		System.out.println(names.size());//4
		System.out.println(names.get(1));//Paul
		names.remove("John");
		System.out.println(names.size());//3
		System.out.println(names.get(1));//Geoge
		names.remove(1);
		System.out.println(names.size());//2
		System.out.println(names.get(1));//Ringo
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		for(String name: names) {
			System.out.println(name);
		}
		
		List<Integer> nums = new ArrayList<>();
		/*
		 * Wrapper Class(ラッパークラス)
		 * int -> Integer
		 * double -> Double 
		 * boolean -> Boolean
		 * char -> Character
		 */
		nums.add(100);
		nums.add(200);
		for(int i : nums) {
			System.out.println(i);
		}
		List<Double> temps = new ArrayList<>();
		temps.add(21.4);
		temps.add(22.4);
		temps.add(24.4);
		for(double t : temps) {
			System.out.println(t);
		}
		List<Boolean> bools = new ArrayList<>();
		bools.add(true);
		bools.add(false);
		bools.add(false);
		for(boolean b: bools) {
			System.out.println(b);
		}
		List<Character> chars = new ArrayList<>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		for(char c : chars) {
			System.out.println(c);
		}
		List<Fruits> list = new ArrayList<>();
		list.add(new Fruits("バナナ",50));
		list.add(new Fruits("イチゴ",500));
		list.add(new Fruits("リンゴ",500));
		for(Fruits f: list) {
			System.out.println(f);
		}
//		先頭に挿入
		list.add(0, new Fruits("キウイ", 100));
		//先頭の要素を上書き
		list.set(0, new Fruits("メロン",800));
		if(list.isEmpty()) {
			System.out.println("リストは空です");
		}
		Fruits fruits = new Fruits("メロン",800);
		if(list.contains(fruits)) {
			System.out.println("含んでいます");
		}
		System.out.println(list.indexOf(fruits));
		Fruits removed = list.remove(0);
		System.out.println(removed);
		list.clear();
		System.out.println(list.size());//0
		
		List<String> sushi = new LinkedList<>();
		sushi.add("まぐろ");
		sushi.add("えび");
		sushi.add("サーモン");
		sushi.add("うに");
		sushi.add("まぐろ");
		sushi.add("えび");
		sushi.add("いくら");
		sushi.add("はまち");
		sushi.add("ほたて");
		System.out.println(sushi.size());
		for(String s :sushi) {
			System.out.println(s);
		}
	}
}

class Fruits{
	String name;
	int price;
	
	Fruits(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("フルーツ名:%s,価格:%d",this.name,this.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	/*
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj instanceof Fruits) {
			Fruits f = (Fruits)obj;
			if(f.name.equals(this.name) && f.price == this.price) {
				return true;
			}
		}
		return false;
	}
	*/
}
