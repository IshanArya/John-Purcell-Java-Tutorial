package LambaExpressions;

/**
 * Created by ishan on 6/16/2016.
 */

interface Executable{
	int execute(int a, int b);
}

interface StringExecutable{
	int execute(String s);
}

class Runner{
	public void run(Executable e){
		System.out.println("Executing code block...");
		System.out.println("Return value is: " + e.execute(13, 20));
	}

	public void run(StringExecutable se){
		System.out.println();
	}
}

public class App {
	public static void main(String[] args) {
		int c = 100;

		int d = 130;
		// Mustn't do this: c = 8;
		Runner runner = new Runner();
		runner.run(new Executable(){

			public int execute(int a, int b){
				System.out.println("Hello there!");
				//Can do this in methods of anonymous classes: int d = 8;
				return a + b + c;
			}
		});

		System.out.println("============================================");

		runner.run((a, b) -> {
			return 1 + a + b + c;
			//int d = 8;
		});

		System.out.println("============================================");

		Executable ex = (a, b) -> {
			return 1 + a + b + c;
			//int d = 8;
		};

		runner.run(ex);

		Object codeblock = (Executable)(a, b) -> {
			return 1 + a + b + c;
			//int d = 8;
		};


	}
}
