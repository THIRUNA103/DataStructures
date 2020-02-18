
public class Lilnked1 {
	
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.display();
		l.reverse();
		System.out.println("After reverse");
		l.display();
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(l.head.obj  + "   " +l.head.next.obj);
		System.out.println("After reverse reverse");
		l.reverse1(l.head, null);
		l.display();
		
	}

}
