package set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExample3 {
	public static void main(String[] args) {
		Set<Integer> treesetInt = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);

		treesetInt.add(10);
		treesetInt.add(10);
		treesetInt.add(9);
		treesetInt.add(12);
		treesetInt.add(5);

		System.out.println("Cac phan tu trong treesetInt: ");
		System.out.println(treesetInt);
		System.out.println();
		
		System.out.print("Nhap phan tu can them: ");
		int number = scanner.nextInt();

		if (treesetInt.contains(number)) {
			System.out.println("Phan tu da ton tai!");
		} else {
			treesetInt.add(number);
			System.out.println("Them thanh cong!");
			System.out.println("So phan tu trong treesetInt: " + treesetInt.size());
		}
		System.out.println();
		
		System.out.println("Cac phan tu trong treesetInt: ");
		System.out.println(treesetInt);
	}
}
