package chapter2;

class Student{
	String name;
	int score;
	static final int MAX_SCORE = 100;

	// コンストラクタ
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}

	// scoreがない場合のコンストラクタ
	Student(String name){
		this(name, 0);
	}

	void addScore(int x){
		this.score += x;
	}

	// オーバーロード
	void addScore(){
		this.score += 1;
	}

	// 1つのフィールドに対する値の取得を行うシンプルなメソッドを
	// getter(ゲッター)という
	String getName(){
		// return this.name;
		return name;
	}

	// 1つのフィールドに対する値の設定を行うシンプルなメソッドを
	// setter(セッター)という
	void setName(String name){
		this.name = name;
	}

	void printScore(){
		System.out.println(this.name+"のscoreは"+this.score);
	}
	
}

public class Training2 {
	public static void main(String... args){
		Student hoge = new Student("hoge",80);
		Student heno = new Student("heno");

		hoge.printScore();
		heno.printScore();

		System.out.println(hoge.getName());
		hoge.setName("hoge2");
		System.out.println(hoge.getName());

		hoge.addScore(); // +1
		hoge.printScore();
		hoge.addScore(5); // +5
		hoge.printScore();
	}
}

