/**
 * Objetivo: 16.13 (Eliminação de duplicatas) Escreva um programa que lê em uma série nomes e 
 * elimina duplicatas armazenando-os em um Set. Permita que o usuário procure um primeiro nome.
 * 
 * Autor: Gustavo Alves
 -------------------------------------------------------------------------------------------
 (Counting Duplicate Words) Write a program that determines and prints the number of duplicate
 words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation.
 */

package ch16.ex16_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminacaoDeDuplicatas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		//Favoring character sentinel vs control character (Ctl-Z, Ctl-D) as the latter is terminal-specific
		System.out.print("Enter a phrase or series of words, 'Q' to finalize: ");

		while (input.hasNext()){
			String word = input.next().toUpperCase();
			if (word.equals("Q")) break;
			list.add(word);
		}
		input.close();

		System.out.printf("%n%d duplicate words.", duplicates(list));
	}

	private static int duplicates(Collection<String> values) {
		Set<String> set = new HashSet<String>(values);
		return values.size() - set.size();
	}
}
