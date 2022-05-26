package chapter2;

public class Training {
	public static void main(String... args){
		// int num;
		// num = 1;
		// System.out.println(num);


		// int num1 = 1;
		// int num2 = 1;
		// System.out.println(num1++); // 1
		// System.out.println(num1);   // 2
		
		// System.out.println(++num2); // 2
		// System.out.println(num2);   // 2

		// int num = 1;
		// boolean is_positive = num >= 0 ? true : false;

		// System.out.println(is_positive);


		// String message = "Hello" + " World";
		// message += " and Java!";
		
		// System.out.println(message);
		// int x = 15;

		// if (x % 2 == 0){
		// 	System.out.println("xは2の倍数");
		// } else if (x % 3 == 0){
		// 	System.out.println("xは3の倍数");
		// } else {
		// 	System.out.println("xは2または3の倍数ではありません");
		// }


		// int sum = 0;
		// for (int i = 1; i <= 10; i++){
		// 	System.out.println("i = "+i+" : "+(sum+=i));
		// }


		// int[] arr = {1, 2, 3, 4, 5};
		// for (int n : arr){
		// 	System.out.println(n);
		// }


		int sum = 0;
		for (int i = 1; i <= 10; i++){
			System.out.println("i = " + i + " : " + (sum+=i));
		}

		sum = 0;
		int i = 1;
		while (i <= 10){
			System.out.println("i = " + i + " : " + (sum+=i));
			i++;
		}

	}
}


