import dao.Person;

public class bubbleSortPerson {

	public static void main(String[] args) {
		Person p1 = new Person("San", 30);
		Person p2 = new Person("Arun",  37);
		System.out.println(p1);
		
		if (p1.compareTo(p2) > 0) System.out.println(p2 + " older than " + p1);

	}
	/*
	public static void bubbleSortMethod() {
		int count = 0;
		int bubbleSortPosition = 0;
		int[] toBeSortedBubble = { 18, 302, 297, 23, 101, 78, 19, 30, 1, 22, 7, 0, 2, 4, 1, 32, 297 };
		do {
			for (bubbleSortPosition = 0; bubbleSortPosition < toBeSortedBubble.length - 1; bubbleSortPosition++) {
				if (toBeSortedBubble[bubbleSortPosition] > toBeSortedBubble[bubbleSortPosition + 1]) {
					int temp = toBeSortedBubble[bubbleSortPosition + 1];
					toBeSortedBubble[bubbleSortPosition + 1] = toBeSortedBubble[bubbleSortPosition];
					toBeSortedBubble[bubbleSortPosition] = temp;
				} 
			}
			count++;
		} while (count < toBeSortedBubble.length);
		
	}
	
	*/

	
}