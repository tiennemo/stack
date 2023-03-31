package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

		public class MainApp {
		public static void main(String[] args) {
		// Hàng đợi
			Queue<Integer> queue = new LinkedList<Integer>();
			Stack<Integer> stack = new Stack<>();
			Queue<Integer> queue1 = new LinkedList<Integer>();
			queue.add(10);
			queue.add(40);
			queue.add(30);
			queue.add(100);

			System.out.println("hang doi sau khi them " + queue);
			// dao nguoc hang doi
			while (queue.size() > 0) {
				stack.push(queue.remove());
 	}
			while (stack.size() > 0) {
				queue1.add(stack.pop());
			}
 	System.out.println("hang doi sau khi dao nguoc" + queue1);

 }
}