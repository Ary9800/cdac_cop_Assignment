import java.util.Scanner;

public class ArrayMenu {

	public static void main(String[] args) {
		System.out.println("1.read array 2.print array 3.Search element in array 4.reverse array 5.even number from array 6.sum of array element");
		int size = 0, choice, i = 0, element;
		int[] array;
		System.out.println("size of array:");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size];
		do {
			System.out.println("enter the choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (i = 0; i < array.length; i++) {
					array[i] = sc.nextInt();
				}
				break;
		
			case 2:
				System.out.println("the element of array are:");
				for(i=0; i<array.length; i++) {
				System.out.print(+ array[i] + " ");
				}
				break;
			case 3:
				System.out.println("enter the element to search:");
				element = sc.nextInt();
				boolean flag = false;
				for (i = 0; i < array.length; i++) {
					if (array[i] == element) {
						flag=true;
						break;
					
					}
					if(flag=true)
					{
						System.out.println("element" + element + "are present");
					} 
					else {
						System.out.println("element" + element + "not present");
					
					break;
					}
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("invalid input");
				break;
			}
		} while (choice != 7);
		System.out.println("thank you");
	}

	// TODO Auto-generated method stub
}
