package LambaExpressions;

/**
 * Created by ishan on 6/16/2016.
 */

interface Execute{
	void execute(int a);
}

interface ExecuteA{
	void execute(int a);
}

class Running{
	void run(Execute e){
		System.out.println("Running...");
		e.execute(13);
	}

	void run(ExecuteA e){
		System.out.println("Running 2....");
		e.execute(14);
	}
}

public class Trial {
	public static void main(String[] args) {
		Running r = new Running();

		r.run((ExecuteA) e -> System.out.println("I like pie."));
	}
}
