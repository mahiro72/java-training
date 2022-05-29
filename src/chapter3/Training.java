package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Training {
	public static void main(String... arg){
		// short sNum = 100;
		// int iNum = sNum; //ワイドニングによる自動変換
		// // short -> int に変換
		// System.out.println(iNum);

		// String name = new String("hoge");
		// System.out.println(name); //hoge


		// Foo foo = new DefaultFoo("hello,java!");
		// System.out.println(foo.say());
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		// list.add(1); //コンパイルエラー
		String element = list.get(0);
		System.out.println(element);
	}
}
