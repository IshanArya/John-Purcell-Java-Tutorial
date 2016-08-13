package GenericsAndWildcards;

import java.util.ArrayList;

/**
 * Created by ishan on 3/25/2016.
 */
class Machine{
	@Override
	public String toString() {
		return "I am a machine.";
	}

	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	@Override
	public String toString() {
		return "I am a camera.";
	}

	public void snap(){
		System.out.println("Snap!");
	}
}
//I wonder what would happen
public class App {
	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		list1.add(new Camera());

		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
		showList2(list1);
		showList3(list1);
	}

	public static void showList(ArrayList<? extends Machine> list){
		for(Machine x : list){
			System.out.println(x);
			x.start();
			if(x instanceof Camera)
				((Camera) x).snap();
		}
	}

	public static void showList2(ArrayList<? super Camera> list){
		for(Object x : list){
			System.out.println(x);
			if(x instanceof Machine)
				((Machine) x).start();
			if(x instanceof Camera)
				((Camera) x).snap();
		}
	}
	public static void showList3(ArrayList<?> list){
		for(Object x : list){
			System.out.println(x);
			if(x instanceof Machine)
				((Machine) x).start();
			if(x instanceof Camera)
				((Camera) x).snap();
		}
	}
}
