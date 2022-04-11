/**
(Duplicate Elimination) Write a program that reads in a series of first
names and eliminates duplicates by storing them in a Set.
Allow the user to search for a first name.
*/

package ch16.ex16_10;

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateEliminator {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("Enter a first name, 'S' followed by a name to search for, or 'Q' to quit: ");

			String input = in.next();

			if (input.toUpperCase().equals("Q")){
				System.out.println("Names: " + names);
				break;
			}
			else if (input.toUpperCase().equals("S")){
				String name = in.next();
				System.out.println(name + (names.contains(name) ?
					" exists.": " does not existe."));
			}
			else {
				System.out.println(names.add(input) ? "Inserted" : "Already in set");
			}

		} while(in.hasNext());
	}
}

