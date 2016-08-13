package Queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by ishan on 6/8/2016.
 */
public class App {

	public static void main(String[] args) {
		// (head) <- oooooooooooooooooooooooooooooooo <- (tail) FIFO (first in, first out)

		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

		//System.out.println("Head of queue is: " + q1.element());

		q1.add(10);
		q1.add(20);
		q1.add(30);


		System.out.println("Head of queue is: " + q1.element());
		try{
			q1.add(40);
		} catch(IllegalStateException e){
			System.out.println("Tried adding too many items to queue.");
		}

		for(int x : q1)
			System.out.println("Queue value: " + x);

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		try{
			System.out.println("Removed from queue: " + q1.remove());
		} catch(NoSuchElementException e){
			System.out.println("Tried to remove too many items from queue.");
		}


		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);

		for(int x : q2)
			System.out.println(x);

	}
}
