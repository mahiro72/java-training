package chapter3;


public class Training2 {
	public static void main(String... arg){
		GenericStack<String> stringStack = new GenericStack<>();

		stringStack.push("hello");
		stringStack.push("world");
		stringStack.push("java");
		// stringStack.push(1);; //コンパイルエラー

		String stringElement = stringStack.pop(); //キャストいらない

		if (stringElement != null){
			System.out.println(stringElement); //java
		}



		GenericStack<Integer> integerStack = new GenericStack<>();

		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		// integerStack.push("hello");//コンパイルエラー

		Integer integerElement = integerStack.pop(); //キャストいらない

		if (integerElement != null){
			System.out.println(integerElement); //3
		}

	}
}
